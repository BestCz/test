<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="jquery/menu.js"></script>



</head>

<body>
<%
        //加载i18n资源文件，request.getLocale()获取访问用户所在的国家地区
        ResourceBundle myResourcesBundle = ResourceBundle.getBundle("com.cz.international.myproperties",request.getLocale());
%>
<div class="top"></div>
<div id="header">
	<div class="logo">汽车租赁管理系统</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="add.jsp">上传文件</a></li>
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
		<jsp:include page="left.jsp"></jsp:include>
	</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">系统公告</a></li>
								<li>></li>
								<li><a href="#">最新公告</a></li>
						</ul>
			</div>
			<div class="main">
				<jsp:include page="js/bbb.jsp"></jsp:include>
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><jsp:include page="footer.jsp"></jsp:include></div>
<script>navList(12);</script>
</body>
</html>