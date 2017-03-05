<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="com.pet.action.PetList"%>
<%@ page import="com.pet.model.Dog"%>
<%@ page import="com.pet.dao.PetDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
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
     <%@ include file="middle.jsp"  %>
      <!-- End of Search Wrapper -->
	
	<%
			PetList pet = new PetList();
			List<Dog> list = null;
		 	list = pet.petList("dog"); 
			request.setAttribute("pets", list);
		%>

      <!-- Start of Page Container -->
      <div class="container-fluid" style="padding:5% 5% 0 5%">
	  <c:forEach var="pet" items="${pets }" begin="0">
	  	  <div class="span3">
	  	    <img src="${pet.photoAddress }" />
	  	  	<h3>品种：<c:out value="${pet.name }"></c:out></h3>
	  	  	<h4>生活习性：<c:out value="${pet.habit }"></c:out></h4>
	  	  	<h4>爱好：<c:out value="${pet.hobby }"></c:out></h4>
	  	  </div>
	  </c:forEach>
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
