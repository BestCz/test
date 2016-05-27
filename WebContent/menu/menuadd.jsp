<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="../jquery/menu.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="top"></div>
<div id="header">
	<div class="logo">汽车租赁系统</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">张山</a></li>
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
		<jsp:include page="../left.jsp"></jsp:include>
	</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
			
						</ul>
			</div>
			<div class="main">
				<div align="center">
<form action="../MenuAdd.do">
<br><br><br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size:30px; font-weight:bold;">车辆添加
	<br><br>
	<span style="font-size:15px; font-weight:bold;">
	车牌号:<input type="text" name="mid"><br>
	品牌:<input type="text" name="mname"><br>
	车辆类型:<input type="text" name="mpicture"><br>
	价格:<input type="text" name="mprice"><br>
	<input type="submit" value="提交">

</form>
</div>
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><jsp:include page="../footer.jsp"></jsp:include></div>
<script>navList(12);</script>
</body>
</html>