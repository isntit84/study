<%@ page language="java" contentType="text/html;charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% //post 방식일때 한글처리
request.setCharacterEncoding("utf-8");
//utf-8 영어를 제외한 다국어 EUC-KR한국어
%>

**jsp에서 톰데이터를 받아본다. **<br>
<table border="2">
<tr>
<td>이름:<%=request.getParameter("username") %></td><td>암호:<%=request.getParameter("userpass") %></td>
</tr>
</table>
<br><br>
<img src="img/t.jpg">

</body>
</html>