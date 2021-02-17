<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

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
}</style>
<title>Insert title here</title>
</head>
<body>
<div class="wrapper">
<form action="/productCatAdd" method="get">
<input type="hidden" value=-1 name="pid1">
        <input type="hidden" value=0 name="isModify">
<button class="button" type="submit" value="Add">Add</button>
</form>
<br>
<a href = "/productCatView" class = "button"> View</a>
<br>
</div>
</body>
</html>