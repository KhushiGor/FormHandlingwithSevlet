package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SocketMachineApp extends HttpServlet 
{
	private static final long serialVersionUID = 1L;  
    public SocketMachineApp() {
        super();
    	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String firstName = request.getParameter("first_name");
		 String lastName = request.getParameter("last_name");
		 String socketType = request.getParameter("socket_type");
		 String quantityStr = request.getParameter("quantity");
		 int quantity = 0;
	        if (quantityStr != null && !quantityStr.isEmpty()) {
	            quantity = Integer.parseInt(quantityStr);
	        }
	      int quote = 1;
	      switch(socketType) {
	      case "typeA" : quote = quantity * 10;
	      break;
	      case "typeB" : quote = quantity * 15;
	      break;
	      case "typeC" : quote = quantity * 20;
	      break;
	      }
	        
	      response.getWriter().append(request.getContextPath());
			 PrintWriter out = response.getWriter();
	        out.println("Form Data Received");
	        out.println("First Name: " + firstName);
	        out.println("Last Name: " + lastName);
	        out.println("Socket Type: " + socketType);
	        out.println("Quantity: " + quantity);
	        out.println("Price Quote: " + quote);
		
		}
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
