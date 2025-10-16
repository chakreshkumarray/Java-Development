package com.company.requestdispatcher;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(request.getParameter("fname"));
		int num2 = Integer.parseInt(request.getParameter("lname"));
		int addition = num1 + num2;
		
		// Request Object set Attribute
		request.setAttribute("number", addition);
		
		// Request Dispatcher
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("Addition");
		requestdispatcher.forward(request, response);
		
	}

}
