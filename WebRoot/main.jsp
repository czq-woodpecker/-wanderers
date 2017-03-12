<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<link href="bootstrap3/index/css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="bootstrap3/index/css/style.css" rel='stylesheet' type='text/css' />	
	<script src="bootstrap3/index/js/jquery.min.js"> </script>
	<!--web-fonts-->
	<!--//we-bfonts-->
	<script type="text/javascript" src="bootstrap3/index/js/move-top.js"></script>
	<script type="text/javascript" src="bootstrap3/index/js/easing.js"></script>
	

    <link rel='stylesheet' id='bootstrap-css-css'  href='bootstrap3/css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css-css'  href='bootstrap3/css/responsive5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='pretty-photo-css-css'  href='bootstrap3/js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
    <link rel='stylesheet' id='main-css-css'  href='bootstrap3/css/main5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-css-css'  href='bootstrap3/css/custom5152.html?ver=1.0' type='text/css' media='all' />
	
	 <script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
</script>
  </head>
    <%@ include file="top.jsp" %>
  
  <body>


	<div id="home" class="header">
					<div class="top-header">
						<div class="container">
							<div class="logo">
							  <a href="main.jsp"><h1>wandering</h1></a>
						    </div>
							<!-- script-for-menu -->
								<!-- script-for-menu -->
							<div class="clearfix"> </div>
						</div>
					</div>
				<div class="banner">
				   <div class="container">
						<div id="top" class="callbacks_container">
						<ul class="rslides callbacks callbacks1" id="slider4">
							<li id="callbacks1_s0" class="callbacks1_on" style="display: block; float: left; position: relative; opacity: 1; z-index: 2; transition: opacity 500ms ease-in-out;">
								<div class="banner-info">
								<h4 style="margin-top:450px"></h4>
								<h3 style="color:#bfbfbf;font-weight:bold">给它们一个温暖的家</h3>
								</div>
							</li>
							<li id="callbacks1_s1" class="" style="display: block; float: none; position: absolute; opacity: 0; z-index: 1; transition: opacity 500ms ease-in-out;">
								<div class="banner-info">
								   <h3>Helping you get rid</h3>
								  <h4>of your dog's behaviour problem!</h4>
								</div>
							</li>
							<li id="callbacks1_s2" class="" style="display: block; float: none; position: absolute; opacity: 0; z-index: 1; transition: opacity 500ms ease-in-out;">
								<div class="banner-info">
								  <h3>Get to know</h3>
								  <h4>everything to keep your dog healthy</h4>
								</div>	
							</li>
						</ul>
						</div>
						<!--banner-Slider-->
						<script src="bootstrap3/index/js/responsiveslides.min.js"></script>
						 <script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
						auto: true,
						pager: true,
						nav:false,
						speed: 500,
						namespace: "callbacks",
						before: function () {
						  $('.events').append("<li>before event fired.</li>");
						},
						after: function () {
						  $('.events').append("<li>after event fired.</li>");
						}
						  });

						});
						  </script>
						
				</div>
				<div class="banner-bottom">
			      <div class="container">
			         <div class="banner-bot-grids">
				        <div class="col-md-4 banner-grid one">
				        
						  	<span style="color:white;font-size:28px;font-weight:regular">请不要抛弃它们</span>
					     </div>
						 <div class="col-md-4 banner-grid two">
						  	<span style="color:white;font-size:28px;font-weight:Medium">请伸出手帮助它们</span>
						 </div>
					    <div class="col-md-4 banner-grid three">
						  	<span style="color:white;font-size:25px;font-weight:regular">让我们重新给它们一个家</span>
						</div>
					 </div>
		      </div>
	       </div>

	     </div>
     </div>
	
	
	<div class="about">
		<div class="container">
		 <h3 class="tittle wel">关于我们</h3>
				<div class="about-top">
					<div class="col-md-7 about-top-right">
						<h4>搜集流浪猫狗的信息，让公众获知相关信息以便对它们进行救助</h4>
						<p>被抛弃的宠物有很多，失去主人的宠物只能过流浪生活。社会上有许多热心帮助小动物的
						   人，不过很多因为不知道身边流浪猫狗的信息，因此无法及时为有需要的流浪猫狗给予帮助</p>
						<p> 
						为身边的流浪猫狗尽可能地提供帮助，小小的救助是对它们最大的关爱。</p>
					</div>
					<div class="col-md-5 about-top-left">
						<img src="bootstrap3/index/images/ab.jpg" class="img-responsive" alt=""/>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>	 
	</div>
    <!--start-breed-section-->
     <div class="breed-section">
	    <div class="container">
		       <h3 class="tittle two">被救助的流浪狗</h3>
		         <div class="serve-grids">
					  <div class="col-md-5 service-img">
						<img src="bootstrap3/index/images/b-service.jpg" class="img-responsive" alt=""/>
					  </div>
					   <div class="col-md-7 serve-text">
					       <h2>感恩的心</h2>
						   <h3>小黄是在一堆生活垃圾中被发现的，当时它已严重受伤，几乎不能走路。志愿者将它救出并带回收容所救治。小黄是在一堆生活垃圾中被发现的，当时它已严重受伤，几乎不能走路。志愿者将它救出并带回收容所救治。小黄是在一堆生活垃圾中被发现的，当时它已严重受伤，几乎不能走路。志愿者将它救出并带回收容所救治。</h3>
					   </div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
		<svg id="bigTriangleShadow" xmlns="http://www.w3.org/2000/svg" version="1.1" width="100%" height="100" viewBox="0 0 100 100" preserveAspectRatio="none">
			<path id="trianglePath1" d="M0 0 L50 100 L100 0 Z"></path>
			<path id="trianglePath2" d="M50 100 L100 40 L100 0 Z"></path>
		</svg>
	
		<div class="health-care">
				<div class="container">
				    <h3 class="tittle">恢复健康</h3>
					<div class="health">
		               <div class="col-md-7 health-text">
					       <h2>让生病的流浪宠物恢复健康</h2>
					       <h3>热心的爱狗人士再次用爱心创造了奇迹，这只骨瘦嶙峋的病犬在被发现时已经无法站立，身体的各项机能区域崩溃边缘，但是在被现在的主人救回仅仅7周之后，它就又恢复了健康。</h3>
		               </div>
					  <div class="col-md-5 health-img">
						  <img src="bootstrap3/index/images/food.jpg" class="img-responsive" alt=""/>
					  </div>
					   <div class="clearfix"></div>
					
				</div>
			</div>
		</div>
  <!--//end-health--> 
		<!--start-news-->
		<div class="news" id="new">
		    <div class="container">
				<h3 class="tittle two">流浪猫狗的信息</h3>
			 <div class="news-article">
			  <div class="col-md-6 article-post">
				<a href="stray_pet.jsp?kind=cat" ><img src="bootstrap3/index/images/g1.jpg" alt="img07"/></a>
				<div class="col-md-3 post-meta">
					<div class="clearfix"> </div>
				  </div>
				<div class="col-md-9 post-details">
					<a href="stray_pet.jsp?kind=cat"><h3>了解最新的流浪猫信息</h3></a>
					<h4>在这里你可以通过我们领取一只流浪猫并好好照顾它。还可以学到照顾宠物的方法和喂养知识。</h4>
					<div class="read">
						<a class="button" href="stray_pet.jsp?kind=cat"><img src="bootstrap3/index/images/read.png" alt="" /></a>
					</div>

				</div>
				<!--post-details-->	
				<div class="clearfix"> </div>
				</div>	
				 <div class="col-md-6 article-post">
				<a href="stray_pet.jsp?kind=dog" ><img src="bootstrap3/index/images/g2.jpg" alt="img07"/></a>
				<div class="col-md-3 post-meta">
					<div class="clearfix"> </div>
				  </div>
				<div class="col-md-9 post-details">
					<a href="stray_pet.jsp?kind=dog"><h3>了解最新的流浪狗信息</h3></a>
					<h4>在这里你可以通过我们领取一只流浪狗并好好照顾它。还可以学到照顾宠物的方法和喂养知识。</h4>
					<div class="read">
						<a class="button" href="stray_pet.jsp?kind=cat"><img src="bootstrap3/index/images/read.png" alt="" /></a>
					</div>

				</div>
				<!--post-details-->	
				<div class="clearfix"> </div>
				</div>	
			    <div class="clearfix"> </div>				
			</div>
		</div>
	</div>
  <!--//news-->

			
     <%@ include file="foot.jsp" %>  
      
     <!-- script -->
        <script type='text/javascript' src='bootstrap3/js/jquery-1.8.3.min.js'></script>
        <script type='text/javascript' src='bootstrap3/js/jquery.easing.1.3.js'></script>
        <script type='text/javascript' src='bootstrap3/js/prettyphoto/jquery.prettyPhoto.js'></script>
        <script type='text/javascript' src='bootstrap3/js/jflickrfeed.js'></script>
		<script type='text/javascript' src='bootstrap3/js/jquery.liveSearch.js'></script>
		<script type='text/javascript' src='bootstrap3/js/jquery.form.js'></script>
		<script type='text/javascript' src='bootstrap3/js/jquery.validate.min.js'></script>
		<script type='text/javascript' src='bootstrap3/js/custom.js'></script>
    
  </body>
</html>
