$(document).ready(function() {
    var oTable=$('#dataTables-example').DataTable({
        responsive: true,
        "order": [[ 1, "desc" ]],
        "columnDefs": [{ "targets": [0,5, 6], "orderable": false }]

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
