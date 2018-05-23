$(function () {
   $("[data-toggle='popover']").popover('hide');
     $("#job").keyup(function(){
        $("#job").popover('hide');
         var r=/^[\u4e00-\u9fa5]*$/;//汉字
         var number=$("#job").val();
         var content_len = $("#job").val().length;
          if(r.test(number)){
            if(content_len >6){
            $(".length-message2").html('最多输入6个字符');      
         }else{

             $(".length-message2").html("");
              $("#submit").attr("disabled",false);
            return false;
         }  
        }
        else{
            $(".length-message2").html("只能输入汉字");
        }   
    });

     $("#submit").mouseover(function(){
          if(($(".length-message2").html()!="" )||($("#message2").html()!="")){
             $("#submit").attr("disabled",true);
         }
     });

     $("#submit").click(function(){        
         if ($("#job").val()=="") {
                        $("#job").popover({
                content:"请输入职位",
            });
            $("#job").popover('show');
            var position=$("#job").offset().top-200;
            $("html,body").animate({
                 "scrollTop":position},"slow"); 
            return false;
         }
                if ($("#text1").val()=="") {
                     $("#text1").popover({
                content:"请输入主要事迹与表现",
            });
                      $("#text1").popover('show');
            return false;
         }
         
     });


});