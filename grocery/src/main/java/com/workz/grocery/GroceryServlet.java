package com.workz.grocery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroceryServlet extends HttpServlet{
public GroceryServlet() {
	System.out.println("gymservlet created");
}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("invoked service in GroceryServlet");
	
	String groceryName=request.getParameter("groceryName");
	System.out.println("gymName :-".concat(groceryName));

	String groceryPrice=request.getParameter("groceryPrice");
	System.out.println("groceryPrice :-".concat(groceryPrice));
	
	
	System.out.println("Response starting");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<body style=\"background-image:url(https://tse2.mm.bing.net/th?id=OIP.Gim6DtkRAJUwDN7RR5GtTAHaE8&pid=Api&P=0&w=232&h=156);background-repeat:no repeat;background-size: cover; background-attachment: fixed\">");
	out.print("<h1 style='color:red'>");
	out.print("details saved for groceryName:".concat(groceryName));
	out.print("<br>");
	out.print("groceryPrice:".concat(groceryPrice));
	out.print("<html>");
	out.print("</h1>");
	out.print("</body>");
	out.print("</html>");
	}
}
