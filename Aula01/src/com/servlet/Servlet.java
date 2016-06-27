package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		out.print("Funciona!!!");
		out.close();
	}
	
}