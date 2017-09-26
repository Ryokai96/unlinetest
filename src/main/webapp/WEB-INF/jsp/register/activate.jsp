<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Activate</title>
<link rel="stylesheet" href="${path}/resources/css/activate.css">
</head>
<body>
	<div id="box">
        <div id="prompt">激活码已发送至邮箱，请前往查看<br/>并在下方填写激活码完成激活</div>
        <form action="">
            <table>
                <tr>
                    <td class="title">激活码:</td>
                    <td class="content">
                        <input type="text">
                    </td>
                </tr>
            </table>
            <div id="buttondiv">
                <input type="button" value="提交">
            </div>
        </form>
    </div>
</body>
</html>