$(function () {
    $("#text1").keyup(function(){
        $("#text1").popover('hide');
        var length = 200;
        var content_len = $("#text1").val().length;
        var out_len=content_len-length;
        $("#message1").html('');
        $("#message2").html('');
        // 当用户输入的字数大于制定的数时，让提交按钮失效
        // 小于制定的字数，就可以提交
        if(content_len >200){
            $("#message2").html('您已超出'+out_len+'字');
            $("#message2").css({"color":"red"});
            // 可以继续执行其他操作
        }else{
            $("#message1").html('');
            $("#submit").attr("disabled",false);
            return false;
        }
    });
    // $("#text1").blur(function(){
    //     var length = 200;
    //     var content_len = $("#text1").val().length;
    //     var in_len = length-content_len;
    //     var out_len=content_len-length;
    //     // 当用户输入的字数大于制定的数时，让提交按钮失效
    //     // 小于制定的字数，就可以提交
    //     if(content_len >200){
    //         $("#message2").html('您已超出'+out_len+'字');
    //         $("#message2").css({"color":"red"});
    //         // 可以继续执行其他操作
    //     }else{
    //         $("#message2").html('');
    //         $("#message1").html('');
    //         $("#submit").attr("disabled",false);
    //         return false;
    //     }
    // });
}); 