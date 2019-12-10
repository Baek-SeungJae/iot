<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap.min.css" />
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="../summernote/dist/summernote.css" rel="stylesheet">
<script src="../summernote/dist/summernote.js"></script>
</head>
<body class="">
	<!-- 상단 head 시작 -->
	<div class="container" style="margin:0; padding: 0; width:100%; max-width: 100%;">
    <div class="row">
        <div class="col-md-12">
          <h5 class="" > <a href=""><img id=minilogo alt="" src="http://70.12.115.80:8088/serverweb/projectimages/damoimlogo.png" style="width:80px; height: 50px;">다모임</a></h5>
        </div>
      </div>
        <div class="row">
        <div class="col-md-12">
          <h1 class="display-2" style="text-align: center;"><img alt="" src="http://70.12.115.80:8088/serverweb/moimimages/brush.png">스윗드로잉</h1>
        </div>
      </div>
      <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
        <div class="col-md-1"></div>
      </div>
       <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
      </div>
      <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        <div class="col-md-2"></div>
        	<ul class="nav nav-pills">
					<li class="nav-item"><a href="./so_home.jsp" class="active nav-link">홈</a></li>
					<li class="nav-item"><a href="./so_board.jsp" class="nav-link" >게시판</a></li>
					<li class="nav-item"><a href="./so_cal_main.html" class="nav-link">일정</a></li>
			</ul>
        <div class="col-md-2"></div>
      </div>
        <div class="row">
        <div class="col-md-12">
          <div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"> </li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"> </li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"> </li>
            </ol>
            <div class="carousel-inner">
              <div class="carousel-item active"> <img class="d-block img-fluid w-100" src="./so_main.html">
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
				<div id="summernote">Hello Summernote</div>
				<script type="text/javascript">
					$(document).ready(function() {
						$('#summernote').summernote();
						var html = $('#summernote').summernote('code');
					});
				</script>
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