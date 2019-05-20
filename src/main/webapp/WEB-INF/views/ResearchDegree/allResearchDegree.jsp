<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
<%@ include file="/WEB-INF/views/fragments/head.jspf" %>
<body>
<%@ include file="/WEB-INF/views/fragments/nav.jspf" %>
<div>
    <a href="${pageContext.request.contextPath}/">START</a>
</div>
<div>
    Lista stopni naukowych


</div>

<div>

    <table border="1">
        <thead>
        <tr>
            <td>Id</td>
            <td>Stopień naukowy</td>
            <td>Edytuj</td>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${researchDegree}" var="degree">
            <tr>
                <td>${degree.id_stopnia}</td>
                <td>${degree.nazwa}</td>
                <td><a style="color: #309125" href="${pageContext.request.contextPath}/editResearchDegree/${degree.id_stopnia}">Edytuj</a></td>

            </tr>

        </c:forEach>
        </tbody>


    </table>

</div>


<%@ include file="/WEB-INF/views/fragments/footer.jspf" %>
</body>
</html>
