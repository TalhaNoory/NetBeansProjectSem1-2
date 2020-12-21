<%-- 
    Document   : index
    Created on : Mar 4, 2019, 9:41:51 AM
    Author     : thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List,dk.webtrade.todelete.entity.Person" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! </h1>
        <a href="MyServlet?username=Hans">click here</a>
        You can talk to the server
        
        <img src="img/goat.jpeg" alt="" width="200"/>
        
        <form action="MyServlet" method="GET">
            <input type="text" name="username"/>
            <input type="text" name="password"/>
            <input type="submit" value="gå til server"/>
        </form>
        <table>
                
            <thead><tr><th>name</th><th>age</th><th>address</th></tr></thead>
            <% List<Person> persons = (List<Person>)request.getAttribute("mytable");
                for (Person person : persons) {
            %>
            <tbody><tr>
                    <td><%= person.getName() %></td><td><%= person.getAge() %></td><td><%= person.getAddress() %></td>
                </tr></tbody>
            <%
                    }
            %>
        </table>
    </body>
</html>
