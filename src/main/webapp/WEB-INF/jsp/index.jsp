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
}
.wrapper {
padding: 10px;
border: 1px solid black;
margin: 100px;
}
</style>
</head>
<body>
<div class="wrapper">
<font color="red">${errorMessage}</font>
    <form   method="post">
        Name : <input type="text" name="username" /> <br><br><br>
        Password : <input type="password" name="password" /> 
        <br><br>
        <input type="submit" />
    </form>
</div>
</body>
</html>