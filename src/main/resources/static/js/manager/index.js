$(document).ready(function() {
    var oTable=$('#dataTables-example').DataTable({
        /*  responsive: true*/
        "columnDefs": [{ "targets": [0, 7], "orderable": false }]
    });


    var allPages = oTable.cells( ).nodes( );

    $('#checkAll').click(function () {
        if ($(this).hasClass('allChecked')) {
            $(allPages).find('input[name="subBox"]').prop('checked', false);
            $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);
        } else {
            $(allPages).find('input[name="subBox"]').prop('checked', true);
            $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);
        }
        $(this).toggleClass('allChecked');
    });




    /*  $("#checkAll2").click(function() {
     if ($(this).hasClass('checked')) {
     $('input[name="subBox"]').prop("checked",false);
     $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);}
     else {
     $('input[name="subBox"]').prop("checked",true);
     $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);}
     $(this).toggleClass('checked');
     });*/
    var $subBox = $(allPages).find('input[name="subBox"]');
    $subBox.click(function(){
        /*  $("#checkAll2").prop("checked",$subBox.length == $("input[name='subBox']:checked").length ? true : false);*/
        $("#checkedNumber15").text($(allPages).find('input[name="subBox"]:checked').length);

    });








    function changeCheckedNumber(grade)
    {
        $("#checkedNumber" + grade).text($("input[name='subBox']:checked").length);
    }

    table.on('checkbox(table15)', function(obj){
        changeCheckedNumber(15);
    });

    table.on('checkbox(table16)', function(obj){
        changeCheckedNumber(16);
    });

    /* $('#txtTitle').keyup(function() {
     var txttile = $('#txtTitle').val();
     document.getElementById("txtContent").innerHTML="1";

     if (txttile == "") {
     document.getElementById("txtContent").innerHTML="1";
     return false;
     }
     else if (txttile.length > 3) {
     document.getElementById("txtContent").innerHTML="2";
     return false;

     }
     });*/





});

<!-- /#wrapper -->
function loadPage(url) {
    if (!url.match("/add")) {
        //消除连续两次模态框显示导致的17px叠加偏移
        $('.main-body').css('padding-right', '0');
        $('#circleModal').modal('show');
    }
    $('html,body').animate({scrollTop: 0}, 1);
    //加时间戳，兼容ie9
    var ts = "?ts=" + new Date().getTime();
    if (url.indexOf("?") != -1) {
        url = url.replace('?', ts + "&");
    }
    else {
        url = url + ts;
    }
    window.location.href=url;
}


/*$('#test').click( function() {*/

/*window.location.href="url";*/
/*});*/

