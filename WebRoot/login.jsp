<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>流浪者登录页</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="images/login.js"></script>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>流浪者</h1>

<div class="login" style="margin-top:50px;">
    
    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a>
			<a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a><div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>    
  
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">    

            <!--登录-->
            <div class="web_login" id="web_login">
               
               
               <div class="login-box">
    
            
			<div class="login_form">
				<form action="login" name="loginform" accept-charset="utf-8" id="login_form" class="loginForm" method="post"><input type="hidden" name="did" value="0"/>
               <font color="red">${error}</font>	<!-- 显示错误 -->
               <input type="hidden" name="to" value="log"/>
               
                <div class="uinArea" id="uinArea">
                
                <label class="input-tips" for="u">账号：</label>
                <div class="inputOuter" id="uArea">
                    
                    <input type="text" id="u" name="username" class="inputstyle"/>
                </div>
                </div>
                <div class="pwdArea" id="pwdArea">
               <label class="input-tips" for="p">密码：</label> 
               <div class="inputOuter" id="pArea">
                    
                    <input type="password" id="p" name="password" class="inputstyle" />
                </div>
                </div>
               
                <div style="padding-left:50px;margin-top:20px;"><input type="submit" value="登 录" style="width:150px;" class="button_blue"/></div>
              </form>
           </div>
           
            	</div>
               
            </div>
            <!--登录end-->
  </div>

  <!--注册-->
    <div class="qlogin" id="qlogin" style="display: none; ">
   
    <div class="web_login"><form name="form2" id="regUser" accept-charset="utf-8"  action="register" method="post">
	      <input type="hidden" name="to" value="reg"/>
		      		       <input type="hidden" name="did" value="0"/>
        <ul class="reg_form" id="reg-ul">
        		<div id="userCue" class="cue"></div>	<!-- 显示格式错误 -->
                <li>              	
                    <label for="user"  class="input-tips2">用户名：</label>
                    <div class="inputOuter2">
                        <input type="text" id="user" name="username" maxlength="16" class="inputstyle2" placeholder="  4-16字符"/>
                    </div>                    
                </li>
                
                <li>
                <label for="passwd" class="input-tips2">密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd"  name="password" maxlength="16" class="inputstyle2" placeholder="  不少于六位" />
                    </div>
                    
                </li>
                <li>
                <label for="passwd2" class="input-tips2">确认密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="passwd2" name="" maxlength="16" class="inputstyle2" placeholder="  不少于六位"/>
                    </div>
                    
                </li>
                
                <li>
              		<label class="input-tips2">昵称：</label>
                    <div class="inputOuter2">
                        <input type="text"	name="nickname" maxlength="16" class="inputstyle2" placeholder="  可不填"//>
                    </div>            
                </li>
                
                <li>
              		<label class="input-tips2">性别：</label>
                    <div class="inputOuter2">
                        <input type="text"	name="sex" maxlength="16" class="inputstyle2" />
                    </div>            
                </li>
                
                <li>
              		<label class="input-tips2">地址：</label>
                    <div class="inputOuter2">
                    <input type="text"	name="address" maxlength="16" class="inputstyle2" placeholder="  可不填"/>
                    </div>            
                </li>
                
                
                <li>
                    <div class="inputArea">
                        <input type="button" id="reg"  style="margin-top:10px;margin-left:85px;" class="button_blue" value="同意协议并注册"/> <a href="#" class="zcxy" target="_blank">注册协议</a>
                    </div>
                    
                </li><div class="cl"><font color="red">${rigsterError}</font>	<!-- 显示错误 --></div>	<!-- 非格式错误 -->
                
            </ul></form>
           
    
    </div>
   
    
    </div>
    <!--注册end-->
</div>
<div class="yejiao">@版权所有www.xxxxxxx.com</div>
</body></html>