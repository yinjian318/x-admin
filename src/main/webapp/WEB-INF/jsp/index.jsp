<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/pages/taglibs.jsp"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>后台登录-X-admin2.0</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
	<link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="index.jsp">X-admin v2.0</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav left fast-add" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">+新增</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('资讯','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>资讯</a></dd>
              <dd><a onclick="x_admin_show('图片','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>图片</a></dd>
               <dd><a onclick="x_admin_show('用户','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>用户</a></dd>
            </dl>
          </li>
        </ul>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
              <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
              <dd><a href="login.jsp">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="/">前台首页</a></li>
        </ul>
        
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side">
            <div class="nav-close">
                <i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <div class="silde_btn">
                    <a class="navbar-minimalize" href="#"> <img
                            src="${ctx}/images/list_icon.png">
                    </a>
                </div>
                <ul class="nav" id="side-menu">
                    <c:forEach var="rootList" items="${rootList}">
                        <li class="ul_li">
                            <a href="#">
                                <i class="fa ${rootList.reserve04}"></i>
                                <span class="nav-label">${rootList.resourceName}</span>
                                <span class="fa fa-angle-left right fa_douClick"></span>
                            </a>
                            <ul class="nav nav-second-level" id="nav1">
                                <c:forEach var="childrenList" items="${childrenList}">
                                    <c:if test="${childrenList.parentId == rootList.resourceId && childrenList.resourceType == 1}">
                                        <li>
                                            <a class="J_menuItem" href="" id="${childrenList.resourceCode}">${childrenList.resourceName}</a>
                                        </li>
                                    </c:if>
                                    <c:if test="${childrenList.parentId == rootList.resourceId && childrenList.resourceType == 2}">
                                        <li>
                                            <a class="J_menuItem" href="${ctx}/${childrenList.resourceUrl}.do">${childrenList.resourceName}</a>
                                        </li>
                                    </c:if>
                                </c:forEach>
                            </ul>

                            <div class="tabDiv_PST  disNone">
                                <span class="lingxing">◆</span>
                                <p>${rootList.resourceName}</p>
                                <ul class="nav nav-second-level" id="nav2">
                                    <c:forEach var="childrenList" items="${childrenList}">
                                        <c:if test="${childrenList.parentId == rootList.resourceId && childrenList.hasChild > 0}">
                                            <li>
                                                <a class="J_menuItem" href="">${childrenList.resourceName}</a>
                                            </li>
                                        </c:if>
                                        <c:if test="${childrenList.parentId == rootList.resourceId && childrenList.hasChild == 0}">
                                            <li>
                                                <a class="J_menuItem" href="${ctx}/${childrenList.resourceUrl}.do">${childrenList.resourceName}</a>
                                            </li>
                                        </c:if>
                                    </c:forEach>
                                </ul>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </nav>
        <!--管理对应三级菜单-->
        <%--	<c:forEach var="youngList" items="${youngList}" varStatus="status">
                <nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-${youngList.resourceCode}">
                    <h3>${youngList.resourceName}</h3>
                    <c:forEach var="cList" items="${cList}">
                        <c:if test="${cList.parentId == youngList.resourceId}">
                            <a href="${ctx}/${cList.resourceUrl}.do">${cList.resourceName}</a>
                        </c:if>
                    </c:forEach>
                    <img src="${ctx}/images/closecol.png" alt="" class="closecol"/>
                </nav>
            </c:forEach>--%>
        <!--左侧导航结束-->
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1 cbp-spmenu-push rightTback">
            <!-- 右侧抬头部分 -->
            <div class="row border-bottom"></div>
            <!-- 右侧tabs设置 content-tabs -->
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft">
                    <i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="${ctx}/home/goHome.do">消息中心</a>
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight">
                    <i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">
                        关闭操作<span class="caret"></span>
                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a></li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a></li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a></li>
                    </ul>
                </div>
                <a href="${ctx}/index/toLogin.do" class="roll-nav roll-right J_tabExit"><i
                        class="fa fa fa-sign-out"></i>退出</a>
            </div>
            <!-- 右侧中间主体部分 -->
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" id="iframe" name="iframe0" width="100%" height="100%"
                        src="${ctx}/home/toHome.do" data-id="${ctx}/home/toHome.do" frameborder="0" seamless></iframe>
            </div>
        </div>
        <div id="caiji" style="width:calc(100% - 360px)"></div>
        <!--右侧部分结束-->
    </div>
    <script>

    </script>
</body>
</html>