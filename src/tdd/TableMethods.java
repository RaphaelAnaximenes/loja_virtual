package tdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TableMethods {

	
	
	public static void fillOne() throws SQLException{
		ConnectionFactory ConnectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		String sql = "INSERT INTO Product (`productName`, `productDescription`, `productPrice`, `isStockedProduct`) VALUES"
			+ "('Red Shirt VI', 'Uma redshirt da marca VI', 5000, 1)";
		stm.execute(sql);
		connection.close();
	
	
}

	public static void clearTable() throws SQLException{
		ConnectionFactory ConnectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		String sql = "DROP TABLE PRODUCT";
		
		stm.execute(sql);
		connection.close();
	
	
}
	
	public static void displayAllProducts() throws SQLException{
		ConnectionFactory ConnectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		System.out.println("Function: Display Products");
		
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT * FROM PRODUCT");
		
		ResultSet rst = stm.getResultSet();
		
		
		
		while(rst.next()) {
			Integer productID = rst.getInt("productID");
			String productName = rst.getString("productName");
			String productDescription = rst.getString("productDescription");
			Integer productPrice = rst.getInt("productPrice");
			Boolean isStockedProduct = rst.getBoolean("isStockedProduct");
			
						
		System.out.println(productID + " | " + productName + " | " + productDescription + " | " + productPrice + " | " + isStockedProduct);
		
		}
		
		}

}

