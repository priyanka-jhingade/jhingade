package com.vendingmachine.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerIntiaterInterface {
	public String doGet(String uri);
	public String doPost(HttpServletRequest request,HttpServletResponse response);
}
