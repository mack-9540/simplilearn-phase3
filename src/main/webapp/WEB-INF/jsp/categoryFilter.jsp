<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int flag = (Integer)(request.getAttribute("flag"));

if (flag==0){


%>
<form action="/filterCategoryFetch" method="get">
<select name="category">

<%
        ArrayList<String> al =  (ArrayList<String>)request.getAttribute("al2");
        
        
        for(int i=0;i<al.size();i++)
        {
       
    %>
        <option value="<%=al.get(i)%>" name="category"><%=al.get(i) %></option>
        <%
        } 
        
        %>
    
</select>
<button type="submit">Go</button>
</form>
<%
}

if(flag==1){
%>
<form action="/filterdateFetch" method="get">
<table>
<tr>
<td>From Date</td>
<td>To Date</td>
</tr>
<tr>
<td><input type=date name="fromDate"></td>
<td><input type=date name="toDate"></td>
<tr><td><button type="submit">Go</button></td></tr>
</table>
</form>

<%	
}
%>
</body>
</html>