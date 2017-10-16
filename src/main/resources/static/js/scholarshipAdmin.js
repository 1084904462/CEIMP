/**
 * Created by asus on 2017/10/15.
 */
layui.use(['element', 'table', 'form', 'layer'], function()
{
    var element = layui.element;
    var table = layui.table;
    var form = layui.form;
    var layer = layui.layer;

    form.verify({
        newPassword: function(value, item)
        {
            if(!((value.length >= 6) && (value.length <= 16)))
            {
                return "新密码要求6-16位";
            }
        }
    });

    element.on('nav(user)', function(elem)
        {
            $(this).removeClass('layui-this');

            if($(this).text().indexOf('修改密码') != -1)
            {
                layer.open(
                    {
                        title: "修改密码",
                        content: `
                        <form class="layui-form" action="" id="changePasswordForm" lay-filter="changePasswordForm">
                            <div class="layui-form-item">
                                <label class="layui-form-label">原密码:</label>
                                <div class="layui-input-block">
                                    <input type="password" name="oldPassword" required="required"  lay-verify="required" placeholder="请输入原密码" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">新密码:</label>
                                <div class="layui-input-block">
                                    <input type="password" name="newPassword" required="required"  lay-verify="required|newPassword" placeholder="请输入新密码" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">重复新密码:</label>
                                <div class="layui-input-block">
                                    <input type="password" name="confirmPassword" require="required"  lay-verify="required|newPassword" placeholder="请重复新密码" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block" id="msg" style="color: #FF0000"></div>
                            </div>
                        </form>`,
                        area: '400px',
                        tipsMore: true,
                        yes: function(index, layero)
                        {
                            var changePasswordForm = $("#changePasswordForm").get(0);

                            var oldPasswordInput = changePasswordForm.oldPassword;
                            var newPasswordInput = changePasswordForm.newPassword;
                            var confirmPasswordInput = changePasswordForm.confirmPassword;

                            var $msg = $("#msg");

                            if(oldPasswordInput.value == "")
                            {
                                $(oldPasswordInput).addClass("layui-form-danger").focus();
                                // layer.msg("必填项不能为空", {icon: 2, anim: 6, tipsMore: true});
                                $msg.text("必填项不能为空");
                            }
                            else if(newPasswordInput.value == "" || (newPasswordInput.value < 6 || newPasswordInput.value > 16))
                            {
                                $(newPasswordInput).addClass("layui-form-danger").focus();

                                var msg;
                                if(newPasswordInput.value == "")
                                {
                                    msg = "必填项不能为空";
                                }
                                else
                                {
                                    msg = "新密码要求6-16位";
                                }
                                // layer.msg(msg, {icon: 2, anim: 6});
                                $msg.text(msg);
                            }
                            else if(confirmPasswordInput.value == "" || (confirmPasswordInput.value < 6 || confirmPasswordInput.value > 16))
                            {
                                $(confirmPasswordInput).addClass("layui-form-danger").focus();

                                var msg;
                                if(confirmPasswordInput.value == "")
                                {
                                    msg = "必填项不能为空";
                                }
                                else
                                {
                                    msg = "新密码要求6-16位";
                                }
                                // layer.msg(msg, {icon: 2, anim: 6});
                                $msg.text(msg);
                            }
                            else
                            {
                                $.ajax({
                                    url: "",
                                    type: "post",
                                    data: "oldPassword=" + oldPasswordInput.value + "newPassword=" +
                                        newPasswordInput.value + "confirmPassword=" + confirmPasswordInput.value,
                                    success:function(data)
                                    {
                                        var changePasswordBean = data.changePasswordBean;

                                        if(changePasswordBean.status == "修改成功")
                                        {
                                            layer.msg("修改成功", {icon: 1});
                                        }
                                        else
                                        {
                                            $("#msg").val(changePasswordBean.status);
                                        }
                                    }
                                })
                            }
                        }
                    }
                )
            }
            else
            {
                layer.msg('退出');
            }
        }
    );

    // 批量下载
    function batchDownload()
    {
        var checkStatus = table.checkStatus('table' + $(this).attr("id").slice(-2));

        var data = checkStatus.data;

        if(data.length == 0)
        {
            layer.msg("请先勾选所要下载的行", {icon: 2, anim: 6});
            return ;
        }
        else
        {
            var $form = $("<form>").attr({
                style: "display:none",
                method: "get",
                action: "/m/admin/zip"
            });
            $('body').append($form);

            var $input = $("<input>").attr({
                type: "hidden",
                name: "zipBean",
                value: JSON.stringify(data),
            });
            $form.append($input);

            $form.submit().remove();
        }

        console.log(checkStatus.data);//获取选中行的数据
        console.log(checkStatus.data.length); //获取选中行数量，可作为是否有选中行的条件
    }

    var batchDownload15 = $("#batchDownload15");
    batchDownload15.click(batchDownload);
    var batchDownload16 = $("#batchDownload16");
    batchDownload16.click(batchDownload);


    // 单个下载
    function download(obj)
    {
        var data = obj.data;
        var event = obj.event;

        if(event == 'download')
        {
            var $form = $("<form>").attr({
                style: "display:none",
                method: "get",
                action: "/m/admin/zip"
            });
            $('body').append($form);

            var $input = $("<input>").attr({
                type: "hidden",
                name: "zipBean",
                value: "[" + JSON.stringify(data) + "]",
            });
            $form.append($input);

            $form.submit().remove();
        }
        else if(event == "del")
        {
            layer.confirm("确认删除？", function(index)
            {
                $.ajax({
                    url: "/m/admin/delete",
                    type: "get",
                    data: "userId=" + data.userId + "&username=" + data.username + "&award=" + data.award,
                    success: function(data)
                    {
                        if(data == 1)
                        {
                            layer.msg("删除成功", {icon: 1});
                            obj.del();
                        }
                        else
                        {
                            layer.msg("删除失败", {icon: 2});
                        }
                    },
                    error: function(data)
                    {
                        layer.msg("发生错误，删除失败", {icon: 2});
                    }
                });

                layer.close(index);
            });
        }
    }

    table.on('tool(table15)', function(obj)
    {
        download(obj);
    });

    table.on('tool(table16)', function(obj)
    {
        download(obj);
    })
});
