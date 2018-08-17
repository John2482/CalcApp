package com.john.times;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet", urlPatterns={"/Servlet"} ) 
public class Servlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9202772013872275985L;
	@EJB
	private Multiplier m;
	
	@Override
	protected void doGet(
	        HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        request.getRequestDispatcher("/multiply.jsp").forward(request, response);
	    }

	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        String display = "";
		String button = request.getParameter("sel");
        display = request.getParameter("display");
        String answer = display + button;
        request.setAttribute("display", answer);
        
        
        doGet(request, response);
    }
	
}
