<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tags.jsp"%>
<html>
<head>
    <link rel="stylesheet" href="../../assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../../assets/css/custom.css"/>
    <title>文档生成器</title>
</head>
<body>
    <c:set value="index" var="nav" scope="request"/>
    <jsp:include page="header.jsp"/>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="jumbotron text-center">
                    <h1>基于markdown的文档生成工具</h1>
                    <h2 class="text-danger">以markdown的方式写文档，关注内容，提高效率！</h2>
                    <p></p>
                    <p>
                        <button class="btn btn-primary btn-lg" id="btnGenerate">
                            <span class="glyphicon glyphicon-cog"></span> 开始生成
                        </button>
                        <a class="btn btn-success btn-lg" role="button"><span class="glyphicon glyphicon-hand-right"></span> 学习</a>
                    </p>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">系统信息</h3>
                    </div>
                    <div class="panel-body">
                        有 ${postCount} 篇文章待生成！
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">任务信息</h3>
                    </div>
                    <div class="panel-body">
                        已生成 0 篇文章！
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <h3>生成进度：</h3>
                <div class="progress progress-striped active">
                    <div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
                        <span class="sr-only">60% Complete</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="../../assets/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="../../assets/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        (function(){
            $('#btnGenerate').on('click', function(){
                var timer = setInterval(function(){
                    var realLen = $('div.progress').width();
                    var current = $('div.progress-bar').width();
                    if(current < realLen){
                        current += realLen/10;
                        $('div.progress-bar').width(current);
                    }else{
                        console.log('完成！');
                        clearInterval(timer);
                    }
                },500);
                $.get('/generate/', function(data){

                },'text');
            });
        })();
    </script>
</body>
</html>
