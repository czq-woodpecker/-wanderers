<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="com.pet.action.ArticleListAction,com.pet.model.ArticleList" %>
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
  	
  	<%
  		ArticleListAction dao = new ArticleListAction();
  		int pageNo;
  		if(request.getParameter("pageNo")!=null)
  		{
	  		String pageNos = request.getParameter("pageNo");
	  		pageNo = Integer.parseInt(pageNos);
	  		
  		}else{
  			pageNo = 1;
  		}
  		
  		List<ArticleList> list = dao.getArticleList(pageNo);
  		request.setAttribute("list", list);
  		int total = dao.getPage();
  		request.setAttribute("total", total);
  	 %>
  	
  	<!-- start of the page content -->
     <div class="page-container">
     	<div class="container">
        	<div class="row">
            	<!-- start of page content -->
              	<div class="span8 main-listing">
				     	<c:forEach var="articleList" items="${list }" varStatus="st" >
	                    	<article class="format-standard type-post hentry clearfix">
	                         	<header class="clearfix">
	                            	<h3 class="post-title">
	                                	<a href="articles_content.jsp?id=${articleList.id }"><c:out value="${articleList.title }"></c:out></a>
	                                </h3>
	                                <div class="post-meta clearfix">
	                                	<span class="date">${articleList.time }</span>
	                                	<span class="category"><a ><c:out value="${articleList.publisher }"></c:out></a></span>
	                                    <span class="comments"><a title="${articleList.title }"><c:out value="${articleList.comments }"></c:out>&nbsp;Comments</a></span>
	                                	<span class="like-count">66</span>
	                                 </div>
	                               <!-- end of post meta -->
	                            </header>
	                            <p><c:out value="${articleList.summary }"></c:out>......<a class="readmore-link" href="articles_content.jsp?id=${articleList.id }">Read more</a></p>
	                         </article>
                        </c:forEach>   		
                        <div id="pagination">
                          	 	<a href="articles.jsp" class="btn">首页</a>
                                <a href="articles.jsp?pageNo=1" class="btn">1</a>
                      		 	<a href="articles.jsp?pageNo=2" class="btn">2</a>
                                <a href="articles.jsp?pageNo=3" class="btn">3</a>
                                <a href="articles.jsp?pageNo=<%=pageNo-1 %> "class="btn">上一页 »</a>
                                <a href="articles.jsp?pageNo=<%=pageNo+1 %>" class="btn">下一页»</a>
                                <h4>共${total}页</h4>
                           </div>
					</div>
				
				<aside class="span4 page-sidebar">
					<section class="wiget">
						<div class="support-widget">
							<h3 class="title">用户名</h3>
							<p class="intro">用户介绍</p>
							<button class="btn btn-link ">发布新帖</button>
						</div>
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
     <!-- end of page content -->
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
