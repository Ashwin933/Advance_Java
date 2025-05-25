package com.jsp.web;

import java.io.IOException;

import com.jsp.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteUserServlet extends HttpServlet {
	 protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        new UserDao().deleteUser(id);
	        response.sendRedirect("ListUserServlet");
	    }
	}
