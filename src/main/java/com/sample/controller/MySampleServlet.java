package com.sample.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.service.dao.Validator;

public class MySampleServlet extends HttpServlet {

	public void init(HttpServlet config) throws  ServletException{
		super.init();
	}
	
	/*
	* doPost method. Processing Login request.
	*
	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		
		PrintWriter out  = response.getWriter();
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("passwd");
		Validator validator = new Validator();
		validator.setNamePassword();
		boolean b = false;
		b = validator.validateUser(uname,passwd);
		if(b){
			request.getRequestDispatcher("/welcome.jsp").forward(request,response);			
		}
		else{
			request.getRequestDispatcher("/error.jsp").forward(request,response);
		}
		
		
	}
	
	
} 