
package loja_virtual;


import java.sql.Connection;
import java.sql.SQLException;


public class main {
  public static void main(String[] args) throws SQLException {
	
	ConnectionFactory ConnectionFactory = new ConnectionFactory();
	Connection connection = ConnectionFactory.recuperarConexao();
	
	System.out.println("Comandos");
	
	
	connection.close();
  }
 }