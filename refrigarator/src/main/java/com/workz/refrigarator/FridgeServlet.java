package com.workz.refrigarator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FridgeServlet extends HttpServlet {
	

	public FridgeServlet() {
		System.out.println("created FridgeServlet");
	}
	

	@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		String brand=request.getParameter("brand");
		String color= request.getParameter("color");
		String price=request.getParameter("price");
		
		System.out.println("Brand:"+brand);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);

		 PrintWriter htmlWriter=response.getWriter();
		 htmlWriter.print("<html>");
		 htmlWriter.print("<body>");
		 htmlWriter.print("<h1>");
		 htmlWriter.print("save is successful for LG "+color);
		 htmlWriter.print("</h1>");
		 htmlWriter.print("</body>");
		 htmlWriter.print("</html>");
		
//		{
//		String brand1=request.getParameter("brand");
//		String color1= request.getParameter("color");
//		String price1=request.getParameter("price");
//		
//		System.out.println("Brand1:"+brand1);
//		System.out.println("Color1:"+color1);
//		System.out.println("Price1:"+price1);
//		
//		
//		PrintWriter htmlWriter1=response.getWriter();
//		 htmlWriter1.print("<html>");
//		 htmlWriter1.print("<body>");
//		 htmlWriter1.print("<h1>");
//		 htmlWriter1.print("save page successful"+brand);
//		 htmlWriter1.print("</h1>");
//		 htmlWriter1.print("</body>");
//		 htmlWriter1.print("</html>");
//		}
	}
}
