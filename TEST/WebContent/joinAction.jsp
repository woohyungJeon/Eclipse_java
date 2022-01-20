<%@page import = "java.io.PrintWriter" %>
<%@page import = "user.UserDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" />
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userGender" />
<jsp:setProperty name="user" property="userEmail" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 웹 사이트</title>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID") != null){
			userID = (String)session.getAttribute("userID");
		}//이미 로그인 되었으면 로그인 할수 없음.
		
		if(userID != null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 로그인 되어 있습니다.'')");
			script.println("location.href='main.jsp");
			script.println("</script>");
		}
	
		if(user.getUserID() == null || user.getUserPassword () == null || user.getUserName() == null
				|| user.getUserGender() == null || user.getUserEmail() == null)	{
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안 된 사항이 있습니다.')");
			script.println("history.back()");
			script.println("</script>");
		}else{
			UserDAO userDAO = new UserDAO();
			int result = userDAO.join(user);
			if(result == -1){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 아이디 입니다.')");
				script.println("history.back()");
				script.println("</script>");
			}else{
				session.setAttribute("userID", user.getUserID());
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('회원가입 성공')");
				script.println("location.href='main.jsp'");
				script.println("</script>");
			}
		}
	%>

</body>
</html>