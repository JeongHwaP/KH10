$(function(){
    $(".page").hide();
    $(".page").first().show();

    var step = 100 / $(".page").length;
    var percent = step;
    $(".progressbar > .inner").css("width", percent+"%");

    $(".btn-next").click(function(){
        var target = $(this).parents(".page").next();

        //모든 페이지 숨기고 target만 표시
        $(".page").hide();
        target.show();

        //% 증가
        percent += step;
        $(".progressbar > .inner").css("width", percent+"%");
    });
    $(".btn-prev").click(function(){
        var target = $(this).parents(".page").prev();
        $(".page").hide();
        target.show();

        //% 감소
        percent -= step;
        $(".progressbar > .inner").css("width", percent+"%");
    });
});