package com.java.JDBCCodeTest.service;

import java.sql.SQLException;

import com.java.JDBCCodeTest.dao.VendingMachineDAO;
import com.java.JDBCCodeTest.datasource.ConnectionDetail;
import com.java.JDBCCodeTest.datasource.ConnectionInstantitiater;
import com.java.JDBCCodeTest.model.Product;


public class VendingMachineServiceImpl implements VendingMachineService{
	VendingMachineDAO vendingmachinedao=new VendingMachineDAO();
	
	ConnectionDetail connectiondetail = ConnectionInstantitiater.getConnectionInstance();
	
	public void insert(Product product) {
	
		try {
			
			connectiondetail.getConnection().setAutoCommit(false);
			vendingmachinedao.insertData(product);
			connectiondetail.getConnection().commit();
			connectiondetail.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connectiondetail.getConnection().rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	public void deleteRow(long id){
		try{
		connectiondetail.getConnection().setAutoCommit(false);
		vendingmachinedao.deleteRow(id);
		connectiondetail.getConnection().commit();
		connectiondetail.getConnection().close();
		}catch(SQLException e){
			try {
				connectiondetail.getConnection().rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public void updaterow(long id,int updatedQuantity) {
		try{
			connectiondetail.getConnection().setAutoCommit(false);
			vendingmachinedao.updateRow(id,updatedQuantity);
			connectiondetail.getConnection().commit();
			connectiondetail.getConnection().close();
		}catch(SQLException e){
			try {
				connectiondetail.getConnection().rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
