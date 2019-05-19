<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 18.05.19
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
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
    Lista studentów


</div>

<div>

    <table border="1">
        <thead>
            <tr>
                <td>Id</td>
                <td>Numer indeksu</td>
                <td>Imię</td>
                <td>Nazwisko</td>
                <td>Edytuj</td>
                <td>Usuń</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${studentList}" var="student">
                <tr>
                    <td>${student.id_studenta}</td>
                    <td>${student.numer_indeksu}</td>
                    <td>${student.imie}</td>
                    <td>${student.nazwisko}</td>
                    <td><a style="color: #309125" href="${pageContext.request.contextPath}/editStudent/${student.id_studenta}">Edytuj</a></td>
                    <td><a style="color: #309125" href="${pageContext.request.contextPath}/deleteStudent/${student.id_studenta}" onclick="return confirm('Czy na pewno skasować?')">Usuń</a></td>
                </tr>

            </c:forEach>
        </tbody>


    </table>

</div>


<%@ include file="/WEB-INF/views/fragments/footer.jspf" %>
</body>
</html>
