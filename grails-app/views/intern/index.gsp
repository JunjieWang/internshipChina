<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="main"/>
        <title>找实习 - 中国最可靠的实习信息发布网站</title>
    </head>
    <body> 
        <div class="container">
            <div class="container col-lg-10 col-lg-offset-1">
                <div class="row">
                    <div class="col-md-3 page-left">
                        <div class="filter">
                            <ul class="filter-group">
                                <li class="filter-title">时间</li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 一天内</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 一周内</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 一月内</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 更多...</label>
                                    </div>
                                </li>
                            </ul>

                            <ul class="filter-group">
                                <li class="filter-title">地点</li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 北京</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 上海</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 广州</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 其他</label>
                                    </div>
                                </li>
                            </ul>

                            <ul class="filter-group">
                                <li class="filter-title">性质</li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 全职</label>
                                    </div>
                                </li>
                                <li>
                                    <div class="checkbox">
                                        <label><input type="checkbox"> 兼职</label>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <div class="col-md-9 page-right">
                        <ul class="joblist">
                            <g:each status="i" in="${internlist}" var="intern">
                                <li class="joblist-line" id="${'showdetail'+i}">
                                    <div class="infoentry">
                                        <div class="top-line">
                                            <span class="entry-title">
                                                <a href="#">
                                                    ${intern.title}
                                                </a>
                                                <span class="pull-right title-fav">
                                                    <i class="glyphicon glyphicon-star-empty"></i>收藏
                                                </span>
                                            </span> 
                                        </div> 

                                        <div class="middle-line">
                                            <i class="glyphicon glyphicon-map-marker"></i> ${intern.location}   
                                            <i class="glyphicon glyphicon-time"></i> ${intern.date}  
                                            <i class="glyphicon glyphicon-globe"></i> ${intern.source}
                                        </div> 

                                        <div class="buttom-line">

                                            <a href="${'#showdetail'+i}" onclick="hide('${'detail'+i}','${'showdetail'+i}')">
                                                详细信息<b class="caret"></b>
                                            </a>

                                            <span class="pull-right">
                                                    <!-- JiaThis Button BEGIN -->
                                                <div class="jiathis_style"><span class="jiathis_txt">分享到：</span>
                                                    <a class="jiathis_button_weixin"></a>
                                                    <a class="jiathis_button_tsina"></a>
                                                    <a class="jiathis_button_renren"></a>
                                                    <a class="jiathis_button_linkedin"></a>
                                                </div>
                                                <!-- JiaThis Button END -->
                                            </span>
                                        </div>
                                    </div>
                                </li>
                                <div id="${'detail'+i}" class="detailinfo" style="display: none;">
                                    <!-- ${intern.description} -->
                                     <g:each status="j" in="${intern.desclines}" var="dl">
                                         ${dl} <br />
                                     </g:each>
                                </div>
                                <!-- <div style="height: 200px; margin-left: 5px; margin-right: 2px; border: 1px solid #dfdfdf; border-top: none; border-radius: 0 0px 5px 5px;
                                                        margin-bottom: 10px;">
                                                        内容
                                </div> -->
                            </g:each>
                        </ul>
                    </div>
                </div> <!-- end of .row -->
            </div>
        </div>
                <div>
                    ${orgin}
                </div>
    </body>
</html>
