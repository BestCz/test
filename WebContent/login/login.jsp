<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<!--Google Fonts-->
</head>
<body>
<%
        //加载i18n资源文件，request.getLocale()获取访问用户所在的国家地区
        ResourceBundle myResourcesBundle = ResourceBundle.getBundle("com.cz.international.myproperties",request.getLocale());
%>
<div class="login">
	<h2>欢迎来到汽车租赁系统</h2>
	<div class="login-top">
		<h1><%=myResourcesBundle.getString("load")%></h1>
		<form action="../login">
			<input type="text" value="User Id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '<%=myResourcesBundle.getString("id")%>';} " name="eid">
			<input type="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '<%=myResourcesBundle.getString("ps")%>';} " name="epassword">
	   
	     <div class="forgot">	
	    	<input type="submit" value="Login" >
	  	</div>
	     </form>
	</div>
	<div class="login-bottom">
		<h3><%=myResourcesBundle.getString("new")%> &nbsp;<a href="#"><%=myResourcesBundle.getString("zhuce")%></a></h3>
	</div>
</div>
	
<div class="copyright">
	<p>Cz &copy;@版权所有</a></p>
</div>


</body>
</html>