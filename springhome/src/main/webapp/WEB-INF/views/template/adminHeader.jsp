<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="${param.title}" name="title"/>
</jsp:include>

<!-- 관리자 메뉴 추가 -->
<div>
	<a href="/member/list">회원목록</a>
	<a href="/admin/pocketmon">포켓몬 현황</a>
	<a href="#">메뉴2</a>
	<a href="#">메뉴3</a>
	<a href="#">메뉴4</a>
</div>
<hr>