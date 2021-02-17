<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="com.simplilearn.model.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
width: 100%;
height: 100%;
display: flex;
align-items: center;
margin: auto;
box-sizing: border-box;
text-align: center;
flex-flow: column;
}
.wrapper {
padding: 10px;
border: 1px solid black;
margin: 100px;
width:40%;
display:flex;
justify-content: center;
}
</style>
</head>
<body>

<font color="red">${errorMessage}</font>
<div class="wrapper">
<%
        Product p = (Product) request.getAttribute("al");
        Integer i = 1;
       
    %>

	<% if(p==null){
		%>
		<form action="/productAdd" method = "post">
	<input type="hidden" value=-1 name="pid1">
        <input type="hidden" value=0 name="isModify">
	<table>
	<tr><td>Product_name:
		<input type="text" name ="pName" value="">
		</td>
	</tr>
	<tr><td>Company:
		<input type="text" name ="pCompany" required="required" value="">
	</td></tr>	
		<tr><td>Category:
		<input type="text" name ="pCategory" required="required" value="">
		</td></tr>
		<tr><td>Size:
		<input type="number" name ="pSize" required="required" value="">
		</td></tr>
		<tr><td>Amount:
		<input type="number" name ="pAmount" required="required" value="">
		</td></tr>
		</table>
		
		<input type="submit" value ="Add">
		
	</form>
	<%
	}
	
	else
	{
	%>
	
	
	<form action="/productAdd" method = "post">
	<input type="hidden" value="<%=p.getId() %>" name="pid1">
        <input type="hidden" value=1 name="isModify">
	<table>
	<tr><td>Product_name:
		<input type="text" name ="pName" required="required" value="<%=p.getName() %>">
		</td>
	</tr>
	<tr><td>Company:
		<input type="text" name ="pCompany"  required="required" value="<%=p.getCompany() %>">
	</td></tr>	
		<tr><td>Category:
		<input type="text" name ="pCategory" required="required" value="<%=p.getCategory() %>">
		</td></tr>
		<tr><td>Size:
		<input type="text" name ="pSize" required="required" value="<%=p.getSize() %>">
		</td></tr>
		<tr><td>Amount:
		<input type="text" name ="pAmount" required="required" value="<%=p.getAmount() %>">
		</td></tr>
		</table>
		
		<input type="submit" value ="Update">
	</form>
	<%
	} %></div>

</body>
</html>