<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.15/dist/summernote-bs4.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.15/dist/summernote-bs4.min.js"></script>
<style type="text/css">
.container-fluid {
	padding-left: 0px;
	padding-right: 0px;
}
</style>
</head>
<body class="">
	<!-- 상단 head 시작 -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-12">
				<h5 class="">
					<a href="http://70.12.115.80:8088/serverweb/project/homeupside4.jsp"><img id=minilogo alt="" src="http://70.12.115.80:8088/serverweb/projectimages/damoimlogo.png" style="width: 80px; height: 50px;">다모임</a>
				</h5>
			</div>
		</div>
		<div class="row">
			<div class="col-xl-12">
				<h1 class="display-2" style="text-align: center;">
					<img alt="" style="width: 12%;" src="./images/brush.png">스윗드로잉
				</h1>
				<br />
			</div>
		</div>
		<div class="row">
			<div class="col-xl-9"></div>
			<div class="col-xl-3">
				<ul class="nav nav-pills">
					<li class="nav-item" style="width: 33.3%; text-align: center;"><a href="http://70.12.224.117:8088/damoim/html/home.jsp" class="active nav-link">홈</a></li>
					<li class="nav-item" style="width: 33.3%; text-align: center;"><a href="http://70.12.224.117:8088/damoim/html/board.jsp" class="nav-link">게시판</a></li>
					<li class="nav-item" style="width: 33.3%; text-align: center;"><a href="http://70.12.230.200:8088/damoim/NewStart/main.html" class="nav-link">일정</a></li>
				</ul>
			</div>
		</div>
		<br />
		<div class="row">
			<div class="col-xl-12">
				<div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner" style="height: 300px;">
						<div class="carousel-item active">
							<img class="d-block img-fluid w-100" src="./images/5.jpg">
							<div class="carousel-caption">
								<h5 class="m-0">Carousel</h5>
								<p>with indicators</p>
							</div>
						</div>
						<div class="carousel-item ">
							<img class="d-block img-fluid w-100" src="./images/5.jpg">
							<div class="carousel-caption">
								<h5 class="m-0">Carousel</h5>
								<p>with indicators</p>
							</div>
						</div>
						<div class="carousel-item">
							<img class="d-block img-fluid w-100" src="./images/5.jpg">
							<div class="carousel-caption">
								<h5 class="m-0">Carousel</h5>
								<p>with indicators</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 상단 head 끝 -->
	<br />
	<br />
	<!-- 메인화면 시작 -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-2">왼쪽 여백</div>
			<!-- 왼쪽여백 끝 중앙 컨텐츠 시작 -->
			<div class="col-xl-8">
				<form method="post">
					<textarea id="summernote" name="editordata"></textarea>
				</form>
				<script>
					$('#summernote').summernote({
						placeholder : 'Hello Bootstrap 4',
						tabsize : 2,
						height : 500
					});
				</script>
				<br />
				<div class="row">
					<div class="col-xl-10">
					
						<button id="edit" class="btn btn-primary" onclick="edit()" type="button">Edit 1</button>
						<button id="save" class="btn btn-primary" onclick="save()" type="button">Save 2</button>
						<div class="click2edit">click2edit</div>
						<script type="text/javascript">
							var edit = function() {
								$('.click2edit').summernote({
									focus : true
								});
							};

							var save = function() {
								var markup = $('.click2edit')
										.summernote('code');
								$('.click2edit').summernote('destroy');
							};
						</script>
						
					</div>
					<div class="col-xl-2">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>
			</div>
			<!-- 중앙컨텐츠 끝 오른쪽 여백시작 -->
			<div class="col-xl-2">오른쪽 여백</div>
		</div>
	</div>
	<!-- 메인화면 끝 -->
	<br />
	<br />
	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-12" style="background-color: black; height: 200px;">상단 head</div>
		</div>
	</div>
</body>
</html>