<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/adminHeader.jsp">
	<jsp:param value="인기 음원 Top ${list.size()}" name="title"/>
</jsp:include>

<h1>인기 음원 Top ${list.size()}</h1>

<a href="/admin/music/play/3">Top 3</a>
<a href="/admin/music/play/5">Top 5</a>
<a href="/admin/music/play/10">Top 10</a>
<a href="/admin/music/play/20">Top 20</a>

<table border="1" width="600">
	<thead>
		<tr>
			<th>순위</th>
			<th>제목</th>
			<th>가수</th>
			<th>앨범</th>
			<th>재생수</th>
		</tr>	
	</thead>
	<tbody align="center">
		<c:forEach var="musicDto" items="${list}" varStatus="status">
		<tr>
			<td>${status.count}</td>
			<td>${musicDto.musicTitle}</td>
			<td>${musicDto.musicArtist}</td>
			<td>${musicDto.musicAlbum}</td>
			<td>${musicDto.musicPlay}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>
