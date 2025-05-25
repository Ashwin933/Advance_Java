package com.jsp.web;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

import com.jsp.dao.UserDao;
import com.jsp.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class EditUserServlet extends HttpServlet {
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        UserDao dao = new UserDao();
        User user = dao.getUserById(id);
        user.setName(name);
        user.setEmail(email);
        dao.saveUser(user);

        response.sendRedirect("ListUserServlet");
    }
}

