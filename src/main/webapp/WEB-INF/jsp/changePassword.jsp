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
}
</style>
</head>
<body>

<div class="wrapper">
<font color="red">${errorMessage}</font>
<form action = "/password" method = "post">
Enter New Password <br><br>
<input type = "text" name = "newPass"> <br><br>
<input type = "submit">

</form>
</div>

</body>
</html>