<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html> <%-- 문서유형선언 --%>
<html> <%-- root tag, root element --%>
	<head> 
		<meta charset="UTF-8">
	</head>
	
	<body> <%-- 브라우저에 나오는 부분 --%>
		SpringProgramming
		<%-- <a>: 클릭 가능 
		1. 절대 경로
		2. 현재 이 페이지가(home.jsp 즉, localhost:8080) 있는 경로와 동일함
		3. myapp/까지 생략된 것. => 상대경로
		<a href="http://localhost:8080/myapp/exam01/join"></a>:컨트롤러 및 요청 매핑 메소드 작성<br/> 
		4. <a href="/myapp/exam01/join">컨트롤러 및 요청 매핑 메소드 작성</a><br/>
		5. <a href="/exam01/join">컨트롤러 및 요청 매핑 메소드 작성</a><br/> --%>
		<hr/>
		1. <a href="/myapp/exam01/index">Exam01</a>: 컨트롤러 및 요청 매핑 메소드 작성<br/>
		2. <a href="/myapp/exam02/index">Exam02</a>: 요청 파라미터 값 받기<br/> 
		3. <a href="/myapp/exam03/index">Exam03</a>: 폼 입력 값 받기<br/> 
		4. <a href="/myapp/exam04/index">Exam04</a>: 요청 방식별 처리<br/> 
		5. <a href="/myapp/exam05/index">Exam05</a>: 요청 처리 메소드의 리턴 타입 <br/> 
		6. <a href="/myapp/exam06/index">Exam06</a>: 요청 처리 메소드의 매개변수 타입 <br/> 
		7. <a href="/myapp/exam07/index">Exam07</a>: 컨트롤에서 JSP로 데이터 객체 전달 <br/> 
		8. <a href="/myapp/exam08/index">Exam08</a>: 리다이렉트 <br/>
		
		<br/>
		
		9. <a href="/myapp/exam09/index">Exam09</a>: 의존성 주입(DI): XML 설정 파일 이용 <br/>
		10. <a href="/myapp/exam10/index">Exam10</a>: 의존성 주입(DI): 어노테이션 이용 <br/>
		
		<br/>
		
		11. <a href="/myapp/exam11/index">Exam11</a>: 서비스 계층과 데이터(퍼시스턴스) 계층 <br/>
		12. <a href="/myapp/exam12/index">Exam12</a>: 커넥션 풀 설정 <br/>
		13. <a href="/myapp/exam13/index">Exam13</a>: JdbcTemplate를 이용한 DAO <br/>
	
	</body>
</html>