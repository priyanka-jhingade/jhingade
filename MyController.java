package com.vendingmachine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vendingmachine.adapter.ControllerIntiaterAdapter;
import com.vendingmachine.adapter.HandlerAdapter;
import com.vendingmachine.interfaces.ControllerIntiaterInterface;

public class MyController extends HttpServlet {
	
	HandlerAdapter handlerAdapter = new HandlerAdapter();

	private static final long serialVersionUID = 1L;
	RequestDispatcher rd=null;
	ControllerIntiaterInterface controllerInitiater;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			//controllerIntiaterInterface=(ControllerIntiaterInterface) handlerAdapter.getInstance("opening");
		String Uri=request.getRequestURI();
		System.out.println(Uri);
		
		controllerInitiater.doGet(request.getRequestURI().toString());
		//System.out.println(result);
			//request.getRequestDispatcher(result);
			//rd.forward(request, response);
			/*System.out.println(request.getRequestURL());
			if(request.getRequestURI().equals("/update")){
				//System.out.println(request.getRequestURL());
				//controllerIntiaterInterface.doGet(request, response);
			}*/
		
	}

}
