$(function () {  

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

    $("#submit").mouseover(function(){
        if (($("#name11").html()!="" )||($("#place11").html()!="" )) {
            $("#submit").attr("disabled",true);
        }
        if(($("#name22").html()!="" )||($("#place22").html()!="" )){
             $("#submit").attr("disabled",true);
         }
       
         if (($("#message2").html()!="")) {
             $("#submit").attr("disabled",true);
         }
          if(($("#name33").html()!="" )||($("#place33").html()!="" )){
             $("#submit").attr("disabled",true);
         }else{
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
            (($("#name1").val()!="")&&($("#place1").val()!="")&&($("#date1").val()!=""))
            ){
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