/**
 * Created by asus on 2017/10/15.
 */
layui.use(['element', 'table', 'form', 'layer'], function()
{
    var element = layui.element;
    var table = layui.table;
    var form = layui.form;
    var layer = layui.layer;

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
                action: "/m/admin/"
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
    
    function download(obj)
    {
        var data = obj.data;
        var event = obj.event;

        if(event == 'download')
        {
            layer.open({
                title: '下载',
                content: '[' + JSON.stringify(data) + ']',
            })
        }
        else if(event == "del")
        {
            layer.open({
                title: '删除',
                content: "userId=" + data.userId + "&award=" + data.award,
            })
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
