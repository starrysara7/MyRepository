<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html> <!-- 문서 유형 스타일 -->
<html>    <!-- root tag or root element -->
	<head>                           
		<meta charset = "UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			function test1(){
				//$("#div1")[0].innerHTML = "수정 내용";
				$("#div1").html("수정 내용");
			}
			function test2(){
				$("#div2").html("수정 내용");
				$(".div2").css("background-color", "gold");
			}
			
			function test3(){
				$("#img3").attr("src", "../common/image/impenguin.jpg");
			}
		</script>
	</head>

	<body>
		객체 찾기
		<hr/>
		<button onclick="test1()">버튼</button>
		<div id="div1">최초 내용</div>
		
		<button onclick="test2()">버튼</button>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
		
		<button onclick="test3()">버튼3</button>
		<img id="img3" src="../common/image/photo1.jpg" width="100px"/>
	</body>
	
</html>