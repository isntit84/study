<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>



</head>
<body>
<%
//post방식 한글처리
request.setCharacterEncoding("utf-8");
int age=Integer.parseInt(request.getParameter("userAge"));
String name=request.getParameter("userName");
%>

<% if(age>=19){ %>
<%=name%>님 성인입니다.
<%}else{ %>
<%=name %>님 미성년자입니다
<%} %>


</body>
</html>