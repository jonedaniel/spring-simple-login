<!DOCTYPE html>
<html>
<head>
    <title>index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(function () {
            $("#logout").click(function () {
                $.ajax("/logout", {
                    success: function () {
                        window.location.href = "/index";
                    }
                })
            })
        })
    </script>
</head>
<body>
<!-- header-section-starts -->
<#include "common/home.ftl" />
<div class="full">
    <div class="col-md-3 top-nav">
        <#include "common/top-nav.ftl" />
    </div>
    <div class="col-md-9 main">
        <div>
            <button type="button" value="submit" class="btn-danger" id="smt"></button>
        </div>

        <table class="table">
            <tr>
                <td>商品名</td>
                <td>价格</td>
                <td>余量</td>
                <td>操作</td>
            </tr>
            <#if list??>
           <#list list as goods>
               <tr>
                   <td>${goods.gname}</td>
                   <td>${goods.gprice}</td>
                   <td>${goods.gnum}</td>
                   <td></td>
               </tr>
           </#list>
            </#if>
        </table>
        <#include "common/footer.ftl" />
    </div>
    <div class="clearfix"></div>
</div>

</body>
</html>