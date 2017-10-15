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
            // layer.open({
            //     title: '在线调试',
            //     content: JSON.stringify(data),
            // });

            $.ajax({
                url: '/m/admin/zip',
                type: 'get',
                data: "zipBean=" + JSON.stringify(data),
                success: function(data)
                {
                    console.log(data);
                },
                error: function(data)
                {
                    alert("失败");
                }
            })
        }

        console.log(checkStatus.data);//获取选中行的数据
        console.log(checkStatus.data.length); //获取选中行数量，可作为是否有选中行的条件
    }

    var batchDownload15 = $("#batchDownload15");
    batchDownload15.click(batchDownload);
    var batchDownload16 = $("#batchDownload16");
    batchDownload16.click(batchDownload);

    table.on
});
