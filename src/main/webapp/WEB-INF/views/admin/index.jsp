<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	  <script type="text/javascript" src="<%=basePath%>/jslib/jquery/jquery-3.2.1.min.js"></script>
	  <script type="text/javascript" src="<%=basePath%>/jslib/amazeUI/js/amazeui.min.js"></script>
	  <link rel="stylesheet" href="<%=basePath%>/jslib/amazeUI/css/admin.css">


  </head>
  
  <body>
  	<header class="am-topbar am-topbar-inverse admin-header">
		<div class="am-topbar-brand">
			<strong>BLOG</strong> <small>后台管理模板</small>
		</div>
		<button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span>
			<span class="am-icon-bars"></span>
		</button>
		<div class="am-collapse am-topbar-collapse" id="topbar-collapse">
			<ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
				<li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
				<li class="am-dropdown" data-am-dropdown>
					<a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
						<span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
					</a>
					<ul class="am-dropdown-content">
						<li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
						<li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
						<li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
					</ul>
				</li>
				<li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
			</ul>
		</div>
  	</header>

	<div class="am-cf admin-main">
		<!-- sidebar start -->
		<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
			<div class="am-offcanvas-bar admin-offcanvas-bar">
				<ul class="am-list admin-sidebar-list">
					<li><a href="javascript:;"><span class="am-icon-home"></span> 首页</a></li>
					<li><a href="javascript:;"><span class="am-icon-table"></span> 表格</a></li>
					<li><a href="javascript:;"><span class="am-icon-pencil-square-o"></span> 表单</a></li>
					<li><a href="javascript:;"><span class="am-icon-sign-out"></span> 注销</a></li>
				</ul>
			</div>
		</div>
		<!-- sidebar end -->

		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				<div class="am-tabs" data-am-tabs="{noSwipe: 1}" id="doc-tab-demo-1">
					<ul class="am-tabs-nav am-nav am-nav-tabs"></ul>
					<div class="am-tabs-bd"></div>
				</div>
				<br />
				<button type="button" class="am-btn am-btn-primary js-append-tab">插入 Tab</button>
			</div>
		</div>
	</div>
	<script>
		$(function() {
			var tabCounter = 0;
			var $tab = $('#doc-tab-demo-1');
			var $nav = $tab.find('.am-tabs-nav');
			var $bd = $tab.find('.am-tabs-bd');

			function addTab() {
				var nav = '<li><span class="am-icon-close"></span>' +
						'<a href="javascript: void(0)">标签2586876987698 ' + tabCounter + '</a></li>';
				var content = '<div class="am-tab-panel" style="width: 100%;height: 100%">动态插入的标签内容' + tabCounter + '</div>';

				$nav.append(nav);
				$bd.append(content);
				tabCounter++;
				$tab.tabs('refresh');
			}

			// 动态添加标签页
			$('.js-append-tab').on('click', function() {
				addTab();
			});

			// 移除标签页
			$nav.on('click', '.am-icon-close', function() {
				var $item = $(this).closest('li');
				var index = $nav.children('li').index($item);

				$item.remove();
				$bd.find('.am-tab-panel').eq(index).remove();

				$tab.tabs('open', index > 0 ? index - 1 : index + 1);
				$tab.tabs('refresh');
			});
		});
	</script>
  </body>
</html>
