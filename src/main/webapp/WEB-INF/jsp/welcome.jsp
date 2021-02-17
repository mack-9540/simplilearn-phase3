<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
justify-content: center;
margin: auto;
box-sizing: border-box;
text-align: center;
flex-flow: column;
}
.wrapper {
padding: 10px;
border: 1px solid black;
margin: 100px;
}
</style>
</head>
<body>
	
	<h3>Welcome</h3>
	<br>
<div class="wrapper">

    <br>
    <a href="/details">User details</a>
    <br>
    <br>
    <a href="/userSearch">Search User details</a>
    <br>
    <br>
    <a href="/changePassword">Change Password</a>
    <br>
    <br>
    <a href="/purchaseReport">Purchase Report</a>
    <br>
    <br>
    <a href="/productCat">Product Catalogue</a>
</div>
</body>
</html>