<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common.css"> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/public.css"> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>

</head>

<script type="text/javascript">

$(function(){
	$(".menu").click(function(){
		var $div=$(this).next("div");
		$(".menu-item").find(".submenu-box").slideUp(); 
		if($div.is(":visible")){
			$(this).next(".submenu-box").slideUp();
			$(this).parent().removeClass("open");
		}else{
			$(this).next(".submenu-box").slideDown();
			$(this).parent().addClass("open");
		}	
	})
	
	$(".submenu").click(function(){
		$("a.curr").removeClass("curr");
		 $(this).addClass("curr");
	})
})

 /*   $(".menuson .header").click(function(){
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
	  }); */
	  
</script>

<style>
.submenu-box{display:none;}  
</style>

<body>
<div id="main-frame">
	<div id="frame-top">
		<div class="top-logo">
			<div class="logo fl"><img src="images/logo.png"></div>
			<div class="title fl">会议签到系统</div>	
		</div>
		<div class="actionbar">
		
			<div class="personnel fl">
				<img src="images/head_portrait.png">
				<span class="name">超级管理员</span>
		    </div>
		    
			<div class="tid act-list curr fl">
				<a href="javascript:;">
					<div class="new">
						<img src="images/icons/news.png">消息
						<span class="tips">99</span>
					</div>
				</a>
			</div>
			
			<div class="set-up act-list fl">
				<a href="javascript:;">
					<img src="images/icons/set_up.png">设置
				</a>
			</div>
			
			<div class="sign-out act-list fl">
				<a href="javascript:;">
					<img src="images/icons/login_out.png">退出
				</a>
			</div>
		</div>
    </div>
			
	<div id="frame-left">
	
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_home.png">
				<span>首页</span>	
				<i></i>
			</a>
			 <div class="submenu-box">
				<a href="javascript:;" class="submenu">
					消息通知
				</a>
				<a href="javascript:;" class="submenu">
					个人信息
				</a>
			</div> 
	    </div>
	    
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_admin.png">
				<span>权限设置</span>	
				<i></i>
			</a>
			<div class="submenu-box">
				<a href="javascript:;" class="submenu ">
					人员管理
				</a>
				<a href="javascript:;" class="submenu">
					个人权限
				</a>
			</div>
		</div>
				
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_admin.png">
				<span>会议室管理</span>	
				<i></i>
			</a>
			<div class="submenu-box">
				<a href="javascript:;" class="submenu ">
					会议室预约
				</a>
				<a href="javascript:;" class="submenu">
					会议室统计查询
				</a>
			</div>
		</div>
				
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_admin.png">
				<span>会议管理</span>	
				<i></i>
			</a>
			<div class="submenu-box">
				<a href="javascript:;" class="submenu ">
					会议添加
				</a>
				<a href="javascript:;" class="submenu">
					会议发布
				</a>
				<a href="javascript:;" class="submenu ">
					会议报名
				</a>
				<a href="javascript:;" class="submenu">
					会议签到
				</a>
			</div>
		</div>
				
				
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_admin.png">
				<span>文件管理</span>	
				<i></i>
			</a>
			<div class="submenu-box">
				<a href="javascript:;" class="submenu ">
					上传下载
				</a>
				<a href="javascript:;" class="submenu ">
					统计分析
				</a>
						 
			</div>
		</div>
				
				
		<div class="menu-item">
			<a href="javascript:;" class="menu">
				<img src="images/icons/menu_admin.png">
				<span>签名墙</span>	
				<i></i>
			</a>
			<div class="submenu-box">
				<a href="javascript:;" class="submenu ">
					电子签名
				</a>
				<a href="javascript:;" class="submenu">
					手工签名
				</a>
			</div>
		</div>
	</div>
						
		<div id="frame-container"></div>
</div>

</body>
</html>