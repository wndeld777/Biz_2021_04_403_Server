package com.callor.welcome.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wndeld777")
public class UserController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome wndeld777 HOME<h1>");
		out.println("<a href='https://naver.com'>" );
		out.println("<h2>네이버</h2>");
		out.close();
	}
	
	

}
