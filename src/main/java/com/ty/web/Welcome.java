package com.ty.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Welcome extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("darling");
		String msg = "Hi "+name+" welcome";
		PrintWriter out = res.getWriter();
		out.print("<html><body><h1>"+msg+"</h1></body></html>");
		
	}

}
