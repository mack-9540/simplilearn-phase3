
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.simplilearn.model.Product" %>
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
        <th>Name</th>
        <th>Company</th>
        <th>Category</th>
        <th>Size</th>
        <th>Amount</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Product> userList = (ArrayList<Product>) request.getAttribute("al");
        Integer i = 1;
        for(Product product: userList) {
    %>
    <tr>
    
    
        
        <td><%=product.getId()%></td>
        
        
        
        <td ><%=product.getName()%></td>
        <td ><%=product.getCompany()%></td>
        <td ><%=product.getCategory()%></td>
        <td ><%=product.getSize()%></td>
        <td ><%=product.getAmount()%></td>
        <td><form action="/delete",method ="post">
        <input type="hidden" value="<%=product.getId()%>" name="pid1">
        <button type="submit" value="delete">delete</button></form>
        <form action="/productCatAdd",method ="post">
        <input type="hidden" value="<%=product.getId()%>" name="pid1">
        <input type="hidden" value=1 name="isModify">
        <button type="submit" value="modify">Modify</button></form></td>
    </tr>
    
    
    
    <% } %>
    <br>
		<tr><td><a href="/home">HOME</a></td></tr>
</table>

</body>
</html>