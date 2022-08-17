<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <title>show-emp-details-view</title>
</head>
<body>
<h2> Dear Employee, you are Welcome!</h2>
<br>
<br>
<br>

<%--for showDetails--%>
<%--Your name: ${param.employeeName}--%>
<%--Your Surname: ${param.employeeSurname}--%>

<%--role: ${descriptionAttribute},--%>
Employee name: ${emp.name}
<br>
Employee surname: ${emp.surName}
<br>
Employee phone: ${emp.phoneNumber}
<br>
Employee email: ${emp.email}
<br>
Employee salary: ${emp.salary}
<br>
Employee department: ${emp.department}
<br><br>
Employee languages checkbox:
<ul>
    <c:forEach var="lang" items="${emp.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Employee languages checkboxes:
<ul>
    <c:forEach var="langList" items="${emp.listLanguage}">
        <li> ${langList.value}</li>
    </c:forEach>
</ul>


</body>
</html>
