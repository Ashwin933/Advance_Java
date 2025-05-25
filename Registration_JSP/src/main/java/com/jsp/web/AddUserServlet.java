package com.jsp.web;

import java.io.IOException;

import com.jsp.dao.UserDao;
import com.jsp.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class AddUserServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		
		new UserDao().saveUser(user);
		res.sendRedirect("ListUserServlet");
	}
}
