<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body bgcolor = 'pink'>
      <%
      int num = Integer.parseInt(request.getParameter("number"));
      int square = num * num;
      out.print("Square = "+square);
      %>

</body>
</html>