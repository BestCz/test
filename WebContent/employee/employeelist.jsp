<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">系统公告</a></li>
								<li>></li>
								<li><a href="#">最新公告</a></li>
						</ul>
			</div>
			<div class="main">
				<div align="center">
<div align="center">
<table width="100%" border="0">
	<tr bgcolor="#66ccff">
	<td width="25%"><div align="center">账号</div></td>
	<td width="25%"><div align="center">密码</div></td>
	<td width="14%"><div align="center">姓名</div></td>
	<td width="14%"><div align="center">年龄</div></td>
	<td width="14%"><div align="center">操作</div></td>
	
	</tr>
	<c:forEach var="im" items="${employeelist }">
		<tr>
			<td width="25%"><div align="center">${im.eid }</div></td>
			<td width="25%"><div align="center">${im.epassword }</div></td>
			<td width="14%"><div align="center">${im.ename}</div></td>
			<td width="14%"><div align="center">${im.age }</div></td>
			<td width="14%"><div align="center"><a href="EmployeeDel?id=${im.eid }">删除</a>
												<a href="http://localhost:8080/dingcan/employee/employeemod.jsp?id=${im.eid }">修改</a></div></td>
		</tr>
	</c:forEach>
</table>
</div>
</div>
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><jsp:include page="../footer.jsp"></jsp:include></div>
<script>navList(12);</script>
</body>
</html>