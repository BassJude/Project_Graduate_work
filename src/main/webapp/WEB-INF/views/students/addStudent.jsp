<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
<%@ include file="/WEB-INF/views/fragments/head.jspf" %>
<body>
<%@ include file="/WEB-INF/views/fragments/nav.jspf" %>
<div>
    <a href="${pageContext.request.contextPath}/">START</a>
</div>

<div>

    <h1>Dodaj studenta</h1>
    <form:form method="post" modelAttribute="student">
        <div>
            <form:input path="imie" placeholder="imię"/>
            <form:errors path="imie" cssClass="error"/>
        </div>
        <div>
            <form:input path="nazwisko" placeholder="nazwisko"/>
            <form:errors path="nazwisko" cssClass="error"/>
        </div>
        <div>
            <%--<button type="submit">Dodaj studenta</button>--%>
            <input type="submit" value="Zapisz">
        </div>

    </form:form>

</div>


<%@ include file="/WEB-INF/views/fragments/footer.jspf" %>
</body>
</html>
