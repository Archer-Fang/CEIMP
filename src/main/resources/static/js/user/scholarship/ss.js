$(function () {
    var optionString = "";
    $.each( ["汉族","蒙古族","回族","藏族","维吾尔族","苗族","彝族","壮族","布依族","朝鲜族","满族","侗族","瑶族","白族","土家族",
        "哈尼族","哈萨克族","傣族","黎族","傈僳族","佤族","畲族","高山族","拉祜族","水族","东乡族","纳西族","景颇族","柯尔克孜族",
        "土族","达斡尔族","仫佬族","羌族","布朗族","撒拉族","毛南族","仡佬族","锡伯族","阿昌族","普米族","塔吉克族","怒族", "乌孜别克族",
        "俄罗斯族","鄂温克族","德昂族","保安族","裕固族","京族","塔塔尔族","独龙族","鄂伦春族","赫哲族","门巴族","珞巴族","基诺族"],function (index,value) {
        optionString +="<option value='"+value+"'>"+value+"</option>";
    });
    $("#nation").html(optionString);
    $("#nation" ).selectpicker('refresh');
    $(".navbar-text").hover(function(){
            $(".dropdown").css({"border-bottom":" 3px solid #5FB878"});
            $(".dropdown-menu1").fadeIn("fast");
        }
        ,function(){
            $(".dropdown").css({"border-bottom":" 3px solid white"});
            $(".dropdown-menu1").fadeOut("fast");
        })
    $("#text1").keyup(function(){
        var length = 200;
        var content_len = $("#text1").val().length;
        var in_len = length-content_len;
        var out_len=content_len-length;
        $("#message1").html('');
        $("#message2").html('');
        // 当用户输入的字数大于制定的数时，让提交按钮失效
        // 小于制定的字数，就可以提交
        if(content_len >200){
            $("#message2").html('您已超出'+out_len+'字');
            $("#message2").css({"color":"red"});
            // 可以继续执行其他操作
        }else{
            $("#message1").html('您还可以输入'+in_len+'字');
            $("#submit").attr("disabled",false);
            return false;
        }
    });
    $("#text1").blur(function(){
        var length = 200;
        var content_len = $("#text1").val().length;
        var in_len = length-content_len;
        var out_len=content_len-length;
        // 当用户输入的字数大于制定的数时，让提交按钮失效
        // 小于制定的字数，就可以提交
        if(content_len >200){
            $("#message2").html('您已超出'+out_len+'字');
            $("#message2").css({"color":"red"});
            // 可以继续执行其他操作
        }else{
            $("#message2").html('');
            $("#message1").html('');
            $("#submit").attr("disabled",false);
            return false;
        }
    });




}); 