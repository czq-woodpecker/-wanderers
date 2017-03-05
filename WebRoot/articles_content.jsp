<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="com.pet.action.ArticleListAction,com.pet.dao.ArticleListDao,com.pet.model.ArticleList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>pets</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="bootstrap3/style.css"/>
    <link rel='stylesheet' id='bootstrap-css-css'  href='bootstrap3/css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css-css'  href='bootstrap3/css/responsive5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='pretty-photo-css-css'  href='bootstrap3/js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css' media='all' />
    <link rel='stylesheet' id='main-css-css'  href='bootstrap3/css/main5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='green-skin-css'  href='bootstrap3/bootstrap3/css/green-skin5152.css?ver=1.0' type='text/css' media='all' />
    <link rel='stylesheet' id='custom-css-css'  href='bootstrap3/css/custom5152.html?ver=1.0' type='text/css' media='all' />

  </head>
  
  <body>
    <!-- top -->
  	<%@ include file="top.jsp" %>
  	<%@ include file="middle.jsp" %>
  	
  	
  	
  	<!-- page content -->
  	<div class="page-container">
  		<
  		<div class="container">
	  		<div class="row">
	  			<!-- foreach page -->
	  			<div class="span8 page-content">
					<article class=" type-post format-standard hentry clearfix">
						<h1 class="post-title">Integrating WordPress with Your Website</h1>
						<div class="post-meta clearfix">
							<span class="date">25 Feb, 2013</span>
							<span class="category"><a >科狗</a></span>
							<span class="comments"><a title="Comment on Integrating WordPress with Your Website">3 Comments</a></span>
                            <span class="like-count">66</span>
						</div>
						<p>Many of us work in an endless stream of tasks, browser tasks, social media, emails, meetings, rushing from one thing to another, never pausing and never ending.&nbsp;Then the day is over, and we are exhausted, and we often have very little to show for it. And we start the next day, ready for a mindless stream of tasks and distractions.</p>
					</article>
					<section id="comments">
						<h3 id="comments-title">(3) Comments</h3>
						<ol class="commentlist">
							<li class="comment even thread-even depth-1" id="li-comment-2">
								<article id="comment-2">
									
									<img alt="" src="images/temp/timg2.jpg" class="avatar avatar-60 photo" height="60" width="60">
									<div class="comment-meta">
										<h5 class="author">
											<cite class="fn">
												<span style="color:rgb(240, 183, 12)">John Doe</span>
											</cite>
										</h5>
										 <p class="date">
											<time datetime="2013-02-26T13:18:47+00:00" style="color:rgb(240, 183, 12)">February 26, 2013 at 1:18 pm</time>
										</p>								
									</div>
									<div class="comment-body">
										<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
		                                <p>Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem.</p>
									</div>
								</article>
							</li>
							<li class="comment even thread-even depth-1" id="li-comment-2">
								<article id="comment-2">
									
									<img alt="" src="images/temp/timg2.jpg" class="avatar avatar-60 photo" height="60" width="60">
									<div class="comment-meta">
										<h5 class="author">
											<cite class="fn">
												<span style="color:rgb(240, 183, 12)">科狗</span>
											</cite>
										</h5>
										 <p class="date">
											<time datetime="2013-02-26T13:18:47+00:00" style="color:rgb(240, 183, 12)">February 26, 2013 at 1:18 pm</time>
										</p>								
									</div>
									<div class="comment-body">
										<p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
		                                <p>Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem.</p>
									</div>
								</article>
							</li>
						</ol>
					</section>
				</div>
	  		</div>
  		</div>
  	</div>
  	
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
