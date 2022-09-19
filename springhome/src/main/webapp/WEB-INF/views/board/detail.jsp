<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="자유 게시판" name="title"/>
</jsp:include>

<h1>게시글 보기</h1>

<table border="1" width="500">
	<tbody>
		<tr>
			<th width="25%">번호</th>
			<td>${boardDto.boardNo}</td>
		</tr>
		<tr>
			<th>말머리</th>
			<td>${boardDto.boardHead}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${boardDto.boardTitle}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${boardDto.boardWriter}</td>
		</tr>
		<tr height="200" valign="top">
			<th>내용</th>
			<td>${boardDto.boardContent}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${boardDto.boardRead}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${boardDto.boardWritetime}</td>
		</tr>
		<tr>
			<th>수정일</th>
			<td>${boardDto.boardUpdatetime}</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2" align="right">
				<a href="write">글쓰기</a>
				<a href="#">수정하기</a>
				<a href="#">삭제하기</a>
				<a href="list">목록으로</a>
			</td>
		</tr>
	</tfoot>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
