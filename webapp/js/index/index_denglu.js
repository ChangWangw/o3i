$(function () {
    $(".username").blur(function () {
        if (/[@，\n\t!'}{?,|#\$%\^&\*]+/gi.test($(this).val())) {
            $(".la1").html("用户名输入不规范！")
        } else if ($(this).val().length > $(this).val().trim().split(" ").join("").length) {
            $(".la1").html("用户名不能包含空格！")
        } else if ($(this).val().length < 4 || $(this).val().length > 10) {
            $(".la1").html("用户名为4~10个字！")
        }
    });

    $(".username").focus(function () {
        $(".la1").html("");
    });

    $(".password").blur(function () {
        if ($(this).val().length < 6 || $(this).val().length > 16) {
            $(".la2").html("密码为6~16个字符！")
        }
    });
    $(".password").focus(function () {
        $(".la2").html("");
    });
    $(".log").click(function () {
        window.location.href = $("#PageContext").val() + "/jsp/login.jsp";
    });

    $(".btn").click(function () {
        if ($(".la2").html().length === 0 && $(".username").val().length > 0 && $(".password").val().length > 0) {
            var username = $(".username").val();
            var password = $(".password").val();
            $.get($("#PageContext").val() + "/tbUser/login.do", {name: username, password: password}, function (data) {
                if (data === "true") {
                    window.location.href = $("#PageContext").val() + "/jsp/index.jsp";
                } else {
                    alert("账号无效！！");
                }
            })
        } else if ($(".username").val() === "" || $(".username").val() === null || $(".password").val() === "" || $(".password").val() === null) {
            alert("输入有误，请重新输入！！");
            return false;
        } else {
            alert("输入有误，请重新输入！！");
            return false;
        }
    });
    $(window).keydown(function (event) {
        if (event.keyCode === 13) {
            if ($(".la2").html().length === 0 && $(".username").val().length > 0 && $(".password").val().length > 0) {
                var username = $(".username").val();
                var password = $(".password").val();
                $.get($("#PageContext").val() + "/tbUser/login.do", {
                    name: username,
                    password: password
                }, function (data) {
                    if (data === "true") {
                        window.location.href = $("#PageContext").val() + "/jsp/index.jsp";
                    } else {
                        alert("账号无效！！");
                        $(".la").html("");
                        $(".username").val("");
                        $(".password").val("");
                    }
                })
            } else if ($(".username").val() === "" || $(".username").val() === null || $(".password").val() === "" || $(".password").val() === null) {
                alert("输入有误，请重新输入！！");
                return false;
            } else {
                alert("输入有误，请重新输入！！");
                $(".la").html("");
                $(".username").val("");
                $(".password").val("");
                return false;
            }
        }
    });
});