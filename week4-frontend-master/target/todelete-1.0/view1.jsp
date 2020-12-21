<%-- 
    Document   : view1
    Created on : Mar 4, 2019, 9:14:37 AM
    Author     : thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <% out.println(session.getAttribute("username"));%></h1>
        username fra sessionen: <%= session.getAttribute("username") %>
                
    </body>
</html>
