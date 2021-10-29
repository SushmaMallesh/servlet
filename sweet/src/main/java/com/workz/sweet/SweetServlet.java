package com.workz.sweet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SweetServlet extends HttpServlet{
public SweetServlet() {
	System.out.println("gymservlet created");
}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("invoked service in SweetServlet");
	
	String sweetName=request.getParameter("sweetName");
	System.out.println("sweetName :-".concat(sweetName));

	String sweetOrigin=request.getParameter("sweetOrigin");
	System.out.println("sweetOrigin :-".concat(sweetOrigin));
	
	String sweetColor=request.getParameter("sweetColor");
	System.out.println("sweetColor :-".concat(sweetColor));
	
	String sweetPrice=request.getParameter("sweetPrice");
	System.out.println("sweetPrice :-".concat(sweetPrice));
	
	
	
	
	System.out.println("Response starting");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<body style=\"background-image:url(https://tse1.mm.bing.net/th?id=OIP.l6--uguOrKWvC57zydG_3gHaE8&pid=Api&P=0&w=238&h=160);background-repeat: no-repeat;background-size: cover; background-attachment: fixed\">");
	out.print("<h1 style='color:blue'>");
	out.print("details saved for sweetName :".concat(sweetName));
	out.print("<br>");
	out.print("sweetOrigin :".concat(sweetOrigin));
	out.print("<br>");
	out.print("sweetColor :".concat(sweetColor));
	out.print("<br>");
	out.print("sweetPrice :".concat(sweetPrice));
	out.print("<br>");
	out.print("<html>");
	out.print("</h1>");
	out.print("</body>");
	out.print("</html>");
	}
}

