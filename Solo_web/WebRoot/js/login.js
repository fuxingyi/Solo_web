$(function(){
	/*登录注册切换*/
	var i=function(){
		var e=$("#login");
		this.tab=$(".form-title",e),
		this.con=this.tab.siblings(".form-content");
		var i=parseInt(this.con.width(),10)+2;
		this.sendGA=function(){
			var e=this.con.attr("data-flag"),
			i=this.tab.find(">.cur").attr("data-kind");
			if(0==e)switch(Number(i)){
			case 0:tlog=window.tlog||[],tlog.push("s:w_box_register_c_new");break;
			case 1:tlog=window.tlog||[],tlog.push("s:w_box_register_e_new");break;
			case 2:tlog=window.tlog||[],tlog.push("s:w_box_register_h_new")}else 
				switch(Number(i)){
				case 0:tlog=window.tlog||[],tlog.push("s:w_box_login_c_new");break;
				case 1:tlog=window.tlog||[],tlog.push("s:w_box_login_e_new");break;
				case 2:tlog=window.tlog||[],tlog.push("s:w_box_login_h_new")}
			},
		this.tabSwitch=function(e){
				var t=".register-box",r=-i,a=this.con.attr("data-flag");
				1==a?(t=".login-box",r=i):(t=".register-box",r=-i),
						this.tab.find("span").eq(e).addClass("cur").siblings().removeClass("cur"),
						this.con.children("div").eq(e).children(t).css("left","0").siblings().css("left",r+"px"),
						this.con.children("div").eq(e).css("left","0").siblings().css("left","-584px"),
						this.sendGA()
			},
		this.showWhich=function(){
				var e,i,t=LT.Cookie.get("user_kind")||0;
				this.con.attr("data-flag",LT.User.user_login?1:0),
				this.tab.find('[data-kind="'+t+'"]').trigger("click"),
				e=LT.String.getQuery("sr_id"),i=LT.String.getQuery("sr_email"),
				!t&&!LT.User.user_login&&e&&i&&$(".candidate .register-box").attr("sr_id",e).find('[data-selector="checkEmail"]').val(i)
			},
		this.lrswitch=function(e){
				var t=0,r=0;1==$(e).hasClass("login-box")?(r=0,t=-i):(r=1,t=i),$(e).animate({left:t},200).siblings("form").animate({left:0},200),$(e).closest(".form-content").attr("data-flag",r),
				this.sendGA()
			},
		this.init=function(){
				var e=this;e.tab.find("span").bind("click",function(){e.tabSwitch($(this).index())}),$('[data-selector="switchRegister"],[data-selector="switchLogin"]').bind("click",function(){e.lrswitch($(this).closest("form"))}),e.showWhich()
			}
		};
(new i).init();

function changeCheckBox(){
	$('div .clearfix').each(function(){
		var inputCheckbox = $(this).find('input[type="checkbox"]');
		$(this).find('i').click(function(){
			if(inputCheckbox!=null){
				var value = inputCheckbox.val();
				if(value.trim()=='on'){
					inputCheckbox.val('off');
					$(this).removeClass();
					$(this).addClass('checkboxui checkboxui-disabled');
				}else{
					inputCheckbox.val('on');
					$(this).removeClass();
					$(this).addClass('checkboxui checkboxui-checked');
				}
			}
		
		});
	});
}
changeCheckBox();

});
