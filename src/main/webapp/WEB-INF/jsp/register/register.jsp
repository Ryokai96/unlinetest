<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<link rel="stylesheet" href="${path}/resources/css/register.css">
</head>
<body>
	<form action="">
        <table id="infobox">
            <tr class="userinfotr">
                <td class="handler">用户名</td>
                <td class="data">
                    <input type="text">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">密码</td>
                <td class="data">
                    <input type="text">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">确认密码</td>
                <td class="data">
                    <input type="text">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">邮箱</td>
                <td class="data">
                    <input type="text">
                </td>
            </tr>
            <tr class="userinfotr">
                <td class="handler">验证码</td>
                <td class="data">
                    <table>
                        <tr>
                            <td class="identifyingcode">
                                <input type="text">
                            </td>
                            <td class="identifyingimg">
                                <img src="" alt="">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <div id="bottomdiv">
            <input type="button" value="注册">
        </div>
    </form>
</body>
</html>