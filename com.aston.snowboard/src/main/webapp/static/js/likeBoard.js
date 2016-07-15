$(function(){
    $(".like").click(function(){
        var elementClicked = $(this);
        var parentElement = elementClicked.parent();
        var spanWithData = parentElement.children(".likeCount");
        $.ajax({
            type: "post",
            url: "/snowboard/like/" +  spanWithData.attr("data-id"),
            async: true,
            dataType: "json",
            success: function(data){
                spanWithData.html(data);
                console.log(data);
            }
        });
    });
});
$(function(){
    $(".dislike").click(function(){
        var elementClicked = $(this);
        var parentElement = elementClicked.parent();
        var spanWithData = parentElement.children(".dislikeCount");
        $.ajax({
            type: "post",
            url: "/snowboard/dislike/" +  spanWithData.attr("data-id"),
            async: true,
            dataType: "json",
            success: function(data){
                spanWithData.html(data);
                console.log(data);
            }
        });
    });
});