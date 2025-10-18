package com.company.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Addition")
public class Add extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		HttpSession session = request.getSession();
		int num1 = (int)session.getAttribute("square");
		int square = num1 * num1;
		PrintWriter out = response.getWriter();
		out.print("Square of the number: "+square);
		
	}

}
