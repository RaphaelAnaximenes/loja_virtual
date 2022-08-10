package tdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest extends TableMethods{

	public static void main(String[] args) throws SQLException{

		System.out.println("[MAIN] Aberto... \n Realizando function sql !");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC"
				,"root"
				,"admin123"
				);
	displayAllProducts();
		
		System.out.println("Fechando...");
		con.close();
		
	}}