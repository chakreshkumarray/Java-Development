package com.FirstProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Message extends HttpServlet{
	
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException{
		
		String n = request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.print("Hello "+ n);
	}

}
