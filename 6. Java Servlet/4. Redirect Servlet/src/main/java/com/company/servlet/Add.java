package com.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		int num = Integer.parseInt(request.getParameter("number"));
		int square = num * num;
		PrintWriter out =  response.getWriter();
		out.print("Square: "+square);
		
	}

}
