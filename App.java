package com.java.JDBCCodeTest;

import com.java.JDBCCodeTest.model.Product;
import com.java.JDBCCodeTest.service.VendingMachineService;
import com.java.JDBCCodeTest.service.VendingMachineServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Product product =new Product();
       product.setProductName("Amul");
		product.setPrice(30);
		product.setQuantity(4);*/
		
		VendingMachineService service = new VendingMachineServiceImpl();
		//service.insert(product);
		//service.deleteRow(6);
		service.updaterow(7, 7);
    }
}
