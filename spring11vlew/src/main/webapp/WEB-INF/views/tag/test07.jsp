<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 등록</title>
</head>
<body>
	<!-- 
		placeholder는 도움말을 작성하는 속성
		required는 필수입력 항목을 지정하는 속성
			- 이름과 값이 같은 속성은 이름만 적어도 효과를 인정
			- required, readonly, disabled, checked, selected,...
	 -->
	
	<h1>방명록 작성</h1>
	
	<form action="/guest-book/insert">
	<input name="name"placeholder="이름"required="required">
	<input name="memo"placeholder="메모"required="required">
	<button>작성</button>
	</form>
	
</body>
</html>