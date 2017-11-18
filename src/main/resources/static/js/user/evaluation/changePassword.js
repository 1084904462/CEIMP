    $(function () {
        $("#new2").keyup(function(){
            $("#new2").popover('hide');
            if ($("#new1").val()!=$("#new2").val()) {
                $("#new2").popover({
                    content:"两次输入密码不一致",
                });
                $("#new2").popover('show');
            }
        });

    });