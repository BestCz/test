<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<%
        //加载i18n资源文件，request.getLocale()获取访问用户所在的国家地区
        ResourceBundle myResourcesBundle = ResourceBundle.getBundle("com.cz.international.myproperties",request.getLocale());
%>

<p>Cz@ 2016 <%=myResourcesBundle.getString("banquan")%></a></p>

</html>