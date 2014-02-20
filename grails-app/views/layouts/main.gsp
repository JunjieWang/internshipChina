<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">-->
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'index.css')}" type="text/css">
                <style>
                    @font-face {
                    font-family: 'Glyphicons Halflings';
                    src: url('${resource(dir: 'fonts', file: 'glyphicons-halflings-regular.eot')}');
                    src: url('${resource(dir: 'fonts', file: 'glyphicons-halflings-regular.eot?#iefix')}') format('embedded-opentype'), url('${resource(dir: 'fonts', file: 'glyphicons-halflings-regular.woff')}') format('woff'), url('${resource(dir: 'fonts', file: 'glyphicons-halflings-regular.ttf')}') format('truetype'), url('${resource(dir: 'fonts', file: 'glyphicons-halflings-regular.svg#glyphicons-halflingsregular')}') format('svg');
                  }
                </style>
		<g:layoutHead/>
		<g:javascript library="application"/>		
		<r:layoutResources />
	</head>
	<body>
                <div class="navbar navbar-default navbar-fixed-top" role="navigation">
                  <div class="container">
                    <div class="navbar-header">
                      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
                      <a class="navbar-brand title-tdrd" href="index">找实习 - Intern China</a>
                    </div>
                    <div class="navbar-collapse collapse">

                      <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="">实习信息</a></li>
                        <li><a href="">发布工作</a></li>
                        <li><a href="">简历模板</a></li>
                        <li><a href="">经验分享</a></li>

                        <li class="dropdown">
                          <a href="#" class="dropdown-toggle navbar-right-tdrd" data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i> Username <b class="caret"></b>
                          </a>
                          <ul class="dropdown-menu">
                            <li><a href="#">收藏夹</a></li>
                            <li><a href="#">管理简历</a></li>
                            <li class="divider"></li>
                            <li class="dropdown-header">账号操作</li>
                            <li><a href="#">修改资料</a></li>
                            <li><a href="#">登出</a></li>
                          </ul>
                        </li>
                      </ul>
                    </div><!--/.nav-collapse -->
                  </div>
                </div>
            
		<g:layoutBody/>
		
		<r:layoutResources />
                <div class="container" style="border-top: 1px solid #DFDFDF; margin-top: 40px;">
                        <div class="footer" style="text-align: center; margin-top: 15px;">
                                <p> 
                                        <a href="/aboutus">招纳贤士</a> 
                                        | <g:link controller="aboutUs" action="index">About Us</g:link>
                                        | <a href="/aboutus">项目介绍</a>
                                        | <a href="/aboutus">免责声明</a>
                                </p>
                                <p>&copy; Powered by <a href="#">Team 528</a>. All Rights Reserved</p>
                        </div>
                </div>
                <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
                <script src="js/bootstrap.min.js"></script>
                <script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
	</body>
</html>
