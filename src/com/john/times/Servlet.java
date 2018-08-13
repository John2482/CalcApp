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
		int answer = 0;
		String error = "";
		int number1 = Integer.parseInt(request.getParameter("1number"));
        int number2 = Integer.parseInt(request.getParameter("2number"));
        String button = request.getParameter("sel");
        
        if(button.equals("add"))
        {
        	answer = m.add(number1, number2);
        }
        else if(button.equals("sub"))
        {
        	answer = m.sub(number1, number2);
        }
        else if(button.equals("mult"))
        {
        	answer = m.mult(number1, number2);
        }
        else if(button.equals("div"))
        {
        	if(number2 == 0){
        		
        		error = "CANT DIVIDE BY ZERO!!!!!";
        		request.setAttribute("error", error);
        		request.setAttribute("answer", "NULL");
        	}
        	else
        	{
        		answer = m.div(number1, number2);
        	}
        }
        request.setAttribute("answer", answer);
        
        doGet(request, response);
    }
	
}
