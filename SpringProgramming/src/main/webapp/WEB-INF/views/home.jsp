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
		2. <a href="/myapp/exam01/join">컨트롤러 및 요청 매핑 메소드 작성</a><br/>
		3. <a href="/exam01/join">컨트롤러 및 요청 매핑 메소드 작성</a><br/> --%>
		<hr/>
		1. <a href="/myapp/exam01/index">Exam01</a>: 컨트롤러 및 요청 매핑 메소드 작성<br/>
		2. <a href="/myapp/exam02/index">Exam02</a>: 요청 파라미터 값 받기<br/> 
		3. <a href="/myapp/exam03/index">Exam03</a>: 폼 입력 값 받기<br/> 
	</body>
</html>