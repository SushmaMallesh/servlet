package com.workz.music;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicServlet extends HttpServlet{
public MusicServlet() {
	System.out.println("MusicServlet created");
}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("invoked service in MusicServlet");
	
	String musicAlbumName=request.getParameter("musicAlbumName");
	System.out.println("musicAlbumName :-".concat(musicAlbumName));

	String musicSinger=request.getParameter("musicSinger");
	System.out.println("musicSinger :-".concat(musicSinger));
	
	
	System.out.println("Response starting");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<html>");
	out.print("<body style=\"background-image:url(https://tse2.mm.bing.net/th?id=OIP.VNxX9etX2eCylrMRmBOhXAHaDQ&pid=Api&P=0&w=352&h=155);background-repeat:no repeat;background-size: cover; background-attachment: fixed\">");
	out.print("<h1 style='color:blue'>");
	out.print("details saved for musicAlbumName:".concat(musicAlbumName));
	out.print("<br>");
	out.print("musicSinger:".concat(musicSinger));
	out.print("<html>");
	out.print("</h1>");
	out.print("</body>");
	out.print("</html>");
	}
}
