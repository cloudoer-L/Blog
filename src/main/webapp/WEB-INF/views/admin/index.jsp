<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
    <meta charset="utf-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="description" content="">
  	<meta name="keywords" content="">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<title>Hello Amaze UI</title>

  	<!-- Set render engine for 360 browser -->
  	<meta name="renderer" content="webkit">

  	<!-- No Baidu Siteapp-->
  	<meta http-equiv="Cache-Control" content="no-siteapp"/>

  	<link rel="icon" type="image/png" href="<%=basePath%>/jslib/amazeUI/i/favicon.png">

  	<!-- Add to homescreen for Chrome on Android -->
  	<meta name="mobile-web-app-capable" content="yes">
  	<link rel="icon" sizes="192x192" href="<%=basePath%>/jslib/amazeUI/i/app-icon72x72@2x.png">

  	<!-- Add to homescreen for Safari on iOS -->
  	<meta name="apple-mobile-web-app-capable" content="yes">
  	<meta name="apple-mobile-web-app-status-bar-style" content="black">
  	<meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  	<link rel="apple-touch-icon-precomposed" href="<%=basePath%>/jslib/amazeUI/i/app-icon72x72@2x.png">

  	<!-- Tile icon for Win8 (144x144 + tile color) -->
  	<meta name="msapplication-TileImage" content="<%=basePath%>/jslib/amazeUI/i/app-icon72x72@2x.png">
  	<meta name="msapplication-TileColor" content="#0e90d2">

  	<link rel="stylesheet" href="<%=basePath%>/jslib/amazeUI/css/amazeui.min.css">
  	<link rel="stylesheet" href="<%=basePath%>/jslib/amazeUI/css/app.css">

  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
