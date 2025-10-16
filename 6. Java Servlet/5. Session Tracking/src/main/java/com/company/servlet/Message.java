package com.company.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Message extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(request.getParameter("fname"));
		int num2 = Integer.parseInt(request.getParameter("lname"));
		int sum = num1 + num2;
		
		response.sendRedirect("Addition?number="+sum);
	}
	


}
