package com.vendingmachine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vendingmachine.adapter.ControllerIntiaterAdapter;

public class VendingMachineController extends ControllerIntiaterAdapter{

	//private static final long serialVersionUID = 1L;

	public String doGet(String uri) {
		String viewPage=null; 
		//System.out.println(request.get);
		if(uri.equals("/main")){
			viewPage="/index.jsp";
		}
		
		/*System.out.println(uri);
		if(uri.equals("/suplier")){
			viewPage="/suplier.jsp";
		}*/
		/*else if (uri.equals("/consumer")) {
			viewPage="/consumer.jsp";
		}*/
		return viewPage;
	}
}
