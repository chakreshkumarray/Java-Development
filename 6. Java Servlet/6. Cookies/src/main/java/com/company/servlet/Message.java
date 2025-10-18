package com.company.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Message extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String num1 = request.getParameter("num1");
		PrintWriter out = response.getWriter();
		out.print(num1);
		
		boolean uservisit = false;
		
	    Cookie[] cookies = request.getCookies();
	    
	    if(cookies != null) {
	    	   for(int i = 0; i < cookies.length; i++) {
	    		   Cookie c = cookies[i];
	    		   String name = c.getName();
	    		   String val = c.getName();
	    		   
	    		   if(name.equals("Addition") && val.equals("123")) {
	    			   out.print("Welcome back "+num1);
	    			   uservisit = true;
	    			   break;
	    		   }
	    	   }
	    }
	    if(uservisit == false) {
	    	Cookie cookies1 = new Cookie("Addition","123");
	    	response.addCookie(cookies1);
	    	out.print("Welcome "+num1);
	    }
		
	}

}
