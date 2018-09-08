package com.testservlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testservlet.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServletWithJSP extends HttpServlet {

	
	private LoginService  loginService = new LoginService();
	private TodoService todoService = new TodoService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name= request.getParameter("name");
		request.setAttribute("name", name);
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
	
		System.out.println("Validationg session :");
		boolean isValidateUser = loginService.validate(name, password);
		if(isValidateUser) {
			System.out.println("Validationg session :");
			request.getSession().setAttribute("name", name);
			request.setAttribute("todos", todoService.retrieveTodos());
			response.sendRedirect("/list-todo.do");
			
			//request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request, response);
			
		}else {
			request.setAttribute("errorMessage","Please enter valid credentials");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}
			
		
	}
}
