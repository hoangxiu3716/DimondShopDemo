<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
<style>
	.product-content{
		overflow-x: hidden;
	}
</style>
</head>
<body>
	<!-- 
Body Section 
-->
	<div class="row product-content">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${ about }">
						<li><a href='<c:url value="/about/${ item.id }"/>'><span
								class="icon-chevron-right"></span> ${ item.name }</a></li>
					</c:forEach>
					<li style="border: 0">&nbsp;</li>
				</ul>
			</div>

<!-- 			<div class="well well-small alert alert-warning cntr"> -->
<!-- 				<h2>50% Discount</h2> -->
<!-- 				<p> -->
<!-- 					only valid for online order. <br> -->
<!-- 					<br> -->
<!-- 					<a class="defaultBtn" href="#">Click here </a> -->
<!-- 				</p> -->
<!-- 			</div> -->
<!-- 			<div class="well well-small"> -->
<!-- 				<a href="#"><img src="assets/img/paypal.jpg" -->
<!-- 					alt="payment method paypal"></a> -->
<!-- 			</div> -->

			<a class="shopBtn btn-block" href="#">Sản phẩm sắp ra mắt<br>
			<small>Ấn vào để xem</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="chi-tiet-san-pham/${ highLightProduct[1].product_id }"
							title="add to cart"><span class="icon-search"></span>Xem nhanh</a> <img
							src="<c:url value="/assets/user/img/${ highLightProduct[1].img }" />"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="chi-tiet-san-pham/${ highLightProduct[3].product_id }">Xem</a> 
									<i class="pull-right padding-top-8 font-weight-400"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ highLightProduct[1].price }" />₫</i>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="chi-tiet-san-pham/${ highLightProduct[2].product_id }"
							title="add to cart"><span class="icon-search"></span>Xem nhanh</a> <img
							src="<c:url value="/assets/user/img/${ highLightProduct[2].img }" />"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="chi-tiet-san-pham/${ highLightProduct[2].product_id }">Xem</a> <i
									class="pull-right padding-top-8 font-weight-400"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ highLightProduct[2].price }" />₫</i>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="chi-tiet-san-pham/${ highLightProduct[3].product_id }"
							title="add to cart"><span class="icon-search"></span>Xem nhanh</a> <img
							src="<c:url value="/assets/user/img/${ highLightProduct[3].img }" />"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="chi-tiet-san-pham/${ highLightProduct[3].product_id }">Xem</a> <i
									class="pull-right padding-top-8 font-weight-400"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ highLightProduct[3].price }" />₫</i>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
<!-- 			<ul class="breadcrumb"> -->
<!-- 				<li><a href="<c:url value="/trang-chu"/>">Trang chủ</a> <span class="divider">/</span></li> -->
<!-- 				<li><a href="products.html">Sản phẩm</a> <span class="divider">/</span></li> -->
<!-- 				<li class="active">Chi tiết sản phẩm</li> -->
<!-- 			</ul> -->
			<h1>${ product.product_id }</h1>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img src="<c:url value="/assets/user/img/${ product.img }" />" alt=""
										style="width: 100%"></a>
								</div>
							</div>
<!-- 							<a class="left carousel-control" href="#myCarousel" -->
<!-- 								data-slide="prev">‹</a> <a class="right carousel-control" -->
<!-- 								href="#myCarousel" data-slide="next">›</a> -->
						</div>
					</div>
				</div>
				<div class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						${ aboutDetail.detail }
					</div>

				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
</body>