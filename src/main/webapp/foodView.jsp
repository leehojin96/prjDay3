<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import="prjDay3.Food"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>음식 List</h3>
<%ArrayList<Food> list = (ArrayList<Food>)request.getAttribute("foodlist"); %>
<table>
<%for(int i = 0 ; i < list.size();i++){
	Food food = list.get(i);
%>
<tr>
<td><%food.getName() %></td>
<td><%food.getPrice() %></td>
</tr>
<% }	%>
</table>
</body>
</html>