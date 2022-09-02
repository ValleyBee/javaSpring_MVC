<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.08.2022
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>ask-emp-details-view</title>
</head>
<body>
<h2>Dear Employee,Please enter your details</h2>
<br>
<br>

<form:form action="showDetails2" modelAttribute="emp" method="get">

    Name = <form:input path="name"/>
    <form:errors path="name" />
    <br><br>
    Surname = <form:input path="surName"/>
    <br><br>
    Phone = <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email = <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    Department = <form:select path="department">

    <%--    hardcode way--%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Engineering" label="ENG"/>--%>
    <%--    good practice --%>
    <form:options items="${emp.departments}"/>
    <%--    good practice --%>
    <br><br>
    Salary = <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
</form:select>
    Foreign language(s) checkbox:
    <form:checkbox path="languages" label="ENG" value="English"/>
    <form:checkbox path="languages" label="DE" value="Deutch"/>
    <form:checkbox path="languages" label="ESP" value="Spain"/>
    <br>
    Foreign language(s) checkboxes:
    <form:checkboxes path="languages" items="${emp.listLanguage}"/>
    <br>

    Accept conditions ? <form:radiobutton path="agreement" label="YES" value="yes"/> <form:radiobutton path="agreement"
                                                                                                       label="NO"
                                                                                                       value="no"/>
    <br><br>

    <input type="submit" value="OK">


</form:form>

</body>
</html>
