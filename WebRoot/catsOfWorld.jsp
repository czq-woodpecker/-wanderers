<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>bootstrap</title>
    
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
  
  <body style="background-image:url(images/bg.jpg)">
  	 <!-- Start of Header -->
      <%@ include file="top.jsp" %>
      <!-- End of Header -->

      <!-- Start of Search Wrapper -->
      <div class="search-area-wrapper">
              <div class="container">
                      <form id="search-form" class="search-form clearfix" method="get" action="#" autocomplete="off">
                              <input class="search-term required" type="text" id="s" name="s" placeholder="猫和远方" title="* Please enter a search term!" />
                              <input class="search-btn" type="submit" value="搜索" />
                              <div id="search-error-container"></div>
                      </form>
                      <h3 class="search-header">小小的爱心</h3>
                      <p class="search-tag-line">为流浪的宠物们重新拥有一个温馨的家</p>

              </div>
      </div>
      <!-- End of Search Wrapper -->

      <!-- Start of Page Container -->
      <div class="container-fluid" style="padding:30px 30px 0px 30px">
		<div class="row-fluid">
	  	  <div class="span4">
	  	    <img src="images/img01.jpg" />
	  	  	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	  	  </div>
	      <div class="span4">
	     	<img src="images/img02.jpg" />
	      	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	      </div>
	      <div class="span4">
	     	<img src="images/img03.jpg" />
	      	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	      </div>
	  	</div>
	  
		<div class="row-fluid">
	  	  <div class="span4">
	  	    <img src="images/img01.jpg" />
	  	  	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	  	  </div>
	      <div class="span4">
	     	<img src="images/img02.jpg" />
	      	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	      </div>
	      <div class="span4">
	     	<img src="images/img03.jpg" />
	      	<h3>品种：波斯猫</h3>
	  	  	<h4>生活习性：未知</h4>
	  	  	<h4>爱好：未知</h4>
	      </div>
	  	</div>
	  </div>
	  
	  <div class="pagination pagination-centered" >
  		<ul >
	    	<li ><a href="#" class="btn" style="color:#2396f0">上一页</a></li>
	   		<li><a href="#" class="btn active" style="color:#2396f0">1</a></li>
		    <li><a href="#" class="btn" style="color:#2396f0">2</a></li>
		    <li><a href="#" class="btn" style="color:#2396f0">3</a></li>
		    <li><a href="#" class="btn" style="color:#2396f0">4</a></li>
		    <li><a href="#" class="btn" style="color:#2396f0">5</a></li>
		    <li><a href="#" class="btn" style="color:#2396f0">下一页</a></li>
 		</ul>
	</div>
      <!--Body content-->
 
      <!-- End of Page Container -->

      <!-- Footer Bottom -->
      <%@ include file="foot.jsp" %>
      <!-- End of Footer Bottom -->


      <a href="#top" id="scroll-top"></a>

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
