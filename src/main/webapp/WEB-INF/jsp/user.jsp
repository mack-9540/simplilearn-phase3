
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.simplilearn.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Places</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<br>
<br>
<table>
    <tr>
        <th>SNo.</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone Number</th>
        <th>Email</th>
    </tr>
    <%
        ArrayList<User> userList = (ArrayList<User>) request.getAttribute("al");
        Integer i = 1;
        for(User user: userList) {
    %>
    <tr>
        
        <td><%=user.getId()%></td>
        <td><%=user.getFirstName()%></td>
        <td><%=user.getSecondName()%></td>
        <td><%=user.getPhoneNumber()%></td>
        <td><%=user.getEmail()%></td>
    </tr>
    
    <% } %>
    <tr><td><a href="/home">HOME</a></td></tr>

</table>
</body>
</html>