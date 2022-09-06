<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>
	<div align="center">
		<h1>회원 목록</h1>
		
		<table border="1" width="500">
			<thead>
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>닉네임</th>
					<th>생년월일</th>
					<th>전화번호</th>
					<th>이메일</th>
					<th>우편번호</th>
					<th>기본주소</th>
					<th>상세주소</th>
					<th>포인트</th>
					<th>등급</th>
					<th>가입일시</th>
					<th>접속일시</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.memberId}</td>
					<td>${dto.memberPw}</td>
					<td>${dto.memberNick}</td>
					<td>${dto.memberBirth}</td>
					<td>${dto.memberTel}</td>
					<td>${dto.memberEmail}</td>
					<td>${dto.memberPost}</td>
					<td>${dto.memberBaseAddress}</td>
					<td>${dto.memberDetailAddress}</td>
					<td>${dto.memberPoint}</td>
					<td>${dto.memberGrade}</td>
					<td>${dto.memberJoin}</td>
					<td>${dto.memberLogin}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
