/**
 * Created by cuishaojie on 2016/11/14.
 */
(function($) {
    $.extend($.fn, {
        getval:function(Element){
            var type = Element.type;
            if(type=="span"){
                return $(Element).text();
            }else if(type=="checkbox"){
               var name = $(Element).prop('name');
               if($('[name='+name+']:checked').length>0){
                   return true;
               }else {
                   return "";
               }
            }else {
                return $(Element).val();
            }
        },
        showStyle:function(Element,formatCode){
            var title = $(Element).data('title');
            $(Element).data('title',title);
            var format = "";
            if(formatCode=="required"){
                format="不能为空";
            }else if(formatCode=="format"){
                format="格式不正确";
            }else if(formatCode=="number"){
                format="必须为正数";
            }
            $(Element).attr('data-original-title',title+format);
            $(Element).css({
                "border":"1px solid rgba(255, 0, 18, 0.28)",
            });
            $(Element).data('trigger','manual');
            $(Element).data('toggle','tooltip');
        },
        myVilidata:function(){
            var flag = true;
            if(flag){
                $(this).find('.required').each(function(){
                    var val = $.fn.getval(this);
                    if(val=="" || val==null){
                        $.fn.showStyle(this,"required");
                        $(this).tooltip('show');
                        flag= false;
                        return false;
                    }
                });
            }
            if(flag) {
                $(this).find('.requiredhide').each(function () {
                    if ($(this).parents().filter(':hidden').length <= 0) {
                        if($(this).is(":hidden")){
                           return;
                        }
                        var val = $.fn.getval(this);
                        if (val == "" || val == null) {
                            $.fn.showStyle(this, "required");
                            $(this).tooltip('show');
                            flag = false;
                            return false;
                        }
                    }
                });
            }
            if(flag) {
                $(this).find('.mobile').each(function () {
                    if($(this).is(":hidden")){
                        return;
                    }
                    var val = $.fn.getval(this);
                    if (val == "" || val == null || !validatePhone(val)) {
                        $.fn.showStyle(this, "format");
                        $(this).tooltip('show');
                        flag = false;
                        return false;
                    }
                });
            }
            if(flag) {
                $(this).find('.number').each(function () {
                    if($(this).is(":hidden")){
                        return;
                    }
                    var val = $.fn.getval(this);
                    if (val == "" || val == null || !checkNumber(val)) {
                        $.fn.showStyle(this, "number");
                        $(this).tooltip('show');
                        flag = false;
                        return false;
                    }
                });
            }
            if(flag) {
                $(this).find('.tickNumber').each(function () {
                    if($(this).is(":hidden")){
                        return;
                    }
                    var val = $.fn.getval(this);
                    if (val == "" || val == null || !checktickNumber(val)) {
                        $.fn.showStyle(this, "format");
                        $(this).tooltip('show');
                        flag = false;
                        return false;
                    }
                });
            }
            if(flag) {
                $(this).find('.trainNumber').each(function () {
                    if($(this).is(":hidden")){
                        return;
                    }
                    var val = $.fn.getval(this);
                    if (val == "" || val == null || !checktrainNumber(val)) {
                        $.fn.showStyle(this, "format");
                        $(this).tooltip('show');
                        flag = false;
                        return false;
                    }
                });
            }
            return flag;
        }

    });
}(jQuery));

$(function(){
    $(".vilidata").each(function(){
        $(this).click(function(){
            $(".vilidata").css({
                "border":"",
            });
            $('.vilidata').tooltip('destroy')
        });
    });
});





