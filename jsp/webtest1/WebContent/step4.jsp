<%@ page language="java" contentType="text/html;charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% //post ����϶� �ѱ�ó��
request.setCharacterEncoding("utf-8");
//utf-8 ��� ������ �ٱ��� EUC-KR�ѱ���
%>

**jsp���� �赥���͸� �޾ƺ���. **<br>
<table border="2">
<tr>
<td>�̸�:<%=request.getParameter("username") %></td><td>��ȣ:<%=request.getParameter("userpass") %></td>
</tr>
</table>
<br><br>
<img src="img/t.jpg">

</body>
</html>