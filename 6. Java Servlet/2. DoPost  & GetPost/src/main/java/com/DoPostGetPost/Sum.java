package com.DoPostGetPost;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num1 = Integer.parseInt(request.getParameter("fname"));
		int num2 = Integer.parseInt(request.getParameter("lname"));
		int addition = num1 + num2;
		PrintWriter out = response.getWriter();
		out.print("Sum of Number: "+addition);
		
		
	}

}
