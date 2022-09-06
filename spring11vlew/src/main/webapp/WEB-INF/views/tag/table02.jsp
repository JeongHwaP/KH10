<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Insert title here</title> -->
<!-- <style> -->
<!-- /* td{text-align:center;} */ -->
<!-- </style> -->
<!-- </head> -->
<!-- <body> -->
<!-- <h1>역대 한국인 올림픽 메달 보유 선수</h1> -->
<!-- 	<table border="1" width="500"> -->
<!-- 	 	<thead> -->
<!-- 	 		<tr> -->
<!-- 	 			<th>이름</th> -->
<!-- 	 			<th>종목</th> -->
<!-- 	 			<th>구분</th> -->
<!-- 	 			<th>금메달</th> -->
<!-- 	 			<th>은메달</th> -->
<!-- 	 			<th>동메달</th> -->
<!-- 	 		</tr> -->
<!-- 	 	</thead> -->
<!-- 	 	<tbody> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>진종오</td> -->
<!-- 	 			<td>사격</td> -->
<!-- 	 			<td>하계</td> -->
<!-- 	 			<td>4</td> -->
<!-- 	 			<td>2</td> -->
<!-- 	 			<td>0</td> -->
<!-- 	 		</tr> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>김수녕</td> -->
<!-- 	 			<td>양궁</td> -->
<!-- 	 			<td>하계</td> -->
<!-- 	 			<td>4</td> -->
<!-- 	 			<td>1</td> -->
<!-- 	 			<td>1</td> -->
<!-- 	 		</tr> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>전이경</td> -->
<!-- 	 			<td>쇼트트랙</td> -->
<!-- 	 			<td>동계</td> -->
<!-- 	 			<td>4</td> -->
<!-- 	 			<td>0</td> -->
<!-- 	 			<td>1</td> -->
<!-- 	 		</tr> -->
<!-- 	 	</tbody> -->
<!-- 	 	<tfoot> -->
	 	
<!-- 	 	</tfoot> -->
<!--  	 </table> -->
<!-- </body> -->
<!-- </html> -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 2번 과제</title>
</head>
<body>
	
	<div align="center">
		
		<h1>역대 한국인 올림픽 메달 보유 선수</h1>
		
		<table border="1" width="600">
			<thead>
				<tr>
					<th rowspan="2" width="25%">이름</th>
					<th rowspan="2" width="25%">종목</th>
					<th rowspan="2" width="25%">구분</th>
					<th colspan="3" width="25%">메달</th>
				</tr>
				<tr>
					<th>금</th>
					<th>은</th>
					<th>동</th>
				</tr>
			</thead>
			<tbody align="center">
				<tr>
					<td>진종오</td>
					<td>사격</td>
					<td>하계</td>
					<td>4</td>
					<td>2</td>
					<td>0</td>
				</tr>
				<tr>
					<td>김수녕</td>
					<td>양궁</td>
					<td>하계</td>
					<td>4</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<tr>
					<td>전이경</td>
					<td>쇼트트랙</td>
					<td>동계</td>
					<td>4</td>
					<td>0</td>
					<td>1</td>
				</tr>
			</tbody>
			<tfoot align="center">
				<tr>
					<td colspan="3">합계</td>
					<td>16</td>
					<td>3</td>
					<td>2</td>
				</tr>
			</tfoot>
		</table>
		
	</div>
	
</body>
</html>
