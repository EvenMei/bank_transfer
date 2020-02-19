<%--
  Created by IntelliJ IDEA.
  User: meiyukai
  Date: 2020-01-12
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> this is table jsp</h3>



<c:forEach items="${list}" var="account" >
    id :    ${account.id}
    name:    ${account.name}
    money :    ${account.money}
    </br>
</c:forEach>


<a href="/user/start.do">张三向李四转账1000元</a>

</body>
</html>
