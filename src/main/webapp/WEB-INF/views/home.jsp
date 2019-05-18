<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 18.05.19
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<%@ include file="/WEB-INF/views/fragments/head.jspf" %>
<body>
<%@ include file="/WEB-INF/views/fragments/nav.jspf" %>
<div>
    <a href="${pageContext.request.contextPath}/">START</a>
</div>
<div>
    <a href="${pageContext.request.contextPath}/allStudents">Lista studentów</a>
</div>
<div style="height: 500px">
    Działam !!!

</div>


<%@ include file="/WEB-INF/views/fragments/footer.jspf" %>
</body>
</html>
