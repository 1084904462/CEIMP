$(function () {
    $(".navbar-text").hover(function () {
            $(".dropdown").css({"border-bottom": " 3px solid #5FB878"});
            $(".dropdown-menu1").fadeIn("fast");
        }
        , function () {
            $(".dropdown").css({"border-bottom": " 3px solid white"});
            $(".dropdown-menu1").fadeOut("fast");
        })
});