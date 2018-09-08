package com.testservlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name= (String) request.getSession().getAttribute("name");
		System.out.println("Invalidating session for  User :" + name);
		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);

	}

}