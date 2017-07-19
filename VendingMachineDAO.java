package com.java.JDBCCodeTest.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.JDBCCodeTest.datasource.ConnectionDetail;
import com.java.JDBCCodeTest.datasource.ConnectionInstantitiater;
import com.java.JDBCCodeTest.model.Product;

public class VendingMachineDAO {
	ConnectionDetail connectionDeatail = ConnectionInstantitiater.getConnectionInstance();
	PreparedStatement preparedStatement ;
	public void insertData(Product product) {
		
		try{
			preparedStatement= connectionDeatail.getConnection().prepareStatement("INSERT INTO product ( productname, quantity, price) VALUES (?,?,?)"
, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setInt(2, product.getQuantity());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void deleteRow(long id) {
		try {
			preparedStatement=connectionDeatail.getConnection().prepareStatement("DELETE  FROM product WHERE productid ="+id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void updateRow(long id,int updatedQuantity) {
		try {
			preparedStatement=connectionDeatail.getConnection().prepareStatement("Update product set quantity =? where productid=?");
			preparedStatement.setInt(1, updatedQuantity);
			preparedStatement.setLong(2, id);
			preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
