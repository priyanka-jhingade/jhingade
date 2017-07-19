package com.vendingmachine.adapter;

import com.vendingmachine.controller.UpdateController;
import com.vendingmachine.controller.VendingMachineController;

public class HandlerAdapter {

	public Object getInstance(String objectType){
		System.out.println(objectType);
		if(objectType.equalsIgnoreCase("opening")){
			return new VendingMachineController();
		}
		if(objectType.equalsIgnoreCase("update")){
			return new UpdateController();
		}
		return null;
	}
}
