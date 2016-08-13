package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test1 extends HttpServlet {
	
	private static final long serialVersionUID = -7979526585163063627L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("");
		
		String param = req.getParameter("param");
		
		System.out.println(param);
	}

}
