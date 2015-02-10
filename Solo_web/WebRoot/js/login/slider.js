$(function(){
	var e=$("#content");
	!function(){
		var i,t,r,a,s,n=
		e.find(".slider"),
		o=n.find(".slider-list"),
		l=n.find(".dot-list"),
		c=o.find("a"),
		d=0,
		u=!0,
		g=null,
		h=10,
		f=o.children("div").length;
		
		for(c.bind("click",function(){
			var e=$(this).closest("div").index()+1;
			tlog=window.tlog||[],tlog.push("c:w_index_adframe_"+e)}),
			o.find("div:first").show().siblings().hide(),
			i=function(e,i){u&&(u=!1,l.find("a").eq(e).addClass("active").siblings().removeClass("active"),o.find("div").eq(e).siblings().fadeOut(600).end().fadeIn(1200,function(){u=!0,i&&i.call(this)}))},
			t=function(){u&&(d++,d>=f&&(d=0),i(d),clearTimeout(g),g=setTimeout(t,1e3*h))},
			r=function(){g=setTimeout(t,1e3*h)},
			a="",
			s=0;
			f>s;s++)
		a+='<a href="javascript:;"',
		0==s&&(a+=' class="active"'),
		a+="></a>";
		l.html(a).find("a").click(function(){
			var e=$(this).index();d=e,clearTimeout(g),i(e,function(){r()})}),r()}()
});
