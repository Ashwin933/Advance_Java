package com.jsp.web;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.List;

import com.jsp.dao.UserDao;
import com.jsp.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

public class ListUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<User> users = new UserDao().getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("jsp/list.jsp").forward(request, response);
    }
}
