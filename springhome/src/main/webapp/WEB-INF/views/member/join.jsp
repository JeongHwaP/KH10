<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp">
	<jsp:param value="회원 가입" name="title"/>
</jsp:include>

<style>
.progressbar {
    height:10px;
    width:100%;
    overflow: hidden;/* 넘어갈 경우에 대한 처리*/
    position:relative;
}
.progressbar > .inner {
    position: absolute;
    top:0;
    left:0;
    bottom:0;
    width:0%;
    background: rgb(131,58,180);
    background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(253,29,29,1) 50%, rgba(252,176,69,1) 100%);
    transition: width 0.2s linear;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script src="/js/member-join.js"></script>

<form action="join" method="post" enctype="multipart/form-data">

<div class="container-600">
	<div class="row">
		<h1>회원 가입</h1>
	</div>
	
	<div class="row">
		<div class="progressbar"><div class="inner"></div></div>
	</div>
	
	<div class="page">
		<div class="row">
			<h2>1단계 : 아이디, 비밀번호 입력</h2>
		</div>
		
		<div class="row left">
			<label>ID</label>
			<input class="input w-100" name="memberId" type="text" required autocomplete="off">
		</div>	
		
		<div class="row left">
			<label>Password</label>
			<input class="input w-100" name="memberPw" type="password" required>
		</div>
		
		<div class="row right">
			<button type="button" class="btn btn-positive btn-next">다음 단계</button>
		</div>
	</div>
	
	<div class="page">
		<div class="row">
			<h2>2단계 : 닉네임 입력</h2>
		</div>
		
		<div class="row left">
			<label>Nickname</label>
			<input class="input w-100" name="memberNick" type="text" required autocomplete="off">
		</div>
		
		<div class="row right">
			<button type="button" class="btn btn-neutral btn-prev">이전 단계</button>
			<button type="button" class="btn btn-positive btn-next">다음 단계</button>
		</div>
	</div>
	
	<div class="page">
		<div class="row">
			<h2>3단계 : 개인 정보 입력</h2>
		</div>
		
		<div class="row left">
			<label>Birth</label>
			<input class="input w-100" name="memberBirth" type="date" required autocomplete="off">
		</div>
		
		<div class="row left">
			<label>Phone No.</label>
			<input class="input w-100" name="memberTel" type="tel" autocomplete="off">
		</div>
		
		<div class="row left">
			<label>E-mail</label>	
			<input class="input w-100" name="memberEmail" type="email" autocomplete="off">
		</div>
		
		<div class="row right">
			<button type="button" class="btn btn-neutral btn-prev">이전 단계</button>
			<button type="button" class="btn btn-positive btn-next">다음 단계</button>
		</div>
	</div>
	
	<div class="page">
		<div class="row">
			<h2>4단계 : 주소 입력</h2>
		</div>
		
		<div class="row left">
			<label>Address</label>
			<br>
			<input class="input" name="memberPost" type="text" maxlength="6" size="6" placeholder="우편번호" autocomplete="off">
			<button class="btn btn-neutral">검색</button>
		</div>
		
		<div class="row left">
			<input class="input w-100" placeholder="기본주소" name="memberBaseAddress" type="text" autocomplete="off">
		</div>
		<div class="row left">
			<input class="input w-100" placeholder="상세주소" name="memberDetailAddress" type="text" autocomplete="off">
		</div>
		
		<div class="row right">
			<button type="button" class="btn btn-neutral btn-prev">이전 단계</button>
			<button type="button" class="btn btn-positive btn-next">다음 단계</button>
		</div>
	</div>
	
	<div class="page">
		<div class="row">
			<h2>5단계 : 프로필 이미지 설정</h2>
		</div>
		
		<div class="row left">
			<label>Profile image</label>
			<input class="input w-100" type="file" name="memberProfile" accept=".png, .jpg">
		</div>
		
		<div class="row right">
			<button type="button" class="btn btn-neutral btn-next">이전 단계</button>
			<button type="submit" class="btn btn-positive">회원 가입</button>
		</div>
	</div>
	
</div>

</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
