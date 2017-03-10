<%@page import="com.pet.model.User"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
	User currentUser = (User)session.getAttribute("currentUser");
 %>
<div class="header-wrapper">
           <header>
               <div class="container">
                             <!-- Website Logo -->
                             <a href="top.jsp"  title="Tramp">
                                     <img src="images/logo.png" alt="流浪者">
                             </a>
                    <!-- Start of Main Navigation -->
                    <nav class="main-nav">
                        <div class="menu-top-menu-container">
                             <ul id="menu-top-menu" class="clearfix ">
                                 <li ><a href="main.jsp">首页</a></li>
                                 <li><a href="petsOfWorld.jsp?kind=cat">世界猫谱</a></li>
                                 <li><a href="petsOfWorld.jsp?kind=dog">世界狗谱</a></li>
                                 <li><a href="stray_pet.jsp?kind=cat">流浪猫区</a></li>
                                 <li><a href="stray_pet.jsp?kind=dog">流浪狗区</a></li>
                                 <li><a href="">交流分享</a>
                                         <ul class="sub-menu">
                                                 <li><a href="TalkAndShare_FeedKnowledge.jsp">喂养知识</a></li>
                                                 <li class="current-menu-item"><a href="TalkAndShare_TalkAndDiscuss.jsp">交流讨论</a></li>
                                                 <li><a href="TalkAndShare_BeautyArticle.jsp">情感鸡汤</a></li>
                                         </ul>
                                 </li>
                                 <li><a href="#">关于我们</a></li>
                                 <li>                  
	                           		<c:choose>
	                            	<c:when test="<%=currentUser==null %>">
	                           	 	<a href="login.jsp">登录/注册</a>
	                            	</c:when>
	                            	<c:otherwise>
	                            	<li><a>当前用户：<%=currentUser.getNickname() %></a>	                                 	
		                            	<ul class="sub-menu">
		                                	<li><a href="">个人中心</a></li>
		                                	<li><a href="logout.jsp">退出</a></li>
		                                </ul> 
	                                </li>
	                                  	  
	                            </c:otherwise>
	                           </c:choose> 
                            </li>                                                   
                                                                
                             </ul>
                        </div>
                    </nav>
                    <!-- End of Main Navigation -->
               </div>
           </header>
      </div>