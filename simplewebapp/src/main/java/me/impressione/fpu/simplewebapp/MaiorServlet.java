package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maior")
public class MaiorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String xstr = req.getParameter("x");
		String ystr = req.getParameter("y");
		PrintWriter writer = resp.getWriter();		
		
		try{
			Integer x = Integer.parseInt(xstr);
			Integer y = Integer.parseInt(ystr);
			Integer resultado;
			
			if(x > y){
				resultado = x;
			}else{
				resultado = y;
			}
			writer.write(String.format("O %s eh maior", resultado));			
		}catch(Exception e){
			writer.write(String.format("O valor de X ou Y deve ser numerico"));
		}
	}
}