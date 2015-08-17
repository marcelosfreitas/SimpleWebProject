package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/divisao")
public class DividirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String xstr = req.getParameter("x");
		String ystr = req.getParameter("y");
		double resultado;
		
		PrintWriter writer = resp.getWriter();
		try{
			double x = Double.parseDouble(xstr);
			double y = Double.parseDouble(ystr);			
			if(y == 0){
				resultado = 0;
			}else{
				resultado = x / y;			
			}
			writer.write(String.format("Resultado da divisao %s", resultado));
		}catch(Exception e){
			writer.write(String.format("X e ou Y devem ser numericos"));
		}
	}
}