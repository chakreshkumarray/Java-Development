package com.company.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// Request Object Get Attribute
		int adds = (int)request.getAttribute("number");
	
		PrintWriter out = response.getWriter();
		out.print("Addition numbers: "+adds);
		
	}

}
