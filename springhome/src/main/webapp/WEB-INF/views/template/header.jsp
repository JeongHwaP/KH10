<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="login" value="${loginId != null}"></c:set>
<c:set var="admin" value="${mg == '관리자'}"></c:set>

<html>
	<head>
		<title>
			<c:choose>
				<c:when test="${param.title != null}">
					${param.title}
				</c:when>
				<c:otherwise>
					홈페이지
				</c:otherwise>
			</c:choose>
		</title>
		
		<link rel="preconnect" href="https://fonts.googleapis.com">
	    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">
	
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/commons.css">
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css">
	
	    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"/>
	
	    <!-- <link rel="stylesheet" type="text/css" href="/css/test.css"> -->
	  
	  	<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>  
	    <script src="/js/checkbox.js"></script>
	</head>
	<body>
		
		<!-- main은 영역의 시작과 끝을 의미 -->
	    <main>
	        <!-- 상단 헤더 -->
	        <header>
				<div class="container-800">
					<div class="row center">
						<h1>KH 정보교육원 수업용 홈페이지</h1>
					</div>
				</div>
			</header>
	
	        <!-- 메뉴 -->
	        <nav>
				<!-- 메뉴 : 반드시 절대 경로로 작성 -->
				<ul class="dropdown-menu">
					<c:choose>
						<c:when test="${login}">
							<li><a href="${pageContext.request.contextPath}">홈</a></li>
							<li>
								<a href="#">데이터셋</a>
								<ul>
									<li><a href="${pageContext.request.contextPath}/pocketmon/list">포켓몬스터</a></li>
									<li><a href="${pageContext.request.contextPath}/music/list">음원관리</a></li>						
								</ul>
							</li>
							<li>
								<a href="#">커뮤니티</a>
								<ul>
									<li><a href="${pageContext.request.contextPath}/board/list">게시판</a></li>
									<li><a href="${pageContext.request.contextPath}/guestbook/list">방명록</a></li>
								</ul>
							</li>
							<li class="right-menu">
								<a href="#">${loginId} 님</a>
								<ul>
									<!-- 관리자 기능 -->
									<c:if test="${login && admin}">
										<li><a href="${pageContext.request.contextPath}/admin/home">관리자페이지</a></li>
									</c:if>
									
									<li><a href="${pageContext.request.contextPath}/member/mypage">마이페이지</a></li>
									<li><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></li>
								</ul>
							</li>
						</c:when>
						<c:otherwise>
							<li><a href="${pageContext.request.contextPath}/">홈</a></li>
							<li>
								<a href="#">커뮤니티</a>
								<ul>
									<li><a href="${pageContext.request.contextPath}/board/list">게시판</a></li>
									<li><a href="${pageContext.request.contextPath}/guestbook/list">방명록</a></li>
								</ul>
							</li>
							<li class="right-menu">
								<a href="${pageContext.request.contextPath}/member/login">로그인</a>
								<ul>
									<li><a href="${pageContext.request.contextPath}/member/join">회원가입</a></li>
								</ul>
							</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</nav>
	
	        <!-- 사이드바 + 컨텐츠 -->
            <section class="w-100">
		