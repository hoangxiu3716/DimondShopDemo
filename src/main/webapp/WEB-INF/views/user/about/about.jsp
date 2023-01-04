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
						<div class="detail-product">
							<p>Thế giới đồng hồ có vô vàn kiến thức để khám phá nhưng nếu
								không hệ thống thì hẳn rất khó để tìm hiểu về đồng hồ, đó là lý
								do mà bạn cần tham khảo những bài viết về các thương hiệu đồng
								hồ nổi tiếng mà hoangHG đa tổng hợp bên dưới được phân chia
								thành các phần: bộ máy đồng hồ, vật liệu đồng hồ, chức năng đồng
								hồ, thuật ngữ đồng hồ, trang trí hoàn thiện đồng hồ, linh kiện
								phụ tùng đồng hồ.</p>
							<p>
								<strong>PHẦN 1. BỘ MÁY - MOVEMENT - CALIBER - CALIBRE</strong>
							</p>
							<p>- Bộ máy đồng hồ:</p>
							<p>Tiếng anh gọi là Movement/Wathc Movement, viết tắt là Cal.
								Bộ máy là linh hồn của đồng hồ, vận hành các chức năng và được
								bảo vệ trong bộ vỏ bên ngoài.</p>
							<p>- Cơ - Cơ khí - Mechanical:</p>
							<p>Cách gọi chung tất cả bộ máy(tự động, lên dây thủ công)
								được tạo ra từ các bộ phận cơ khí, không có mạch điện, hoạt dộng
								bằng nguồn năng lương sinh ra từ dây cót. Thường dùng để chỉ máy
								lên dây thủ công.</p>
							<p>- Tự động - Tự động lên dây - AUTOMATIC - SELF - AUTO
								WINDING:</p>
							<p>Máy đồng hồ cơ có khả năng tự lên dây cót khi đeo trên
								tay. Khi đeo đồng hồ và cử động tay tự nhiên, Bánh Đà -
								oscillating weight/rotor sẽ quay và từ đó vặn dây cót. Tiền thân
								của máy tự động là máy lên dây thủ công nên nó cũng hoạt động
								bằng nguồn năng lượng cơ do dây cót sinh ra, phần lớn máy tự
								động cũng có thể lên dây thủ công.</p>
							<p>- Lên dây thủ công - HAND WOUND - HAND WINDING - MANUAL
								WINDING - MANUALLY WOUND:</p>
							<p>Máy đồng hồ cơ lên dây cót thủ công. Khi lên dây, dây cót
								được quấn chặt sẽ sinh ra năng lượng cơ học, năng lượng này sẽ
								làm đồng hồ chuyển động.</p>
							<p>- Thạch Anh - Pin - QUARTZ:</p>
							<p>Máy đồng hồ là tổ hợp các mạch điện và động cơ, sử dụng
								một tinh thể thạch anh(tự nhiên hoặc tổng hợp) để tạo ra độ
								chính xác và hoạt động bằng năng lượng điện do pin cung cấp. Máy
								quartz có độ chính xác cao hơn máy cơ rất nhiều. Các loại máy
								đồng hồ sử dụng pin sạc Eco-Drive, Solar, Kinetic, Autoquartz
								đều thuộc loại máy thạch anh.</p>
							<p>- Eco-Drive - Solar - Năng lượng ánh sáng:</p>
							<p>Loại máy thạch anh dùng pin sạc trang bị thêm tâm quang
								điện cho bộ máy để chuyển đổi năng lượng ánh sáng thành nặng
								lượng điện tích trữ trong pin sạc, pin sạc sẽ cung cấp năng
								lượng cho các hoạt động của máy.</p>
							<p>- Kinetic - Autoquartz - Cơ lai pin</p>
							<p>Loại máy thạch anh dùng pin sạc trang bị thêm bánh đà cho
								bộ máy để chuyển đổi năng lượng cơ thành năng lượng điện và tích
								trữ trong pin sạc, pin sạc sẽ cung cấp năng lượng cho các hoạt
								động của máy.</p>
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
</body>