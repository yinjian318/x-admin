$(function(){
    var page = $("#page").val();var totlepage = $("#totlepage").val();
    var url = $("form").attr("action");var parame = "&" + $("form").serialize();
    localStorage.setItem("tolpage",totlepage)
    localStorage.setItem("pag",page)
    localStorage.setItem("parames",parame)
    if(url){

        if(url.indexOf("?") > 0){
            url = url + "&";
        }else{
            url = url + "?";
        }
        localStorage.setItem("urls",url)
        setTimeout(function(){
            paging(page,totlepage, url, parame);
        },1)
        $ ('body').delegate('#page_input','keypress',function (){
            return (/[\d]/.test(String.fromCharCode(event.keyCode)))
        });
    }
});
//跳转到指定页数
function gotoPage(){
    var flag = true;
    totlepage = localStorage.getItem("tolpage")
    url = localStorage.getItem("urls")
    parame = localStorage.getItem("parames")
    var forPageNum = parseInt($("#page_input").val())
    if(1 > forPageNum){
        forPageNum = 1;
        $("#page_input").val(forPageNum)
        flag = false;
    }
    if(totlepage < forPageNum){
        forPageNum = totlepage;
        $("#page_input").val(forPageNum)
    }
    if(forPageNum == "" || forPageNum == " " || isNaN(forPageNum)){
        forPageNum = 1;
        flag = false;
    }
    if(flag){
        if(totlepage){
            window.location.href = url + "pageNo=" + forPageNum + parame;
        }
    }
}

/**
 * Created by DC on 2016/9/5.
 */

function paging(page,totlepage,url,parame){
    var paging = {
        page : parseInt(page),
        totlepage : parseInt(totlepage),
        url : url,
        pNo :'pageNo=',
        parame : parame
    }
    if(paging.totlepage == null || paging.totlepage == 0 || paging.totlepage == "" || isNaN(paging.totlepage)){
        paging.totlepage = 1;
        paging.page = 1;
    }
    var prev = $("#prev").val();
    var next = $("#next").val();
    var totlepage = $("#totlepage").val();
    var html = "";
    if(paging.totlepage == 0 || paging.totlepage == null){
        html = '<a href="javascript:void(0)" class="mgr15" style="width:auto;">共<strong>0</strong>页</a>';
    }else{
        html = '<a href="javascript:void(0)" class="mgr15" style="width:auto;">共<strong>'+paging.totlepage+'</strong>页</a>';
    }
    if(paging.page<=1){
        html+='<a href="javascript:void(0)" class="no_up_btn"> 上一页</a>';
    }else{
        html+='<a href="'+paging.url+paging.pNo+prev+paging.parame+'"class="up_btn">上一页</a>'
    }
    if(paging.totlepage < 8){
        for(var i=1;i<paging.totlepage+1;i++){
            if(i == paging.page){
                html += '<span class="on"> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a></span>'
            }else{
                html += '<span> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a> </span>'
            }
        }
    }else{
        if(paging.totlepage <= paging.page+2){
            html += '<span><a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+1+paging.parame+'">1</a> </span><span><a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+2+paging.parame+'">2</a></span><span class="point"><a href="javascript:;">...</a></span>';
            for(var i=paging.totlepage-5;i<paging.totlepage+1;i++){
                if(i == paging.page){
                    html += '<span class="on"> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a></span>'
                }else{
                    html += '<span> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a> </span>'
                }
            }
        }else{
            if(paging.page-2 > 3){
                html += '<span><a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+1+paging.parame+'">1</a> </span><span><a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+2+paging.parame+'">2</a></span><span class="point"><a href="javascript:;">...</a></span>';
                for(var i=paging.page-2;i<paging.page+3;i++){
                    if(i == paging.page){
                        html += '<span class="on"> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a></span>'
                    }else{
                        html += '<span> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a> </span>'
                    }
                }
                html += '<span class="point"><a href="javascript:void(0)">...</a></span>';
            }else{
                for(var i=1;i<8;i++){
                    if(i == paging.page){
                        html += '<span class="on"> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a></span>'
                    }else{
                        html += '<span> <a style="display:inline-block;text-align:center;" href="'+paging.url+paging.pNo+i+paging.parame+'">'+i+'</a> </span>'
                    }
                }
                html += '<span class="point"><a href="javascript:void(0)">...</a></span>';
            }
        }
    }
    if(paging.page<paging.totlepage){
        html += '<a href="'+paging.url+paging.pNo+next+paging.parame+'" class="next_btn">下一页</a>';
    }else{
        html += '<a href="javascript:void(0)" class="no_next_btn">下一页</a>'
    }
    html += '<span style="margin-left: 5px;width:auto;border:none;background: #fff;">到第&nbsp;<input type="number" value="1" id="page_input" class="page_input">&nbsp;页 </span> <button class="confrim" style="margin-left:10px;" onclick="gotoPage()">确定</button>'

    document.getElementById("paging").innerHTML = html;
}