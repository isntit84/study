<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
jsp ù��° ����
<!--  html �ּ� -->
<%-- jps �ּ� --%>

<% String name="Ȳ����";
//out.print(name);
//���������θ� ����ȴ�.
%>

<%-- doGet�̳� doPost���� �ڵ��ϰ� �ִٰ� ���� --%>
<font size="4" color="blue">

<%=name %><%-- name�� out.print()�ȿ� ���� ���̴�. --%>

</font>

<hr>0~9���� ǥ��<br>
<table border="2">

<% for(int i=0;i<10;i++){%>
<tr>
<td><%=i+name%></td>
</tr>
 <% }%>
</table>

<hr>
<%=food %>
<%! //�ν��Ͻ� ��� ���� ����� �ٸ��� //��������
	//���������� ����Ǳ⶧���� private�� ���� ���� �����Ƿ� �ٸ��� �����Ѵ�..
	String food="����";
	%>
	<hr>
���� �ð� : <%=new Date().toString() %>

</body>
</html>