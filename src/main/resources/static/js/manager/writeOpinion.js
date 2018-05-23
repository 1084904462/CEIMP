


function loadPage(url) {


    if (!url.match("/add")) {
        //消除连续两次模态框显示导致的17px叠加偏移
        $('.main-body').css('padding-right', '0');
        $('#circleModal').modal('show');
    }
    $('html,body').animate({scrollTop: 0}, 1);

    window.location.href=url;
}





/*$('#test').click( function() {*/

/*window.location.href="url";*/
/*});*/
