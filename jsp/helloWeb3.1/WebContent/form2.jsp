<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <form action="MyServlet3" method="post">
      <table border="1" cellspacing="0">
         <caption>ȸ������</caption>
         <tr>
            <th>id</th>
            <td><input type="text" name="id"></td>
         </tr>
         <tr>
            <th>pwd</th>
            <td><input type="password" name="pwd"></td>
         </tr>

         <tr>
            <th>����</th>
            <td><input type="radio" name="gender" value="f">�� <input
               type="radio" name="gender" value="m">��</td>
         </tr>

         <tr>
            <th>���</th>
            <td><input type="checkbox" name="hobby" value="1">�״Ͻ� <input
               type="checkbox" name="hobby" value="2">Ź�� <input
               type="checkbox" name="hobby" value="3">�� <input
               type="checkbox" name="hobby" value="4">�߱�</td>
         </tr>

         <tr>
            <th>�г�</th>
            <td><select name="grade">
                  <option value="1">1�г�</option>
                  <option value="2">2�г�</option>
                  <option value="3">3�г�</option>
                  <option value="4">4�г�</option>
            </select></td>
         </tr>

         <tr>
            <th>�����λ�</th>
            <td><textarea rows="5" cols="30" name="content">�ȳ��ϼ���</textarea></td>
         </tr>

         <tr>
            <td colspan="2"><input type="reset" value="�ʱ�ȭ"> 
            <input type="submit" value="����"></td>
         </tr>
      </table>
   </form>
</body>
</html>