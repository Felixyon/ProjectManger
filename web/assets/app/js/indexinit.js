var Indexinit = function() {

    var smalluserinfoonload = function() {

            var smalluserinfo=JSON.parse(localStorage.getItem("userinfo"));
            var nickname=localStorage.getItem("nickname");
            $("#_usernickname1").text(nickname);
            $("#_usernickname2").text(nickname);
            $("#_usernickname3").text(nickname);
            $("#_useremail1").text(smalluserinfo.studentid+"@whu.edu.cn");
            var myDate = new Date().toDateString();
            $("#_logintime").text(myDate);




    };

    return {
        //== Init demos
        init: function() {
            smalluserinfoonload();
        }
    };
}();

jQuery(document).ready(function() {
    Indexinit.init();
});