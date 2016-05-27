<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="jquery/menu.js"></script>
<link rel=stylesheet type=text/css href="css/css.css" media=all>
<SCRIPT type=text/javascript src="js/xixi.js"></SCRIPT>
<SCRIPT type=text/javascript src="js/jquery.tooltip.pack.js"></SCRIPT>
<SCRIPT type=text/javascript src="js/player.js"></SCRIPT>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>车辆管理</h4>
          <div class="list-item none">
            <a href='http://localhost:8080/dingcan/MenuGetlist.do'>车辆列表</a>
            <a href='menu/menuselect.jsp'>查找车辆</a>
            <a href='menu/menuadd.jsp'>添加车辆</a>
          </div>
        </li>
        <li>
          <h4 class="M2"><span></span>员工管理</h4>
          <div class="list-item none">
          	<a href='http://localhost:8080/dingcan/EmployeeGetlist'>员工列表</a>
            <a href='employee/employeeadd.jsp'>添加员工</a>
            <a href='employee/employeeselect.jsp'>查找员工</a>
                 
           </div>
        </li>
        <li>
          <h4 class="M3"><span></span>订单管理</h4>
          <div class="list-item none">
          	<a href='http://localhost:8080/dingcan/OrderGetlist'>订单列表</a>
            <a href='order/orderadd.jsp'>添加订单</a>
            <a href='order/orderselect.jsp'>查找订单</a>
            
          </div>
        </li>
		<li>
          <h4 class="M4"><span></span>客户管理</h4>
          <div class="list-item none">
            <a href='http://localhost:8080/dingcan/ClientGetlist'>客户列表</a>
            <a href='client/clientadd.jsp'>添加客户</a>
            <a href='client/clientselect.jsp'>查找客户</a>
          </div>
        </li>
        		
			
  </ul>
</body>
</html>