

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




function mouseOverShow() {
    $("#hidden").show();
}
function mouseOutHidden() {
    $("#hidden").hide();
}

