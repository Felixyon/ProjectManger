//== Class definition

var MemberMange = function () {

    //== Private functions
    var demos = function () {

        function formatRepo(repo) {
            if (repo.loading) return repo.text;
            var markup = "<div class='select2-result-repository clearfix'>" +
                "<div class='select2-result-repository__meta'>" +
                "<div class='select2-result-repository__title'>" + repo.full_name + "</div>";
            if (repo.description) {
                markup += "<div class='select2-result-repository__description'>" + repo.description + "</div>";
            }
            markup += "<div class='select2-result-repository__statistics'>" +
                "<div class='select2-result-repository__forks'><i class='fa fa-flash'></i> " + repo.forks_count + " Forks</div>" +
                "<div class='select2-result-repository__stargazers'><i class='fa fa-star'></i> " + repo.stargazers_count + " Stars</div>" +
                "<div class='select2-result-repository__watchers'><i class='fa fa-eye'></i> " + repo.watchers_count + " Watchers</div>" +
                "</div>" +
                "</div></div>";
            return markup;
        }

        function formatRepoSelection(repo) {
            return repo.full_name || repo.text;
        }
        // minimum setup
        var mystudentid = JSON.parse(localStorage.getItem("userinfo")).studentid;

        $.getJSON('user/getmyleaderprojects?mystudentid=' + mystudentid, function (result) {
            console.log(result);
            var selectuplist = "";
            var selectdownlist = "";
            for (var m = 0; m < result.length; m++) {
                var oneselect = "<option id='upproject" + result[m].projectid + "'>" + result[m].projectname + "</option>"
                var twoselect = "<option id='downproject" + result[m].projectid + "'>" + result[m].projectname + "</option>"
                selectuplist = selectuplist + oneselect;
                selectdownlist = selectdownlist + twoselect;
            }
            alert("已经获取到所有的项目数据");
            $("#projectlistarea1").append(selectuplist);
            $("#projectlistarea2").append(selectdownlist);

            $("#projectlistarea1").select2({
                templateResult: formatRepo, // omitted for brevity, see the source of this page
                templateSelection: formatRepoSelection // omitted for brevity, see the source of this page
            });

        });
    };

    return {
        // public functions
        init: function() {
            demos();
        }
    };
}();

jQuery(document).ready(function() {
    MemberMange.init();
});