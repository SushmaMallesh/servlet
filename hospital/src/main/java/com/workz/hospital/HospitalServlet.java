package com.workz.hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet {
	public HospitalServlet() {
		System.out.println("hospitalservlet created");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in hospital servlet");
		
		String hospitalName=request.getParameter("hospitalName");
		System.out.println("hospital :-".concat(hospitalName));

		String hospitalFounder=request.getParameter("hospitalFounder");
		System.out.println("hospitalFounder :-".concat(hospitalFounder));
		
		System.out.println("Response starting");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body style=background-image:url(https://static0.babygagaimages.com/wordpress/wp-content/uploads/2019/01/Inside-Hospital.jpg)>");
		out.print("<h1 style='color:blue'>");
		out.print("details saved for ::".concat(hospitalName));
		//out.print("details saved for ::".concat(hospitalFounder));
		out.print("<html>");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}


