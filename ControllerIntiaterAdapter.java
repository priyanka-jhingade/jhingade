package com.vendingmachine.adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vendingmachine.interfaces.ControllerIntiaterInterface;

public abstract class ControllerIntiaterAdapter implements ControllerIntiaterInterface{
	HandlerAdapter handlerAdapter=null;
	public String doGet(String uri) {
		System.out.println(uri);
	ControllerIntiaterInterface controllerIntiaterInterface=(ControllerIntiaterInterface) handlerAdapter.getInstance("opening");
		return controllerIntiaterInterface.doGet(uri);
	}

	public String doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
