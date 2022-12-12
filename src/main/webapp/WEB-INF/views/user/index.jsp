<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!DOCTYPE html>
<body>
	<!-- 
	<section>
		<nav>
			<ul>
				<li><a href="#">London</a></li>
				<li><a href="#">Paris</a></li>
				<li><a href="#">Tokyo</a></li>
			</ul>
		</nav>

		<article>
			<h1>London</h1>
			<p>London is the capital city of England. It is the most populous
				city in the United Kingdom, with a metropolitan area of over 13
				million inhabitants.</p>
			<p>Standing on the River Thames, London has been a major
				settlement for two millennia, its history going back to its founding
				by the Romans, who named it Londinium.</p>
		</article>
	</section> -->
	<!-- 
Body Section 
-->
	<title>Home page</title>
	<%-- <h1>${ categories.size() }</h1> --%>
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${ categories }">
						<li><a href="/san-pham/${ item.id }"><span
								class="icon-circle-blank"></span> ${ item.name }</a></li>
					</c:forEach>
					<li><a class="totalInCart" href="cart.html"><strong>Đã
								mua <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg" />"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/bootstrap-ecommerce-templates.PNG" />"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/shopping-cart-template.PNG" />"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value="/assets/user/img/bootstrap-template.png" />"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">
					<div class="carousel-inner">
						<c:forEach var="item" items="${ slides }" varStatus="index">
							<c:if test="${ index.first }">
								<div class="item active">
							</c:if>
							<c:if test="${ not index.first }">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="/assets/user/img/${ item.img }" />"
								alt="bootstrap ecommerce templates">
							<div class="carousel-caption">
								<h4>${ item.caption }</h4>
								<p>
									<span>${ item.content }</span>
								</p>
							</div>
					</div>
					</c:forEach>
				</div>
				<!-- 						<div class="item"> -->
				<!-- 							<img style="width: 100%" -->
				<%-- 								src="<c:url value="/assets/user/img/carousel1.png" />" --%>
				<!-- 								alt="bootstrap ecommerce templates"> -->
				<!-- 							<div class="carousel-caption"> -->
				<!-- 								<h4>Bootstrap Ecommerce template</h4> -->
				<!-- 								<p> -->
				<!-- 									<span>Highly Google seo friendly</span> -->
				<!-- 								</p> -->
				<!-- 							</div> -->
				<!-- 						</div> -->
				<!-- 						<div class="item active"> -->
				<!-- 							<img style="width: 100%" -->
				<%-- 								src="<c:url value="/assets/user/img/carousel3.png" />" --%>
				<!-- 								alt="bootstrap ecommerce templates"> -->
				<!-- 							<div class="carousel-caption"> -->
				<!-- 								<h4>Twitter Bootstrap cart</h4> -->
				<!-- 								<p> -->
				<!-- 									<span>Very easy to integrate and expand.</span> -->
				<!-- 								</p> -->
				<!-- 							</div> -->
				<!-- 						</div> -->
				<!-- 						<div class="item"> -->
				<!-- 							<img style="width: 100%" -->
				<%-- 								src="<c:url value="/assets/user/img/bootstrap-templates.png" />" --%>
				<!-- 								alt="bootstrap templates"> -->
				<!-- 							<div class="carousel-caption"> -->
				<!-- 								<h4>Bootstrap templates integration</h4> -->
				<!-- 								<p> -->
				<!-- 									<span>Compitable to many more opensource cart</span> -->
				<!-- 								</p> -->
				<!-- 							</div> -->
				<!-- 						</div> -->
				<!-- 					</div> -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>
		<!--
New Products
-->
		<div class="well well-small">
			<h3>Sản phẩm mới</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
						<c:if test="${ newProduct.size() > 0 }">
							<div class="item active">
								<ul class="thumbnails">
									<c:forEach var="item" items="${ newProduct }" varStatus="loop">
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="product_details.html"
													title="add to cart"><span class="icon-search"></span></a>
												QUICK VIEW<a href="chi-tiet-san-pham/${ item.product_id }"><img
													src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
											</div>
										</li>
									<c:if test="${ (loop.index + 1) % 4 == 0 || (loop.index + 1) == newProduct.size() }">
									</ul>
								</div>
								<c:if test="${ (loop.index + 1) < newProduct.size() }">
									<div class="item">
									<ul class="thumbnails">
								</c:if>
						</c:if>
						</c:forEach>
						</c:if>
						</div>
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>

		</div>
		<!--
	Featured Products
	-->
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="products.html"
					title="View more">VIew More<span class="icon-plus"></span></a> Sản
				phẩm nổi bật
			</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<c:if test="${ highLightProduct.size() > 0 }">
					<ul class="thumbnails">
						<c:forEach var="item" items="${ highLightProduct }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="chi-tiet-san-pham/${ item.product_id }"><img
										src="<c:url value="/assets/user/img/${ item.img }" />" alt=""></a>
									<div class="caption">
										<h5>${ item.name }</h5>
										<h4>
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ item.price }" />₫
											</span>
										</h4>
									</div>
								</div> <c:if
									test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1) == highLightProduct.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < highLightProduct.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>
				</c:forEach>
				</c:if>
			</div>
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">Xem thêm<span
				class="icon-plus"></span></a> Tất cả sản phẩm
		</div>
	</div>
	</div>
</body>

