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
      return false;
    }
    if ($("#password").val()=="") {
       toastr.error("请输入密码");
      return false;
    }
    else{
    $.ajax({
    type:"POST",
    url:"userLogin",
    data:{
    userID:$("#userID").val(),
    password:$("#password").val(),
    },
    success:function(result){
      var res = String($.trim(result)); 
       toastr.error(res);
    },
    }); 
    }
  });

  $("#m-load").click(function(){
        if ($("#userID").val()=="") {
    toastr.error("请输入账号");
      return false;
    }
    if ($("#password").val()=="") {
       toastr.error("请输入密码");
      return false;
    }
    else{
        $.ajax({
            type:"POST",
            url:"managerLogin",
            data:{
            userID:$("#userID").val(),
            password:$("#password").val(),
    },
    success:function(result){
      var res = String($.trim(result)); 
       toastr.error(res);
    },
    }); 
    }  
  });
})