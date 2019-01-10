<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/10 0010
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册信息</title>
</head>
<script>
    var wait=60;
    function time(o) {
        if (wait == 0) {
            o.removeAttribute("disabled");
            wait = 60;
        } else {

            o.setAttribute("disabled", true);
            o.value="重新发送(" + wait + ")";
            wait--;
            setTimeout(function() {
                    time(o)
                },
                1000)
        }
    }
    function fun2() {

        var v=document.getElementById("user").value;
        if(/^\w+@\w+(\.(com|net))(\.(cn|en))?$/.test(v)) {
            console.log("验证通过");
            document.getElementById("span1").innerText = "验证通过";
        } else {
            console.log("验证失败");
            document.getElementById("span1").innerText = "验证失败";
        }
    }
    //至少8-16个字符，至少1个大写字母，1个小写字母和1个数字，其他可以是任意字符
    function fun3() {
        var v= document.getElementById("password").value;
        if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/.test(v)){
            document.getElementById("span2").innerText = "验证通过";
        }else{
            console.log("验证失败");
            document.getElementById("span2").innerText = "验证失败";
        }
    }
    function  fun4() {document.getElementById("user").value="";}
    function  fun41() {document.getElementById("password").value="";}
    function  fun42() {document.getElementById("phone").value="";}
    function fun5() {
        var v= document.getElementById("phone").value;
        if(/^1(3|4|5|7|8)\d{9}$/.test(v)){
            document.getElementById("span3").innerText="验证通过"
        }else{
            document.getElementById("span3").innerText="请输入正确的手机号";
        }

    }
</script>
<body>
<div id="div1">
    <form action="/myform" method="post">
        <input type="text" value="邮箱格式的用户名" name="username" id="user" onclick="fun4()" onblur="fun2()"><span id="span1"></span>
        <br>
        <input type="password" value="******" name="password" id="password"  onclick="fun41()" onblur="fun3()"><span id="span2">至少8-16个字符，至少1个大写字母，1个小写字母和1个数字，其他可以是任意字符</span>
        <br>
        <input type="text" value="手机号" name="phone" id="phone" onclick="fun42()" onblur="fun5()">
        <input type="button" value="发送短信" id="button1" onclick="time(this)"><span id="span3"></span>
        <br>
        <input type="text" name="code">
        <input type="button"  value="提交验证码">

        <p><input type="checkbox">同意许可协议</p>

        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
