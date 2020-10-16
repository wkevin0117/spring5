<%-- 
    Document   : allCustomers.jsp
    Created on : 2020/10/16, 下午 04:02:08
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <c:forEach var="c" items="${custs}">
                <tr>
                    <td>${c.name}</td>
                    <td>${c.email}</td>
                    <td>${c.fax}</td>
                    <td>${c.addressline1}</td>
                    <td>${c.addressline2}</td>
                    <td>${c.state}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
