<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/register.css">
</head>
<body>
	<form>
        <table id="infobox">
            <tr class="userinfotr">
                <td class="handler">用户名</td>
                <td class="data">
                    <input type="text" name="username">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">密码</td>
                <td class="data">
                    <input type="password" name="password">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">确认密码</td>
                <td class="data">
                    <input type="password" name="repassword">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">邮箱</td>
                <td class="data">
                    <input type="text" name="email">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">验证码</td>
                <td class="data">
                    <table>
                        <tr>
                            <td class="identifyingcode">
                                <input type="text" name="identifyingcode">
                            </td>
                            <td class="identifyingimg">
                                <img src="${pageContext.request.contextPath}/resources/images/identifyingcode/1.png">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <div id="bottomdiv">
            <input id="registerbutton" type="button" value="注册">
        </div>
    </form>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#registerbutton").click(function(){
	        var username = $("input[name='username']").val();
	        var password = $("input[name='password']").val();
	        var repassword = $("input[name='repassword']").val();
	        var email = $("input[name='email']").val();
	        var identifyingcode = $("input[name='identifyingcode']").val().toLowerCase();
	        if(username == "") {
	            alert("用户名不能为空");
	            return false;
	        } else if(password == "") {
	            alert("密码不能为空");
	            return false;
	        } else if(email == "") {
	        	alert("邮箱不能为空");
	        	return false;
	        } else if(identifyingcode == "") {
	        	alert("验证码不能为空");
	        	return false;
	        } else if(identifyingcode != "fnpb") {
	        	alert("验证码错误");
	        	return false;
	        } else if(password != password) {
	        	alert("两次输入密码不一致");
	            return false;
	        } else {
	        	$.ajax({
	        		type:'post',
	        		url:'${pageContext.request.contextPath}/register/userregister',
	        		data:'username='+username+'&password='+password+'&email='+email,
	        		success:function(data){
	        			alert(data.registerStateInfo);
		        		if(data.registerState == 1) {
		        			window.location.href="${pageContext.request.contextPath}/";
		        		}
	        		}
	        	});
	        }
		});
	});
</script>
</html>