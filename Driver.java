import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	
	public static void main (String [] args) {
		
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3304/jdbc-video","root","Wva@4389");
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("select * from people");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getString("firstname"));
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}


/* Connection - A connection 
 Connection -  A connection (session) with a specific database.
 Driver Manager - Basic service for managing JDBC drivers.
 Statement - an interface that represents a SQL statement. You need a connection 
 object to create a statement object.
 ResultSet- A table of data representing the results returned from the database. 
*/