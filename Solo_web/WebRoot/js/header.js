!function(e){
	var n=function(){
		return this.option={showMessagePops:!0},
		this.quickMenu=e("header .quick-menu"),
		this.config=window.HeaderHelperConfig||{},
		this.init(),this
	};
	n.prototype.init=function(){
		var e=this;
		return LT.Event.queue("login",
				function(){e.refresh()}),
				this.refresh(),this
	},
	n.prototype.options=function(){
		var e=this;return 1===arguments.length?e.option[arguments[0]]:(2===arguments.length&&(e.option[arguments[0]]=arguments[1]),this)
	},
	n.prototype.refresh=function(){
		var e=location.hostname.split(".").slice(0,1)[0];switch(e){case"clt":case"ltcom":LT.Cookie.get("hcomp_id")?this.setLoginedMenuCLT():this.setUnloginMenuCLT();break;default:LT.User.isLogin?this.setLoginedMenu():this.setUnloginMenu()}return this
	},
	n.prototype.setUnloginMenu=function(){
		var n=this,t=e("<div />").addClass("quick-menu-unlogined").appendTo(n.quickMenu.empty());return NodeTpl.get("/r/194183/tpls/www/beta2/header/quick_menu.js",{pageType:n.config.pageType},function(e){t.append(e)}),n
	},
	n.prototype.setLoginedMenu=function(){
		switch(LT.User.user_kind){case"0":this.setLoginedMenuC();break;case"2":this.setLoginedMenuH();break;default:this.setLoginedMenuP()}return this},n.prototype.setLoginedMenuC=function(){var n=this,t=e("<div />").addClass("quick-menu-logined-c").appendTo(n.quickMenu.empty());return NodeTpl.get("/r/185504/tpls/c/beta2/header/quick_menu.js",function(e){t.append(e)}),n},n.prototype.setLoginedMenuH=function(){var n=this,t=e("<div />").addClass("quick-menu-logined-h").appendTo(n.quickMenu.empty());return NodeTpl.get("/r/180036/tpls/h/beta2/header/quick_menu.js",function(e){t.append(e)}),n},n.prototype.setUnloginMenuCLT=function(){var n=this,t=e("<div />").addClass("quick-menu-unlogined").appendTo(n.quickMenu.empty());return NodeTpl.get("/r/175187/tpls/clt/beta2/header/quick_menu_unlogined.js",function(e){t.append(e)}),e("header .notebook").remove(),n},n.prototype.setLoginedMenuCLT=function(){var n=this,t=e("<div />").addClass("quick-menu-logined-clt").appendTo(n.quickMenu.empty()),i=1==LT.Cookie.get("is_root_hcomp"),o=LT.Cookie.get("hcomp_name");return NodeTpl.get("/r/175187/tpls/clt/beta2/header/quick_menu.js",{isroot:i},function(e){t.append(e)}),o?(e("header nav").show(),e("header .title").hide()):(e("header nav").hide(),e("header .title").show()),n},n.prototype.setLoginedMenuP=function(){var n=this,t=e("<div />").addClass("quick-menu-logined-p").appendTo(n.quickMenu.empty());return NodeTpl.get("/r/170716/tpls/p/beta2/header/quick_menu.js",function(e){t.append(e)}),n},n.prototype.navbar=function(n){return e("header nav ul li").each(function(){e(this).attr("data-name")===n&&e(this).addClass("active")}),this},n.prototype.dynmode=function(){return LT.User.isLogin&&e("header nav").hide(),this},window.HeaderHelper=new n}(jQuery);