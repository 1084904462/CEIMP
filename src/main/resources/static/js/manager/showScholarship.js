


$(document).ready(function() {
    var oTable=$('#dataTables-example').DataTable({
        responsive: true,
        "order": [[ 1, "desc" ]],
        "columnDefs": [{ "targets": [0, 6], "orderable": false }]

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






    $("#checkAll2").click(function() {
        if ($(this).hasClass('checked')) {
            $('input[name="subBox"]').prop("checked",false);
            $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);}
        else {
            $('input[name="subBox"]').prop("checked",true);
            $("#checkedNumber15").text( $(allPages).find('input[name="subBox"]:checked').length);}
        $(this).toggleClass('checked');
    });
    var $subBox = $(allPages).find('input[name="subBox"]');
    $subBox.click(function(){
        /!*  $("#checkAll2").prop("checked",$subBox.length == $("input[name='subBox']:checked").length ? true : false);*!/
        $("#checkedNumber15").text($(allPages).find('input[name="subBox"]:checked').length);

    });
});

/*$(document).ready(function() {
    var oTable=$('#dataTables-example').DataTable({
        responsive: true,
        "order": [[ 1, "desc" ]],
        "columnDefs": [{ "targets": [0, 6], "orderable": false }]
    });
    console.log("1");











    function changeCheckedNumber(grade)
    {
        $("#checkedNumber" + grade).text($("input[name='subBox']:checked").length);
    }

    table.on('checkbox(table15)', function(obj){
        changeCheckedNumber(15);
    });

    table.on('checkbox(table16)', function(obj){
        changeCheckedNumber(16);
    });*/

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
     });





});*/


    /* $('#dataTables-example').dataTable( {

     "columnDefs": [ {
     "targets": [ 0, 2 ],
     "orderable": false
     } ]
     } );
     console.log("2");*/
    /*  $('.btn-danger2').click(function(){
     $(this).css('background-color', 'red', function(){
     $(this).css('background-color', '#f750a3');
     });
     });     */
    /*$(function() {

     $("#checkAll").click(function() {
     $('input[name="subBox"]').prop("checked",this.checked);
     $("#checkedNumber15").text($("input[name='subBox']:checked").length);
     });
     var $subBox = $("input[name='subBox']");
     $subBox.click(function(){
     $("#checkAll").prop("checked",$subBox.length == $("input[name='subBox']:checked").length ? true : false);
     $("#checkedNumber15").text($("input[name='subBox']:checked").length);

     });



     $('#txtTitle').keyup(function() {
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
     });


     });*/






/*
    function changeCheckedNumber(grade)
    {
        $("#checkedNumber" + grade).text($("input[name='subBox']:checked").length);
    }

table.on('checkbox(table15)', function(obj){
    changeCheckedNumber(15);
});

table.on('checkbox(table16)', function(obj){
    changeCheckedNumber(16);
});*/







/*function deleteScholarship()
{

    $.ajax({
        url: "/manager/scholarship/delete/{subName}",
        type: "post",
        data: "account=" + data.account ,
        success: function(data)
        {
            if(data == 1)
            {
                alert("删除成功");
                obj.del();
            }
            else
            {
                alert("删除失败");
            }
        },
        error: function(data)
        {
            alert("发生错误，删除失败");
        }
    });
}*/
/*$(document).ready(function () {

    $("#deleteScholarshipButton").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});*/

