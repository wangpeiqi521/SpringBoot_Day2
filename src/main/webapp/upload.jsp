<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html;utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/first/a" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"><br/>
    <input type="submit" value="上传文件">
</form>

</body>
</html>