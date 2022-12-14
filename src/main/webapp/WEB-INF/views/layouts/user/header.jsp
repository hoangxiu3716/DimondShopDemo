<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="/trang-chu"/>"><span></span> <img class="myLogo" 
				src="<c:url value="/assets/user/img/hoangHG.png"/>"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			<div class="offerNoteWrapper">
<!-- 				<h1 class="dotmark"> -->
<!-- 					<i class="icon-cut"></i>  -->
<!-- 				</h1> -->
			</div>
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Liên hệ : 0978154613 </strong><br>
				<br>
			</p> 
			<span class="btn btn-mini">[ ${ TotalQuantyCart } ] <span
				class="icon-shopping-cart"></span></span> <span
				class="btn btn-warning btn-mini">$</span> <span class="btn btn-mini">&pound;</span>
			<span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
--><h1>${ menu[3].url }</h1>
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<c:forEach var="item" items="${ menu }" varStatus="index">
						<c:if test="${ index.first }">
						<li class="active">
						</c:if>
						<c:if test="${ not index.first }">
						<li class="">
						</c:if>
						<a href="<c:url value="${ item.url }"/>">${ item.name }</a></li>
					</c:forEach>
				</ul>
				<form:form action="search" method="POST" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2" name="search" value="${ param.search }">
<!-- 					<input type="submit" placeholder="Search"> -->
				</form:form>
				<ul class="nav pull-right">
					<c:if test="${ empty LoginInfo }">
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"><span class="icon-lock"></span>
							Login <b class="caret"></b></a>
						<div class="dropdown-menu">
							<form class="form-horizontal loginFrm">
								<div class="control-group">
									<input type="text" class="span2" id="inputEmail"
										placeholder="Email">
								</div>
								<div class="control-group">
									<input type="password" class="span2" id="inputPassword"
										placeholder="Password">
								</div>
								<div class="control-group">
									<label class="checkbox"> <input type="checkbox">
										Nhớ tài khoản
									</label>
									<button type="submit" class="shopBtn btn-block">Đăng nhập</button>
								</div>
							</form>
						</div></li>
						</c:if>
						<c:if test="${ not empty LoginInfo }">
						<li><a href="#">${ LoginInfo.displayName }<b class="caret"></b></a></li>
						</c:if>
				</ul>
			</div>
		</div>
	</div>
</div>