package com.servlets.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServelet extends GenericServlet { 
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h2>Welcome to Servelet</h2>");
		pw.println("<h2>Running my first program</h2>");
		
		pw.println("<html>");
		pw.println("<body>");
		
		

	}

}
