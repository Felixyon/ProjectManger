var ProjectApply = function() {

    var newprojectapplysubmit = function() {
        $("#projectapplysubmit").on('click',function () {
        var projectname=$("#projectname").val();
        var projecturi=$("#projectapplyuri").val();
        var projectdes=$("#projectdes").val();
        var smalluserinfo=JSON.parse(localStorage.getItem("userinfo"));
        var nickname=localStorage.getItem("nickname");
        var studentid=smalluserinfo.studentid;

        $.ajax({
            url:"project/applynewproject?projectname="+projectname+"&projectdes="+projectdes+"&applicationrui="+projecturi+"&studentid="+studentid,
            success:function(result){
                console.log(result);
                $("#projectname").val("");
                $("#projectapplyuri").val("");
                $("#projectdes").val("");
            }});

        });


    };

    return {
        //== Init demos
        init: function() {
            newprojectapplysubmit();
        }
    };
}();

jQuery(document).ready(function() {
    ProjectApply.init();
});