/**
 * Created by asus on 2017/10/15.
 */
layui.use(['element', 'table', 'form', 'layer'], function()
{
    var element = layui.element;
    var table = layui.table;
    var form = layui.form;
    var layer = layui.layer;

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
                    url: "",
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
