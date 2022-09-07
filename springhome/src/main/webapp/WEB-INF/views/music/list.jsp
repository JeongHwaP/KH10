<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음원 목록</title>
</head>
<body>
	
	<div align="center">
		
		<!-- 제목 -->
		<h1>음원 목록</h1>
		
		<!-- 검색창 -->
		<form action="list" method="get">
			
			<!-- 항목 -->
			<select name="type" required>
				<!-- 
					보여지는 글자와 전송할 글자를 분리하여 작성
					value - 전송되는 값 
				-->
				<option value="music_title">제목</option>
				<option value="music_artist">가수</option>
				<option value="music_album">앨범</option>
			</select>
			
			<!-- 키워드 -->
			<input type="search" name="keyword" placeholder="검색어" required>
			
			<button>검색</button>
			
		</form>
		
		<hr>
		
		<!-- 목록 출력 -->
		<table border="1" width="700">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>가수</th>
					<th>앨범</th>
					<th>재생수</th>
					<th>발매일</th>
				</tr>
			</thead>
			<tbody align="center">
				<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.musicNo}</td>
					<td>
						${dto.musicTitle}
					</td>
					<td>${dto.musicArtist}</td>
					<td>${dto.musicAlbum}</td>
					<td>${dto.musicPlay}</td>
					<td>${dto.releaseTime}</td>
				</tr>
				</c:forEach>
			</tbody>
			<tfoot align="right">
				<tr>
					<td colspan="6">
						<a href="insert">등록</a>
					</td>
				</tr>
			</tfoot>
		</table>
		
	</div>
	
</body>
</html>