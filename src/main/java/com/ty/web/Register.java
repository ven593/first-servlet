package com.ty.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//System.out.println("I am a register servlet");
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String passwd = req.getParameter("userPassword");
		System.out.println(name +": "+email+" "+passwd);
		PrintWriter out = res.getWriter();
		out.print(name+" "+email+" "+" "+passwd);
	}

}
