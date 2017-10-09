<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/paging.css">
</head>
<body>
    <div id="headtop">
        <div id="headtitle">
            Ryoukai在线题库
        </div>
        <div id="headbutton">
            <ul>
                <li class="firstlabel">
                    <a href="#">添加</a>
                    <ul>
                        <li class="secondlabel"><a href="">上传试题</a></li>
                    </ul>
                </li>
                <li class="firstlabel">
                    <a href="#">个人</a>
                    <ul>
                        <li class="secondlabel"><a href="">个人信息</a></li>
                        <li class="secondlabel"><a href="">我的题库</a></li>
                        <li class="secondlabel"><a href="">正在做题</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div id="headbottom">
        <div id="labeldiv">
            <ul>
                <li><a href="">Java</a></li>
                <li><a href="">C++</a></li>
                <li><a href="">PHP</a></li>
            </ul>
        </div>
        <div id="slogan">
            朴素，心无旁骛
        </div>
    </div>
    <div id="center">
        <div class="tablebox">
            <table id="testtable">
                <tr class="firsttr">
                    <th class="testtitle">试题名称</td>
                    <th class="uploader">上传者</td>
                    <th class="testtype">试题类型</td>
                </tr>
            </table>
        </div>
        <div id="box" class="box"></div>
    </div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/paging.min.js"></script>
<script>
	var pageSize = 15;	//每页大小
	var totalCount;	//总数据条数
	var totalPages;	//总页数
	$('#box').paging({
	    initPageNo: 1, // 初始页码
	    totalPages: totalPages, //总页数
        totalCount: '合计' + totalCount + '条数据', // 条目总数
	    slideSpeed: 600, // 缓动速度。单位毫秒
	    jump: true, //是否支持跳转
	    callback: function(page) { // 回调函数
			$.ajax({
	    		type:'post',
	    		url:'${pageContext.request.contextPath}/test/testlist',
	    		data:'pageNumber='+page+'&pageSize='+pageSize,
	    		success:function(data){
	    			/*totalCount = data.total;
	    			if(totalCount < 15) {
	    				totalPages = 1;
	    			}
	    			else {
		    			totalPages = totalCount/pageSize;
	    			}*/
	    			for(var i = 0; i < data.rows.length; i++) {
	    				$('#testtable').append(
	    						'<tr class="datatr">' + 
	    						  '<td class="testtitle"><a href="${pageContext.request.contextPath}/writesubject?testId='+ data.rows[i].testId + '">' + data.rows[i].testDesc + '</a></td>' + 
	    						  '<td class="uploader"><a href="">' + data.rows[i].uploader.username + '</a></td>' + 
	    						  '<td class="testtype">' + data.rows[i].testType + '</td>' + 
	    						'</tr>');
	    			}
	    		}
	    	});
	    }
	})
</script>
</html>