$(function () {
    $.ajax({
        url:"/scholarship/index",
        type: "get",
        dataType :"json",
    success	:function(data){
            var obj=eval(data);
        var list=$(".canwrite-itme");
        for(var i=0;i<list.length;i++){
            if(obj[i]==1){
                $(".canwrite-itme li").eq(i).addClass("btn-green");
            }
            if(obj[i]==0){
                $(".canwrite-itme li").eq(i).addClass("btn-blue");
            }
            else{
                $(".canwrite-itme li").eq(i).addClass("btn-gray");
            }
        }
    },
    error:function(data){
        alert("错误");
    }
});
});