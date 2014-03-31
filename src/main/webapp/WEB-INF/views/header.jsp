<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tags.jsp"%>
<header>
    <nav class="navbar navbar-fixed-top navbar-inverse" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">JDOC</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li <c:if test="${nav eq 'index'}">class="active" </c:if> ><a href="/"><span class="glyphicon-home glyphicon"></span> 首页</a></li>
                <li><a href="/doc" target="_blank"><span class="glyphicon glyphicon-eye-open"></span> 预览</a></li>
                <li><a href="/demo" target="_blank"><span class="glyphicon glyphicon-align-justify"></span> 文档模版</a></li>
            </ul>
        </div>
    </nav>
</header>
