




/*$(function(){
	   $(".menuson .header").click(function(){
		   var $parent=$(this).parent();
		$(".menuson li.active").not($parent).removeClass("active open").find('.sub-menus').hide();
		$parent.addClass("active");
		if(!!$(this).next('.sub-menus').size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find('.sub-menus').hide();
			}else{
				$parent.addClass("open").find('.sub-menus').show();
			}
		}
	  }); 
	   
	    //三级菜单
	    $('.sub-menus li').click(function(e){
		   $(".sub-menus li.active").removeClass("active");
		   $(this).addClass("active");
	   });
 */


$(function(){
	$(".submenu-box .header").click(function(){
		var $parent=$(this).parent();
		$(".submenu-box a.active").not($parent).removeClass("active open").find(".sub-menus").hide();
		$parent.addClass("active");
		if(!!$(this).next(".sub-menus").size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find(".sub-menus").show();
			}else{
				$parent.addClass("open").find(".sub-menus").show();
			}
		}
	});
	
	 $(".menu").click(function(){
		 var $div=$(this).next("div");
		 $(".menu-item").find(".submenu-box").slideUp();
		 if($div.is(":visible")){
			 $(this).next(".submenu-box").slideUp();
		 }else{
			 $(this).next(".submenu-box").slideDown();
		 }
	 })
})







































