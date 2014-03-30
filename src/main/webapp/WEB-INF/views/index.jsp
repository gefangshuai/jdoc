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
                        <h3 class="panel-title">文档信息</h3>
                    </div>
                    <div class="panel-body">
                        <ul>
                        <c:forEach items="${htmls}" var="html">
                            <li><a href="${html}">${html}</a></li>
                        </c:forEach>
                        </ul>
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
                var $this = $(this);
                $this.attr('disabled', 'disabled').html('<span class="glyphicon glyphicon-refresh"></span> 正在生成');

               $.get('/generate/', function(data){
                    alert("生成完成！")
                   location.reload();
                },'text');
            });

        })();
    </script>
</body>
</html>
