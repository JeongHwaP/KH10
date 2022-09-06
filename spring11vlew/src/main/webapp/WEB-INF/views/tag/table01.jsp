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
<!-- 	<h1>통신사 요금제 정보</h1> -->
<!-- 	<table border="1" width="500"> -->
<!-- 	 	<thead> -->
<!-- 	 		<tr> -->
<!-- 	 			<th>통신사</th> -->
<!-- 	 			<th>상품명</th> -->
<!-- 	 			<th>월정액</th> -->
<!-- 	 			<th>데이터(GB)</th> -->
<!-- 	 			<th>통화(분)</th> -->
<!-- 	 			<th>문자(건)</th> -->
<!-- 	 		</tr> -->
<!-- 	 	</thead> -->
<!-- 	 	<tbody> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>SK</td> -->
<!-- 	 			<td>5G언택트 52</td> -->
<!-- 	 			<td>52000</td> -->
<!-- 	 			<td>200</td> -->
<!-- 	 			<td>1000</td> -->
<!-- 	 			<td>2000</td> -->
<!-- 	 		</tr> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>KT</td> -->
<!-- 	 			<td>5G세이브</td> -->
<!-- 	 			<td>45000</td> -->
<!-- 	 			<td>100</td> -->
<!-- 	 			<td>900</td> -->
<!-- 	 			<td>1500</td> -->
<!-- 	 		</tr> -->
<!-- 	 		<tr> -->
<!-- 	 			<td>LG</td> -->
<!-- 	 			<td>5G시그니처</td> -->
<!-- 	 			<td>130000</td> -->
<!-- 	 			<td>500</td> -->
<!-- 	 			<td>2000</td> -->
<!-- 	 			<td>2500</td> -->
<!-- 	 		</tr> -->
<!-- 	 	</tbody> -->
<!-- 	 	<tfoot> -->
<!-- 	 		<tr> -->
<!-- 	 			
<!-- 	 				칸을 원하는 방향으로 늘릴 수 있다. -->
<!-- 	 				- colspan은 우측으로 늘리고 -->
<!-- 	 				- rowspan은 하단으로 늘린다. -->
<!-- 	 			 --> 
<!-- 	 			<td colspan="6"" align="center"> -->
<!-- 	 			총 3개의 요금제가 있습니다.</td> -->
<!-- 	 		</tr> -->
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
<title>테이블 1번 과제</title>
</head>
<body>

	<div align="center">
		<h1>통신사 요금제 정보</h1>
		
		<table border="1" width="600">
			<thead>
				<tr>
					<th>통신사</th>
					<th>상품명</th>
					<th>월정액</th>
					<th>데이터(GB)</th>
					<th>통화(분)</th>
					<th>문자(건)</th>
				</tr>
			</thead>
			<tbody align="center">
				<tr>
					<td>SK</td>
					<td align="left">5G언택트 52</td>
					<td align="right">52000</td>
					<td>200</td>
					<td>1000</td>
					<td>2000</td>
				</tr>
				<tr>
					<td>KT</td>
					<td align="left">5G세이브</td>
					<td align="right">45000</td>
					<td>100</td>
					<td>900</td>
					<td>1500</td>
				</tr>
				<tr>
					<td>LG</td>
					<td align="left">5G시그니처</td>
					<td align="right">130000</td>
					<td>500</td>
					<td>2000</td>
					<td>2500</td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<!-- 
						칸을 원하는 방향으로 늘릴 수 있다
						- colspan은 우측으로 늘리고
						- rowspan은 하단으로 늘린다 
					-->
					<td colspan="6" align="center">
						총 3개의 요금제가 있습니다
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
	
	
</body>
</html>