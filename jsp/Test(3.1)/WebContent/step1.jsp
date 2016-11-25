<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
jsp 첫번째 연습
<!--  html 주석 -->
<%-- jps 주석 --%>

<% String name="황정민";
//out.print(name);
//지역변수로만 선언된다.
%>

<%-- doGet이나 doPost에서 코딩하고 있다고 생각 --%>
<font size="4" color="blue">

<%=name %><%-- name은 out.print()안에 들어가는 것이다. --%>

</font>

<hr>0~9까지 표현<br>
<table border="2">

<% for(int i=0;i<10;i++){%>
<tr>
<td><%=i+name%></td>
</tr>
 <% }%>
</table>

<hr>
<%=food %>
<%! //인스턴스 멤버 변수 선언시 다르다 //전역변수
	//지역변수로 선언되기때문에 private가 붙을 수가 없으므로 다르게 선언한다..
	String food="피자";
	%>
	<hr>
현재 시간 : <%=new Date().toString() %>

</body>
</html>