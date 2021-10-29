package com.workz.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	public CountryServlet() {
		System.out.println("CountryServlet created");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in Country Servlet");
		
		String countryName=request.getParameter("countryName");
		System.out.println("countryName :-".concat(countryName));

		//String countryLang=request.getParameter("countryLang");
		//System.out.println("countryLang :-".concat(countryLang));

		
		System.out.println("Response starting");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body style=background-image:url(https://a.1stdibscdn.com/world-glode-that-spins-for-sale/1121189/f_158487211566292254147/15848721_master.jpg?width=768);background-repeat:no repeat;background-size: cover; background-attachment: fixed\">");
		out.print("<h1 style='color:blue'>");
		out.print("details saved for countryName:".concat(countryName));
		//out.print("<br>");
		//out.print("countryLang:".concat(countryLang));
		out.print("<html>");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}


