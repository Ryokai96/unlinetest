<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>writesubject</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/writesubject.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/paging.css">
</head>
<body>
    <div id="header">
        <div id="infobar">
            <span id="username"><%=session.getAttribute("username") %>，正在做题</span>
            <span id="testtype">试题类型: xxx</span>
            <span id="testtime" class="timer-simple-seconds" timer="3600">已用时: 
            	<span class="hour">00</span>:
            	<span class="minute">00</span>:
            	<span class="second">00</span>
			</span>
        </div>
        <div id="titlebar">
            <a href="">Ryoukai在线题库</a>
        </div>
    </div>
    <div id="section"></div>
    <div id="footer">
        <div id="box" class="box"></div>
        <div id="subdiv">
            <input id="sub" type="button" value="提交">
            <input id="save" type="button" value="保存">
        </div>
    </div>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/paging.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/timekeeper.js"></script>
<script type="text/javascript">
	var testId = ${testId};
	$(document).ready(function(){
		$.ajax({
    		type:'post',
    		url:'${pageContext.request.contextPath}/test/showtest',
    		data:'testId='+testId,
    		success:function(data){
    			var testType = data.testType;
    			$('#testtype').text('试题类型: ' + testType);
    			for(var i = 0; i < data.questions.length; i ++) {
    				$('#section').append(
    						'<div style="display:none" id="test' + data.questions[i].questionId + '" class="testcontent">' + 
    						'<div class="question">' + data.questions[i].questionContent + '</div>' + 
    						'<div class="questionoptions"><form name="questionoptions"></form></div>' + 
    						'</div>');
    				for(var key in data.questions[i].options) {
    					if(data.questions[i].questionType == "SC") {
    						$('#test'+data.questions[i].questionId).find('[name="questionoptions"]').append(
	    							'<label><input name="questionoption" type="radio" value="' + key + '"/>' + 
	    							key + '、' + data.questions[i].options[key] + 
	    							'</label><br/>');
    					}
    					if(data.questions[i].questionType == "MC") {
    						$('#test'+data.questions[i].questionId).find('[name="questionoptions"]').append(
	    							'<label><input name="questionoption" type="checkbox" value="' + key + '"/>' + 
	    							key + '、' + data.questions[i].options[key] + 
	    							'</label><br/>');
    					}
    				}
    			}
    			
    			$('#sub').click(function(){
    				var map = {};
    				for(var i = 0; i < data.questions.length; i++) {
    					if(data.questions[i].questionType == "SC") {
    						if($('#test'+data.questions[i].questionId).find('[name="questionoption"]:checked').val() == data.questions[i].solution) {
    							map[i+1] = "true";
    						}
    						else {
    							map[i+1] = "false";
    						}
    					}
    					if(data.questions[i].questionType == "MC") {
    						var str = "";
    						$.each($('#test'+data.questions[i].questionId).find('[name="questionoption"]:checked'), function(){
    							str += $(this).val();
    						});
    						if(str == data.questions[i].solution) {
    							map[i+1] = "true";
    						}
    						else {
    							map[i+1] = "false";
    						}
    					}
    				}
    				var result = "";
    				for(var key in map) {
    					result += key + ": " + map[key] + "\n";
    				}
    				alert(result);
    			});
    			
    			$('#box').paging({
    			    initPageNo: 1, // 初始页码
    			    totalPages: data.questions.length, //总页数
    		        totalCount: '共' + data.questions.length + '题', // 条目总数
    			    slideSpeed: 600, // 缓动速度。单位毫秒
    			    jump: true, //是否支持跳转
    			    callback: function(page) { // 回调函数
    			    	for(var i = 1; i <= data.questions.length; i++) {
    			    		if(i == page) {
    	    			    	$('#test'+i).css('display','block');
    			    		}
    			    		else {
    			    			$('#test'+i).css('display','none');
    			    		}
    			    	}
    			    }
    			});
    		}
    	});
	});
</script>
</html>