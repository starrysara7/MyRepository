package com.mycompany.testfinal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.testfinal.dto.Order;
//명진
@Component
public class OrderDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//주문 삽입
	public int insertOrder(Order order) {
		String sql = "insert into order_total(ogid,ogtotalprice,ogtime,user_id,sid,oghowpay) values(seq_order_ogid.nextval,?,sysdate,?,?,?)";
		int row = jdbcTemplate.update(
				sql, 
				order.getOgtotalprice(),
				order.getUser_id(),
				order.getSid(),
				order.getOghowpay()
				);
		return row;
	}

	
	
	//1개 주문 검색
	public Order selectByOgid(int ogid) {
		String sql = "select ogid,ogtotalprice,ogtime,user_id,sid,oghowpay from order_total where ogid=?";
		List<Order> list = jdbcTemplate.query(sql, 
				new Object[] {ogid},
				new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int row) throws SQLException {
				Order order = new Order();
				order.setOgid(rs.getInt("ogid"));
				order.setOgtotalprice(rs.getInt("ogtotalprice"));
				order.setOgtime(rs.getDate("ogtime"));
				order.setUser_id(rs.getString("user_id"));
				order.setSid(rs.getString("sid"));
				order.setOghowpay(rs.getString("oghowpay"));

				return order;
			}

		});
		return (list.size() != 0) ? list.get(0) : null;
	}
	
	//기간 주문 검색
	public List<Order> selectByTerm(int pageNo, int rowsPerPage, Date term1, Date term2) {
		String sql ="";
		sql += "select rn, ogid, ogtotalprice, ogtime, user_id, sid, oghowpay ";
		sql += "from( ";
		sql += "select rownum as rn, ogid, ogtotalprice, ogtime, user_id, sid, oghowpay ";
		sql += "from(select ogid, ogtotalprice, ogtime, user_id, sid, oghowpay from order_total where ogtime between ? AND ? order by ogid desc) ";
		sql += "where rownum<=? ";
		sql += ") ";
		sql += "where rn>=? ";

		List<Order> list = jdbcTemplate.query(sql,
				new Object[] { term1, term2, (pageNo * rowsPerPage), ((pageNo - 1) * rowsPerPage + 1) }, new RowMapper<Order>() {

					@Override
					public Order mapRow(ResultSet rs, int row) throws SQLException {
						Order order = new Order();
						order.setOgid(rs.getInt("ogid"));
						order.setOgtotalprice(rs.getInt("ogtotalprice"));
						order.setOgtime(rs.getDate("ogtime"));
						order.setUser_id(rs.getString("user_id"));
						order.setSid(rs.getString("sid"));
						order.setOghowpay(rs.getString("oghowpay"));

						return order;
					}
				});

		return list;
	}
	
	//모든 주문 검색 페이지
	public List<Order> selectByPage(int pageNo, int rowsPerPage) {
		String sql ="";
		sql += "select rn, ogid, ogtotalprice, ogtime, user_id, sid, oghowpay ";
		sql += "from( ";
		sql += "select rownum as rn, ogid, ogtotalprice, ogtime, user_id, sid, oghowpay ";
		sql += "from(select ogid, ogtotalprice, ogtime, user_id, sid, oghowpay from order_total order by ogid desc) ";
		sql += "where rownum<=? ";
		sql += ") ";
		sql += "where rn>=? ";

		List<Order> list = jdbcTemplate.query(sql,
				new Object[] { (pageNo * rowsPerPage), ((pageNo - 1) * rowsPerPage + 1) }, new RowMapper<Order>() {

					@Override
					public Order mapRow(ResultSet rs, int row) throws SQLException {
						Order order = new Order();
						order.setOgid(rs.getInt("ogid"));
						order.setOgtotalprice(rs.getInt("ogtotalprice"));
						order.setOgtime(rs.getDate("ogtime"));
						order.setUser_id(rs.getString("user_id"));
						order.setSid(rs.getString("sid"));
						order.setOghowpay(rs.getString("oghowpay"));

						return order;
					}

				});

		return list;
	}
	
	//주문 삭제
	public int deleteOrder(int ogid) {
		String sql = "delete from order_total where ogid=?";
		int row = jdbcTemplate.update(sql, ogid);
		return row;
	}
	
	//주문 카운트
	public int countOrder() {
		String sql = "select count(*) from order_total";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);

		return count;
	}
	//------------------------------------------------------------------
}
