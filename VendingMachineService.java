package com.java.JDBCCodeTest.service;

import com.java.JDBCCodeTest.model.Product;

public interface VendingMachineService {
	public void insert(Product product);
	public void deleteRow(long id);
	public void updaterow(long id ,int updatedQuantity);
}
