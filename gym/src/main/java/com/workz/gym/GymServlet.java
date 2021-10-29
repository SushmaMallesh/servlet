package com.workz.gym;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GymServlet extends HttpServlet{
public GymServlet() {
	System.out.println("gymservlet created");
}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("invoked service in gym servlet");
	
	String gymName=request.getParameter("gymName");
	System.out.println("gymName :-".concat(gymName));

	String Location=request.getParameter("Location");
	System.out.println("Location :-".concat(Location));
	
	String fees=request.getParameter("fees");
	System.out.println("Fees:-".concat(fees));
	
	System.out.println("Response starting");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<body style=background-image:url(https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/people-running-on-a-treadmill-in-health-club-royalty-free-image-478859478-1534780309.jpg?crop=1xw:0.74922xh;center,top&resize=1200:*)>");
	out.print("<h1 style='color:blue'>");
	out.print("details saved for ::".concat(gymName));
	//out.print("details saved for ::".concat(Location));
	out.print("<html>");
	out.print("</h1>");
	out.print("</body>");
	out.print("</html>");
	}
}
