$(function () {
    var nationArray = ["汉族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","朝鲜族","满族","侗族","瑶族","白族","土家族",
        "哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族","景颇族","柯尔克孜族",
        "土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","塔吉克族","怒族", "乌孜别克族",
        "俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"];
    var $nationSelect = $("#nation");
    for(var i=0;i< nationArray.length;i++){
        $nationSelect.append("<option value='${nationArray[i]}' >${nationArray[i]}</option>");
    }
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