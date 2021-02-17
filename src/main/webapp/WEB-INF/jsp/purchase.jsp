
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.simplilearn.model.Purchase" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Places</title>
    <style>
    body {
    box-sizing: border-box;
    text-align: center;
    }
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
        a {
        margin: 30px;
        background-color: black;
        text-decoration: none;
        color: aqua;
        padding: 10px;
        box-sizing: border-box;
        }
        a:hover {
	background-color: white;
	color: black;
}
    </style>
</head>
<body>
<div style="padding-top: 30px;">
<a href="/filterCategory">Filter by Category</a>
<a href="/filterDate">Filter by Date</a>
</div>
<br>
<table>
    <tr>
        <th>SNo.</th>
        <th>Product Name</th>
        <th>Quantity</th>
        <th>Amount Paid</th>
        <th>Category</th>
        <th>Purchase Date</th>
        <th>Company</th>
        <th>Size</th>
        <th>First Name</th>
        <th>Second Name</th>
        <th>Phone Number</th>
        <th>Email</th>
    </tr>
    <%
        ArrayList<Purchase> userList = (ArrayList<Purchase>) request.getAttribute("al");
        Integer i = 1;
        for(Purchase purchase: userList) {
    %>
    <tr>
        <td><%=i++%></td>
        <td><%=purchase.getProductName()%></td>
        <td><%=purchase.getQuantity()%></td>
        <td><%=purchase.getAmountPaid()%></td>
        <td><%=purchase.getCategory()%></td>
        <td><%=purchase.getPurchaseDate()%></td>
        <td><%=purchase.getCompany()%></td>
        <td><%=purchase.getSize()%></td>
        <td><%=purchase.getFirstName()%></td>
        <td><%=purchase.getSecondName()%></td>
        <td><%=purchase.getPhoneNumber()%></td>
        <td><%=purchase.getEmail()%></td>
        
    </tr>
    
    <% } %>
    <tr><td><a href="/home">HOME</a></td></tr>

</table>
</body>
</html>