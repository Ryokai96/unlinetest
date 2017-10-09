<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body>
	<div id="loginbox">
        <div id="systemtitle">
            Ryoukai在线题库
        </div>
        <form id="logininfo" method="post">
            <table id="infobox">
                <tr class="info">
                    <td class="handle">用户名</td>
                    <td class="data">
                        <input name="username" class="infoinput" type="text">
                    </td>
                </tr>
                <tr class="info">
                    <td class="handle">密码</td>
                    <td class="data">
                        <input name="password" class="infoinput" type="password">
                    </td>
                </tr>
                <tr class="info">
                    <td class="handle">验证码</td>
                    <td class="data">
                        <table class="identifying">
                            <tr>
                                <td class="identifyingcode">
                                    <input name="identifyingcode" class="infoinput" type="text">
                                </td>
                                <td class="identifyingimg">
                                    <img src="${pageContext.request.contextPath}/resources/images/identifyingcode/1.png">
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
            <div id="forgetpassword">
                <a href="">忘记密码?</a>
            </div>
            <div id="sub">
                <input id="logininput" type="button" value="登录">
                <input id="registerinput" type="button" value="注册">
            </div>
        </form>
    </div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
	    $("#logininput").click(function(){
	        var username = $("input[name='username']").val();
	        var password = $("input[name='password']").val();
	        var identifyingcode = $("input[name='identifyingcode']").val().toLowerCase();
	        if(username == "") {
	            alert("用户名不能为空");
	            return false;
	        } else if(password == "") {
	            alert("密码不能为空");
	            return false;
	        } else if(identifyingcode == "") {
	        	alert("验证码不能为空");
	        	return false;
	        } else if(identifyingcode != "fnpb") {
	        	alert("验证码错误");
	        	return false;
	        } else {
	        	$.ajax({
	        		type:'post',
	        		url:'${pageContext.request.contextPath}/login/userlogin',
	        		data:'username='+username+'&password='+password,
	        		success:function(data){
	        			alert(data.loginStateInfo);
		        		if(data.loginState == 1) {
		        			window.location.href="${pageContext.request.contextPath}/";
		        		}
	        		}
	        	});
	        }
	    });
	    $("#registerinput").click(function(){
	    	window.location.href="${pageContext.request.contextPath}/userregister";
	    });
	});
</script>
</html>