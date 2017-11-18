$(function(){

  toastr.options = {

"closeButton": true, //是否显示关闭按钮

"debug": false, //是否使用debug模式

"positionClass":'toast-center-center',//弹出窗的位置

"showDuration": "300",//显示的动画时间

"hideDuration": "300",//消失的动画时间

"timeOut": "1000", //展现时间

"extendedTimeOut": "1000",//加长展示时间

"showEasing": "swing",//显示时的动画缓冲方式

"hideEasing": "linear",//消失时的动画缓冲方式

"showMethod": "fadeIn",//显示时的动画方式

"hideMethod": "fadeOut" //消失时的动画方式

};

    $("#student").click(function(){
        $("#s-load").css("display","block");
        $("#m-load").css("display","none");
        $(this).css("border-bottom","2px solid #7AC5CD");
        $("#manager").css("border","none")
        $(".student-a").css("color","#337ab7")
        $(".teacher-a").css("color","#555");
  });
    $("#manager").click(function(){
        $("#s-load").css("display","none");
        $("#m-load").css("display","block");
        $(this).css("border-bottom","2px solid #7AC5CD");
        $("#student").css("border","none")
        $(".teacher-a").css("color","#337ab7")
        $(".student-a").css("color","#555");

  });

  $("#s-load").click(function(){
    if ($("#userID").val()=="") {
      toastr.error("请输入账号");
    }
    if ($("#password").val()=="") {
       toastr.error("请输入密码");
    }
     else{
        $.ajax({
            method:"post",
            url:"/userLogin",
            data:{
                "account":$("#userID").val(),
                "password":$("#password").val()
            },
            dataType: "json",
            success:function (result) {
                if(result.status == "登录成功"){
                    toastr.success(result.status);
                    window.setTimeout("self.location='/login'",1500);
                }
                else{
                    toastr.error(result.status);
                }
            },
            error:function (result) {
                toastr.error("登录失败");
            }
        });
    }
  });

  $("#m-load").click(function(){
      if ($("#userID").val()=="") {
          toastr.error("请输入账号");
      }
      if ($("#password").val()=="") {
          toastr.error("请输入密码");
      }
      else{
        $.ajax({
            method:"post",
            url:"/managerLogin",
            data:{
                "account":$("#userID").val(),
                "password":$("#password").val()
            },
            dataType: "json",
            success:function (result) {
                if(result.status == "登录成功"){
                    toastr.success(result.status);
                    window.setTimeout("self.location='/login'",1500);
                }
                else{
                    toastr.error(result.status);
                }
            },
            error:function (result) {
                toastr.error("登录失败");
            }
        });
    }
  });
})