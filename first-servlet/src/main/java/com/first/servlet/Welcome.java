package com.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Welcome extends HttpServlet {
public Welcome() {
	System.out.println("created");
}


@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	 PrintWriter htmlWriter=response.getWriter();
	 htmlWriter.print("<html>");
	 htmlWriter.print("<body>");
	 htmlWriter.print("<h1>");
	 htmlWriter.print("search page appeared");
	 htmlWriter.print("</h1>");
	 htmlWriter.print("</body>");
	 htmlWriter.print("</html>");
}
}
