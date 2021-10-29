package com.workz.secondServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet  extends HttpServlet{
	
		public DeleteServlet() {
			System.out.println("created");
		}


		@Override
			protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 response.setContentType("text/html");
			 PrintWriter htmlWriter=response.getWriter();
			 htmlWriter.print("<html>");
			 htmlWriter.print("<body>");
			 htmlWriter.print("<h1>");
			 htmlWriter.print("delete page appeared");
			 htmlWriter.print("</h1>");
			 htmlWriter.print("</body>");
			 htmlWriter.print("</html>");
		}
		}



