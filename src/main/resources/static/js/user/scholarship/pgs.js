$(function () {
    $('#birth').datetimepicker({
        bootcssVer:3,
        language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月',
        startView: "year",
        minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
        autoclose: true,//选中自动关闭
    });
    $('#entrance').datetimepicker({
        bootcssVer:3,
        language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月',
        startView: "year",
        minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
        autoclose: true,//选中自动关闭
    });
    $('#date1').datetimepicker({
    	bootcssVer:3, 
    	language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月', 
        startView: "year",
         minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
 		autoclose: true,//选中自动关闭
    });  
    $('#date2').datetimepicker({ 
        bootcssVer:3, 
        language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月', 
        startView: "year",
         minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
        autoclose: true,//选中自动关闭

    });  
    $('#date3').datetimepicker({ 
        bootcssVer:3, 
        language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月', 
        startView: "year",
         minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
        autoclose: true,//选中自动关闭

    });
    $('#date4').datetimepicker({
        bootcssVer:3,
        language: 'zh-CN',
        format: 'yyyy'+'年'+'m'+'月',
        startView: "year",
        minView: "year",//设置只显示到月份
        initialDate: new Date(),//初始化当前日期
        autoclose: true,//选中自动关闭

    });
    $("#identity").keyup(function () {
        var idNo=$("#identity").val();
        var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if(regIdNo.test(idNo)){
            $("#identity-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#identity-message").html("请输入正确的身份证号");
        }
    });
    $("#classSum").keyup(function () {
        $("#classSum").popover('hide');
        var r=/^[0-9]*$/;
        var number= $("#classSum").val();
        var length=number.length;
        if(r.test(number)){
            if(length>3){
                $("#classSum-message").html("长度超过三个");
                $("#submit").attr("disabled",true);
            }
            else{
                $("#classSum-message").html("");
                $("#submit").attr("disabled",false);
            }
        }
        else{
            $("#classSum-message").html("请输入数字");
            $("#submit").attr("disabled",true);
        }
    })
    $("#passSum").keyup(function () {
        $("#passSum").popover('hide');
        var r=/^[0-9]*$/;
        var number= $("#passSum").val();
        var length=number.length;
        if(r.test(number)){
            if(length>3){
                $("#passSum-message").html("长度超过三个");
                $("#submit").attr("disabled",true);
            }
            else{
                $("#passSum-message").html("");
                $("#submit").attr("disabled",false);
            }
        }
        else{
            $("#passSum-message").html("请输入数字");
            $("#submit").attr("disabled",true);
        }
    })
    $("#phone").keyup(function(){
        $("#phone").popover('hide');
        var r=/^[0-9]*$/;
        var number= $("#phone").val();
        if(r.test(number)){
            $("#phone-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#phone-message").html("请输入数字");
        }
    });
    $("#name1").keyup(function(){
         $("#place1").popover('hide');
         var content_len = $("#name1").val().length;
         if(content_len >34){
            $("#name11").html('奖项名称已超出');
         }else{
            $("#name11").html('');
            return false;
         }       
    });
    $("#place1").keyup(function(){
        $("#place1").popover('hide');
         var content_len = $("#place1").val().length;
         if(content_len >30){
            $("#place11").html('单位名称已超出');
         }else{
            $("#place11").html('');
            return false;
         }       
    });
    $("#name2").keyup(function(){
         $("#place2").popover('hide');
         var content_len = $("#name2").val().length;
         if(content_len >34){
            $("#name22").html('奖项名称已超出');
         }else{
            $("#name22").html('');
            return false;
         }       
    });
    $("#place2").keyup(function(){
        $("#place2").popover('hide');
         var content_len = $("#place2").val().length;
         if(content_len >30){
            $("#place22").html('单位名称已超出');
         }else{
            $("#place22").html('');
            return false;
         }       
    });
    $("#name3").keyup(function(){
         $("#place3").popover('hide');
         var content_len = $("#name3").val().length;
         if(content_len >34){
            $("#name33").html('奖项名称已超出');
         }else{
            $("#name33").html('');
            return false;
         }       
    });
    $("#place3").keyup(function(){
        $("#place3").popover('hide');
         var content_len = $("#place3").val().length;
         if(content_len >30){
            $("#place33").html('单位名称已超出');
         }else{
            $("#place33").html('');
            return false;
         }       
    });
    $("#name4").keyup(function(){
        $("#place4").popover('hide');
        var content_len = $("#name4").val().length;
        if(content_len >34){
            $("#name44").html('奖项名称已超出');
        }else{
            $("#name44").html('');
            return false;
        }
    });
    $("#place4").keyup(function(){
        $("#place4").popover('hide');
        var content_len = $("#place4").val().length;
        if(content_len >30){
            $("#place44").html('单位名称已超出');
        }else{
            $("#place44").html('');
            return false;
        }
    });

    $("#submit").mouseover(function(){
        if (($("#name11").html()!="" )||($("#place11").html()!="" )) {
            $("#submit").attr("disabled",true);
        }
        if(($("#name22").html()!="" )||($("#place22").html()!="" )){
             $("#submit").attr("disabled",true);
         }
          if(($("#name33").html()!="" )||($("#place33").html()!="" )){
             $("#submit").attr("disabled",true);
         }
        if (($("#name44").html()!="" )||($("#place44").html()!="" )) {
            $("#submit").attr("disabled",true);
        }
        if (($("#message2").html()!="")||($("#phone-message").html()!="")||($("#identity-message").html()!="")||($("#classSum-message").html()!="" )||($("#passSum-message").html()!="" )) {
            $("#submit").attr("disabled",true);
        }
         else{
            $("#submit").attr("disabled",false);
        }

     });



     $("#submit").click(function(){
         if( (($("#name1").val()=="")&&($("#place1").val()=="")&&($("#date1").val()==""))||
            (($("#name1").val()!="")&&($("#place1").val()!="")&&($("#date1").val()!=""))
            ){
  if( (($("#name2").val()=="")&&($("#place2").val()=="")&&($("#date2").val()==""))||
            (($("#name2").val()!="")&&($("#place2").val()!="")&&($("#date2").val()!=""))
            ){
              if( (($("#name3").val()=="")&&($("#place3").val()=="")&&($("#date3").val()==""))||
            (($("#name3").val()!="")&&($("#place3").val()!="")&&($("#date3").val()!=""))
            ){
                if((($("#name4").val()=="")&&($("#place4").val()=="")&&($("#date4").val()==""))||
                    (($("#name4").val()!="")&&($("#place4").val()!="")&&($("#date4").val()!=""))
                ){

                    if($("#phone").val()==""){
                        $("#phone").popover({
                            content:"请输入联系电话",
                        });
                        $("#phone").popover('show');
                        var position=$("#phone").offset().top-200;
                        $("html,body").animate({
                            "scrollTop":position},"slow");
                        return false;
                    }
                    if($("#classSum").val()==""){
                        $("#classSum").popover({
                            content:"请输入必修课数",
                        });
                        $("#classSum").popover('show');
                        var position=$("#classSum").offset().top-180;
                        $("html,body").animate({
                            "scrollTop":position},"slow");
                        return false;
                    }
                    if($("#passSum").val()==""){
                        $("#passSum").popover({
                            content:"请输入通过必修课数",
                        });
                        $("#passSum").popover('show');
                        var position=$("#passSum").offset().top-180;
                        $("html,body").animate({
                            "scrollTop":position},"slow");
                        return false;
                    }
                    if ($("#text1").val()=="") {
                        var position=$("#text1").offset().top-200;
                        $("#text1").popover({
                            content:"请输入主要事迹与表现",
                        });
                        $("#text1").popover('show');
                        $("html,body").animate({
                            "scrollTop":position},"slow");
                        return false;
                    }
                }else{
                    $("#place4").popover({
                        content:"请将信息填写完整",
                    });
                    $("#place4").popover('show');
                    var position=$("#place44").offset().top-200;
                    $("html,body").animate({
                        "scrollTop":position},"slow");
                    return false;
                }
     }
         else{
            $("#place3").popover({
                content:"请将信息填写完整",
            });
               $("#place3").popover('show');
                var position=$("#place33").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
     }
      else{
              $("#place2").popover({
               content:"请将信息填写完整",
            });
               $("#place2").popover('show');
              var position=$("#place22").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
     }
         else{
              $("#place1").popover({
                content:"请将信息填写完整",
            });
               $("#place1").popover('show');
              var position=$("#place11").offset().top-200;
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
   
     });


});