<%@ page import="com.example.demo4.model.entity.Acteur" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 29010-55-02
  Date: 13/06/2024
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List<Acteur> acteurs  = (List) request.getAttribute("acteurs");
for(Acteur ac: acteurs) { %>
    <h1><%= ac.getNom() %> <%= ac.getPrenom() %></h1>
<% } %>

</body>
</html>
