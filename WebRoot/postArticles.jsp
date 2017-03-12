<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>发表帖子</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="bootstrap3/style.css" />
<link rel='stylesheet' id='bootstrap-css-css'
	href='bootstrap3/css/bootstrap5152.css?ver=1.0' type='text/css'
	media='all' />
<link rel='stylesheet' id='responsive-css-css'
	href='bootstrap3/css/responsive5152.css?ver=1.0' type='text/css'
	media='all' />
<link rel='stylesheet' id='pretty-photo-css-css'
	href='bootstrap3/js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4'
	type='text/css' media='all' />
<link rel='stylesheet' id='main-css-css'
	href='bootstrap3/css/main5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='green-skin-css'
	href='bootstrap3/bootstrap3/css/green-skin5152.css?ver=1.0'
	type='text/css' media='all' />
<link rel='stylesheet' id='custom-css-css'
	href='bootstrap3/css/custom5152.html?ver=1.0' type='text/css'
	media='all' />
	
	<script type="text/javascript">
	function CheckForm(){
		if(document.myform.title.value ==""){
		alter("请输入标题！");
		document.myform.title.focus();
		return false;
		}	
		if(document.myform.content.value ==""){
		alter("请输入内容！");
		document.myform.content.focus();
		return false;
		}
		return true;
	}
	</script>

</head>
<body>
	<%@ include file="top.jsp"%>
	<%@ include file="middle.jsp"%>


	<div class="page-container">
		<div class="container">
			<div class="row">
				<div class="span8 main-listing">
					<article class="format-standard type-post hentry clearfix">
					<header class="clearfix">
					<h3 class="post-title">发表帖子</h3>
					</header> 
					</article>
				</div>
				<form name="newsPost" action="articleInsert" method="post" onSubmit="return CheckForm();">
					<table align="left" width="740">
						<tr>
							<td align="center">标题</td>
							<td><input type="text" name="title" /></td>
						</tr>


						<tr>
							<td align="center">分类</td>
							<td><select name="posting">
									<option value="chickenSoup">心灵鸡汤</option>
									<option value="feeding">喂养知识</option>
									<option value="discussion">交流讨论</option>
							</select></td>
						</tr>

						<tr>
							<td align="center">帖子内容</td>
							<td><textarea class="ckeditor" cols="80" id="content" name="content" rows="10"> 
    							</textarea>
    						
    						</td>
						</tr>
						
						<tr>
						<td>
							<td colspan="2" align="center">
							<input type="submit" value="发布" class="button"/> 
							<span color="red"><a href="login.jsp">${error }</a></span>
							</td>
						</td>
						</tr>
					</table>

				</form>
				<aside class="span4 page-sidebar">
						<section class="wiget">
							<c:if test="<%=currentUser!=null %>">
							<div class="support-widget">
								<h3 class="title">用户名:<%=currentUser.getNickname() %></h3>
								<p class="intro">用户介绍:性别<%=currentUser.getSex()%></p>
								<button class="btn btn-link ">发布新帖</button>
							</div>
							</c:if>
						</section>
						<section class="wiget">
							<div class="widget">
								<h3 class="title">热门交流帖</h3>
								<ul class="articles">
									<li class="article-entry standard">
										<h4><a>帖子标题</a></h4>
										<span class="article-meta">
											帖子时间&nbsp;&nbsp;<a>发布者</a>
										</span>
										<span class="like-count">6</span>
									</li>
									<li class="article-entry standard">
										<h4><a>帖子标题</a></h4>
										<span class="article-meta">
											帖子时间&nbsp;&nbsp;<a>发布者</a>
										</span>
										<span class="like-count">6</span>
									</li>
								</ul>
							</div>
						</section>
				</aside>
			</div>
			
		</div>
	</div>

	<%@ include file="foot.jsp"%>
	
	<script type="text/javaScript"
		src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
	<script type="text/javascript">   
 			var editor = CKEDITOR.replace('content');   
 		</script>  
	<script type='text/javascript' src='bootstrap3/js/jquery-1.8.3.min.js'></script>
	<script type='text/javascript' src='bootstrap3/js/jquery.easing.1.3.js'></script>
	<script type='text/javascript' src='bootstrap3/js/prettyphoto/jquery.prettyPhoto.js'></script>
	<script type='text/javascript' src='bootstrap3/js/jflickrfeed.js'></script>
	<script type='text/javascript' src='bootstrap3/js/jquery.liveSearch.js'></script>
	<script type='text/javascript' src='bootstrap3/js/jquery.form.js'></script>
	<script type='text/javascript' src='bootstrap3/js/jquery.validate.min.js'></script>
	<script type='text/javascript' src='bootstrap3/js/custom.js'></script>
	<!-- end of page content -->

</body>
</html>
