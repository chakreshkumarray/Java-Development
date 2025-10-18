package com.company.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/message")
public class Message extends HttpServlet{
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num1 = Integer.parseInt(request.getParameter("number"));
		HttpSession session = request.getSession();
		session.setAttribute("square", num1);
		response.sendRedirect("Addition");
		
	}

}
