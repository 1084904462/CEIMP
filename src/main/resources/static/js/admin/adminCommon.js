/**
 * Created by asus on 2017/8/21.
 */
layui.use(["element", "form"], function()
{
    var element = layui.element;

    //隐藏/显示侧边栏
    $('.admin-side-toggle').on('click', function() {
        var sideWidth = $('.layui-side').width();

        if(sideWidth === 200) {
            $('.layui-body').animate({
                left: '0'
            });
            $('.layui-footer').animate({
                left: '0'
            });
            $('.layui-side').animate({
                width: '0'
            });
        } else {
            $('.layui-body').animate({
                left: '200px'
            });
            $('.layui-footer').animate({
                left: '200px'
            });
            $('.layui-side').animate({
                width: '200px'
            });
        }
    });
});
