<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
	//목표 : .search-form 전송을 차단하고 신규 form을 만들어서 입력한것만 전송
	$(function(){
// 		$(".search-form").submit(function(e){
// 			e.preventDefault();//기본이벤트 차단
			
// 			//(1) 신규 form을 만들어서 복사한 뒤 신규 form을 전송
// 			var form = $("<form>").attr("method", "get");
			
// 			//<input type="hidden" name="no" value="1"> --> form
// 			var no = $(this).find("input[name=no]").val();
// 			if(no.length > 0){
// 				$("<input>").attr("type", "hidden").attr("name", "no").val(no)
// 																								.appendTo(form);
// 			}
			
// 			var name = $(this).find("input[name=name]").val();
// 			if(name.length > 0){
// 				$("<input>").attr("type", "hidden").attr("name", "name").val(name)
// 																								.appendTo(form);
// 			}
			
// 			$("body").append(form);
// 		});
		$(".search-form").submit(function(e){
			e.preventDefault();//기본이벤트 차단
			
			//(1) 신규 form을 만들어서 복사한 뒤 신규 form을 전송
			var form = $("<form>").attr("method", "get");
			
			$(this).find("input").each(function(){
				if($(this).attr("type") == "checkbox"){//체크박스라면
					if($(this).prop("checked")) {//체크된 경우만
						//복사하세요!
						//<input type="hidden" name="???" value="???">
						$("<input>").attr("type", "hidden")
											.attr("name", $(this).attr("name"))
											.val($(this).val())
											.appendTo(form);
					}
				}
				else {//체크박스가 아니라면(일반 입력창이라면)
					var value = $(this).val();
					if(value.length > 0) {//입력이 된 경우
						//복사하세요!
						//<input type="hidden" name="???" value="???">
						$("<input>").attr("type", "hidden")
											.attr("name", $(this).attr("name"))
											.val($(this).val())
											.appendTo(form);
					}
				}
			});
			
			$("body").append(form);//화면에 추가
			form.submit();//전송
		});
	});
</script>
    
<h1>복합 검색 예제</h1>

<!-- 검색창 -->
<form method="get" autocomplete="off" class="search-form">
	번호 : <input type="text" name="no"><br><br>
	이름 : <input type="text" name="name"><br><br>
	분류 : 
	<label><input type="checkbox" name="type" value="과자">과자</label>
	<label><input type="checkbox" name="type" value="사탕">사탕</label>
	<label><input type="checkbox" name="type" value="주류">주류</label>
	<label><input type="checkbox" name="type" value="아이스크림">아이스크림</label>
	<br><br>
	가격 : <input type="text" name="minPrice"> 
				~ <input type="text" name="maxPrice">
	<br><br>
	제조일 : <input type="text" name="beginMade"> 
				~ <input type="text" name="endMade">
	<br><br>
	<button type="submit">검색</button>
</form>

<!-- 결과화면 -->