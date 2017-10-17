/**
 * Created by asus on 2017/10/14.
 */
layui.use(['form', 'element', 'laydate', 'table'], function()
{
    var element = layui.element;
    var form = layui.form;
    var laydate = layui.laydate;
    var table = layui.table;

    laydate.render({
        elem: '#birth',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    laydate.render({
        elem: '#entrance',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    laydate.render({
        elem: '#date1',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    laydate.render({
        elem: '#date2',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    laydate.render({
        elem: '#date3',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    laydate.render({
        elem: '#date4',
        type: 'month',
        btns: ['clear', 'confirm'],
        format: 'yyyy年MM月'
    });

    $(".add-line").click(function()
    {
        var $thisParent = $(this).parents(".layui-inline");
        console.log($thisParent.get(0));
        var $nextParent = $thisParent.next();
        console.log($nextParent.get(0));
        $nextParent.removeClass("layui-hide");
    });

    // var nationArray = ["", "汉族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","朝鲜族","满族","侗族","瑶族","白族","土家族",
    //     "哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族","景颇族","柯尔克孜族",
    //     "土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","塔吉克族","怒族", "乌孜别克族",
    //     "俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"];
    //
    // var $nationSelect = $("#nation");
    // for(let i = 0; i < nationArray.length; i++){
    //     $nationSelect.append(`<option value='${nationArray[i]}'>${nationArray[i]}</option>`);
    // }
    // form.render('select');

    form.verify({
        scholarshipName: function(value, item)
        {
            if(value.length > 34)
            {
                return "字数不能超过34字";
            }
        },
        scholarshipUnit: function(value, item)
        {
            if(value.length > 30)
            {
                return "字数不能超过30字";
            }
        },
        postcode: function(value, item)
        {
            if(!/^[0-9]{6}$/.test(value))
            {
                return "请输入正确的邮政编码";
            }
        },
        address: function(value, item)
        {
            if(value.length > 54)
            {
                return "字数不能超过54字";
            }
        },
        applyReason: function(value, item)
        {
            if(value.length > 200)
            {
                return "字数不能超过200字";
            }
        },
        recommendReason: function(value, item)
        {
            if(value.length > 100)
            {
                return "字数不能超过100字";
            }
        },
        opinion: function(value, item)
        {
            if(value.length > 100)
            {
                return "字数不能超过100字";
            }
        }
    })
})
