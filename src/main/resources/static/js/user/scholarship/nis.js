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
    $("#input-form").keyup(function(){
         $("#input-form").popover('hide');
         var length = 30;
         var content_len = $("#input-form").val().length;
         var out_len=content_len-length;   
         if(content_len >30){
            $("#input-form-message").html('您已超出'+out_len+'字');
            $("#input-form-message").css({"color":"red"});
            // 可以继续执行其他操作
         }else{
            $("#input-form-message").html("");
            $("#submit").attr("disabled",false);
            return false;
         }       
    });

    $("#home-address").keyup(function(){
          $("#home-address").popover('hide');
         var length = 14;
         var content_len = $("#home-address").val().length;
         var out_len=content_len-length;   
         if(content_len >length){
            $("#home-address-message").html('您已超出'+out_len+'字');
            $("#home-address-message").css({"color":"red"});
         }else{
            $("#home-address-message").html("");
            $("#submit").attr("disabled",false);
            return false;
         }       
    });

     $("#month-input").keyup(function(){
         $("#month-input").popover('hide');
        var r = /^\+?[1-9][0-9]*$/;　　//正整数
        var number= $("#month-input").val();
        if(r.test(number)){
            $("#month-input-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#month-input-message").html("请输入整数");
        }
    });
     $("#family-number").keyup(function(){
         $("#family-number").popover('hide');
        var r = /^\+?[1-9][0-9]*$/;　　//正整数
        var number= $("#family-number").val();
        if(r.test(number)){
            $("#family-number-message").html("");
            $("#submit").attr("disabled",false);
        }
        else{
            $("#family-number-message").html("请输入整数"); 
        }
    });
         $("#email").keyup(function(){
             $("#email").popover('hide');
        var number= $("#email").val().length;
        if(number!=6){
            $("#email-message").html("请输入6位邮政编码");        
        }
        else{
            $("#email-message").html("");
            $("#submit").attr("disabled",false);
        }
    });

            $("#farm").change(function(){
                 $("#farm").popover('hide');
                 $("#type").html("");
                 $("#submit").attr("disabled",false);          
            });
            $("#city").change(function(){
                 $("#farm").popover('hide');
                 $("#type").html(""); 
                 $("#submit").attr("disabled",false);         
            });
            $("#special").change(function(){
                 $("#common").popover('hide');
                 $("#type2").html("");
                 $("#submit").attr("disabled",false);          
            });
            $("#common").change(function(){
                 $("#common").popover('hide');
                 $("#type2").html(""); 
                 $("#submit").attr("disabled",false);         
            });

        $("#submit").mouseover(function(){
          if(($("#input-form-message").html()!="" )||($("#home-address-message").html()!="" )||($("#phone-message").html()!="")||
            ($("#month-input-message").html()!="" )||($("#message2").html()!="" )||($("#email-message").html()!="" )
            ||($("#family-number-message").html()!="" )||($("#identity-message").html()!="")||($("#classSum-message").html()!="" )||($("#passSum-message").html()!="" )){
            $("#submit").attr("disabled",true);
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
                        if( (($("#name4").val()=="")&&($("#place4").val()=="")&&($("#date4").val()==""))||
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
                            if($("#month-input").val()==""){
                                var position=$("#month-input").offset().top-200;
                                $("#month-input").popover({
                                    content:"请输入家庭月收入",
                                });
                                $("#month-input").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }
                            var type=$('input:radio[name="resident"]:checked').val();
                            if(type==null){
                                $("#farm").popover({
                                    content:"请选择",
                                });
                                $("#farm").popover('show');
                                // $("#type").html("请选择");
                                var position=$("#type").offset().top-200;
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }

                            if($("#input-form").val()==""){
                                var position=$("#input-form").offset().top-200;
                                $("#input-form").popover({
                                    content:"请输入收入来源",
                                });
                                $("#input-form").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }

                            if ($("#family-number").val()=="") {
                                var position=$("#family-number").offset().top-200;
                                $("#family-number").popover({
                                    content:"请输入家庭人口数",
                                });
                                $("#family-number").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }

                            if ($("#email").val()=="") {
                                var position=$("#email").offset().top-200;
                                $("#email").popover({
                                    content:"请输入邮政编码",
                                });
                                $("#email").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }
                            if ($("#home-address").val()=="") {
                                var position=$("#home-address").offset().top-200;
                                $("#home-address").popover({
                                    content:"请输入家庭住址",
                                });
                                $("#home-address").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                                return false;
                            }
                            var type=$('input:radio[name="situation"]:checked').val();
                            if(type==null){
                                $("#common").popover({
                                    content:"请选择",
                                });
                                $("#common").popover('show');
                                var position=$("#type2").offset().top-200;
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }
                            if ($("#text1").val()=="") {
                                var position=$("#text1").offset().top-200;
                                $("#text1").popover({
                                    content:"请输入申请理由",
                                });
                                $("#text1").popover('show');
                                $("html,body").animate({
                                    "scrollTop":position},"slow");
                                return false;
                            }
                        }else{
                            var position=$("#place44").offset().top-200;
                            $("#place4").popover({
                                content:"请将信息填写完整",
                            });
                            $("#place4").popover('show');
                            $("html,body").animate({
                                "scrollTop":position},"slow");
                            return false;
                        }
                    }
                    else{
              var position=$("#place33").offset().top-200;
               $("#place3").popover({
                content:"请将信息填写完整",
            });
               $("#place3").popover('show');
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
            }  else{
                  var position=$("#place22").offset().top-200;
              $("#place2").popover({
                content:"请将信息填写完整",
            });
               $("#place2").popover('show');
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }
  }
             else{
                  var position=$("#place11").offset().top-200;
              $("#place1").popover({
                content:"请将信息填写完整",
            });
               $("#place1").popover('show');
             $("html,body").animate({
                 "scrollTop":position},"slow"); 
              return false;
         }

     });


}); 