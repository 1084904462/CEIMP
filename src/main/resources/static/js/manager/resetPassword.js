$(document).ready(function() {
    var oTable=$('#dataTables-example').DataTable({
        responsive: true,
        "order": [[ 1, "desc" ]],
        "columnDefs": [{ "targets": [0, 4], "orderable": false }]

    });


});
