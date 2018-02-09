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
<body class="login-bg">
    
    <div class="login">
        <div class="message">管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" >
            <input name="loginAccount" id="loginAccount" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" id="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录"  onclick="return login()" style="width:100%;" type="button">
            <hr class="hr20" >
        </form>
    </div>

    <script>
        function login() {
            var loginAccount = $("#loginAccount").val();
            var password = $("#password").val();
            $.ajax({
                type:"post",
                dataType : 'json',
                async:false,
                data:{loginAccount :loginAccount,
                    password : password},
                url:"${ctx}/login/checkLogin.do",
                success:function(data){
                    if(data.state != null || data.state != ""){
                        redirectUrl(data,loginAccount);
                    }
                }

            })
        }

        function redirectUrl(data,loginAccount){
            if(!data.state){
                layer.msg(data.msg);
            }else {
                var index = layer.load(1, {
                    shade: [0.5,'#fff'] //0.5透明度的白色背景
                });
                window.location.href = "${ctx}/login/loging.do?loginAccount="+loginAccount;
            }


        }


        
    </script>

</body>
</html>