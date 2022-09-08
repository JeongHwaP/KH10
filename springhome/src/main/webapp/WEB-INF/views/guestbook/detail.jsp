<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.no}번 방명록</title>
</head>
<body>

	<div align="center">
		<h1>${dto.no}번 방명록 보기</h1>
		
		<table border="1" width="400">
			<tbody>
				<tr>
					<th width="25%">작성자</th>
					<td>${dto.name}</td>
				</tr>
				<tr height="250" valign="top">
					<th>내용</th>
					<td>${dto.memo}</td>
				</tr>
			</tbody>
		</table>		
		
		<h2><a href="list">목록 보기</a></h2>
		<h2><a href="insert">새로 작성하기</a></h2>
		<h2><a href="edit?no=${dto.no}">수정하기</a></h2>
		<h2><a href="delete?no=${dto.no}">삭제</a></h2>
		
	</div>

</body>
</html>
