<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>登录页</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>流浪者</h1>
            <form action="login" method="post">
            	 
                <input type="text" name="username" class="username" placeholder="用户名">                 
                <input type="password" name="password" class="password" placeholder="密码">
                <font color="red">${error}</font>
                <button type="submit">登录</button> 
               
                <div class="error"><span>+</span></div>  
            </form>
           

			<form action="" method="post">            
                <button type="submit">没有账号？点击注册</button>
                <!--上面那句用来干嘛-->
            </form>
           
            <div class="connect">
                <p>第三方账号登录:</p>
                <p>
                    <a class="facebook" href=""></a><!--dai-->
                    <a class="twitter" href=""></a><!--dai-->
                </p>
            </div>
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>
