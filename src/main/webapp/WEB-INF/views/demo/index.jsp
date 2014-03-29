<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="zh">
    <meta charset="UTF-8">
    <!-- Le styles -->
    <link href="/_include/themes/bs2/css/bootstrap.css" rel="stylesheet">
    <link href="/_include/themes/bs2/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="/_include/themes/bs2/css/docs.css" rel="stylesheet">
    <link href="/_include/themes/bs2/js/google-code-prettify/prettify.css" rel="stylesheet">
    <title>Demo页面</title>
</head>
<body data-spy="scroll" data-target=".bs-docs-sidebar">
<!-- Navbar  ================================================== -->
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="brand" href="/">Site Name</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li  ><a href="/"><i class="icon-home "></i> 主页</a></li>
                    <li class="active" ><a href="start.jsp"><i class="icon-info-sign "></i> 概述</a></li>
                    <li  ><a href="guifan.jsp"><i class="icon-heart "></i> 规范</a></li>
                    <li class="dropdown  ">
                        <a data-toggle="dropdown" class="dropdown-toggle" role="button" id="drop2" href="#"><i class="icon-align-justify"></i> 扩展阅读<b class="caret"></b></a>
                        <ul aria-labelledby="drop2" role="menu" class="dropdown-menu">
                            <li role="presentation"><a href="codeguide.jsp" tabindex="-1" role="menuitem">前端编码规范</a></li>
                            <li class="divider" role="presentation"></li>
                            <li role="presentation"><a href="#" tabindex="-1" role="menuitem">待补充。。</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<!-- Subhead ================================================== -->
<header class="jumbotron subhead" id="overview">
    <div class="container">
        <h1>系统概述</h1>
        <p class="lead">smartFramework概述。</p>
    </div>
</header>

<div class="container">
    <!-- Docs nav ================================================== -->
    <div class="row">
        <div class="span3 bs-docs-sidebar">
            <ul class="nav nav-list bs-docs-sidenav">
                <li><a href="#summary"><i class="icon-chevron-right"></i> 概述</a></li>
                <li><a href="#desc"><i class="icon-chevron-right"></i> 相关技术</a></li>
                <li><a href="#faxing"><i class="icon-chevron-right"></i> 发行说明</a> </li>
                <li><a href="#jiegou"><i class="icon-chevron-right"></i> 结构说明</a></li>
                <li><a href="#"><i class="icon-chevron-right"></i> 待补充</a></li>
            </ul>
        </div>
        <div class="span9">
            <!-- Download  ================================================== -->
            <section id="summary">
                <div class="page-header">
                    <h1>概述</h1>
                </div>
                <p class="lead">smartFramework 是一套企业级web快速安全智能开发框架，旨在解决档案系统多样化的问题。</p>
            </section>

            <section id="desc">
                <div class="page-header">
                    <h1>相关技术</h1>
                    <p class="lead">
                        前端：javascript、jquery1.7+、css3、bootstrap 2.0。
                    </p>
                    <p class="lead">
                        MVC：Spring MVC。
                    </p>
                    <p class="lead">
                        安全：apache shiro。
                    </p>
                    <p class="lead">
                        检索：apache solr。
                    </p>
                </div>
            </section>

            <section id="faxing">
                <div class="page-header">
                    <h1>发行说明</h1>
                </div>
                <h3>版本说明</h3>
                <p>版本以4段有效数字命名，如 <code>3.01.01.001</code> ：</p>
                第一段 <code>&nbsp;&nbsp;3</code>： 表示大版本号。如smartFramework目前为3.0，即此位数字。从1开始。<br />
                第二段 <code>&nbsp;01</code>： 表示重大版本更新。一般指加入新的功能或者功能更换。此位数字为2位流水，从01开始。<br />
                第三段 <code>&nbsp;01</code>： 表示功能优化及升级。此位数字为2位流水，从01开始。<br />
                第四段 <code>001</code>： 表示程序迭代版本。一般指对功能进行bug的修改。
            </section>

            <section id="jiegou">
                <div class="page-header">
                    <h1>机构说明</h1>
                </div>
                <h3>项目结构</h3>
                <p>整个产品框架分为6个大模块：
                    <code>业务模块（smart-common）</code>、
                    <code>存储模块（smart-storage）</code>、
                    <code>安全模块（smart-security）</code>、
                    <code>核心模块（smart-core）</code>、
                    <code>jar管理模块（smart-jar）</code>
                </p>
                <h4>业务模块（smart-common）</h4>
                <p>此模块存放所有与业务有关的相关代码。</p>
                <h4>存储模块（smart-storage）</h4>
                <p>此模块存放所有与存储有关的代码</p>
                <h4>安全模块（smart-security）</h4>
                <p>此模块存放所有与安全验证有关的代码</p>
                <h4>核心模块（smart-core）</h4>
                <p>此模块为框架核心代码</p>
                <h4>jar管理模块（smart-jar）</h4>
                <p>此模块定义了整个框架的jar引用</p>
            </section>

            <section>
                <div class="page-header">
                    <h1>待补充</h1>
                </div>
            </section>
        </div>
    </div>
</div>
<!-- Footer ================================================== -->
<footer class="footer">
    <div class="container">
        <p class="pull-right">
            <a href="#">Back to top</a>
        </p>
        <p>北京汉龙思琪数码科技有限公司&nbsp;&nbsp;&nbsp;&nbsp;版权所有</p>
    </div>
</footer>
<!-- Le javascript  ================================================== -->
<script src="/_include/themes/bs2/js/jquery.js"></script>
<script src="/_include/themes/bs2/js/google-code-prettify/prettify.js"></script>
<script src="/_include/themes/bs2/js/bootstrap.min.js"></script>
<script>
    (function(){
        var $window = $(window)
        $('.bs-docs-sidenav').affix({
            offset: {
                top: function () { return $window.width() <= 980 ? 290 : 210 }
                , bottom: 270
            }
        })
    })();
</script>
</body>
</html>