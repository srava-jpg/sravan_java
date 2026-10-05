package Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DbConnection establish jdbc connection with mysql
public class DbConnection {

	private static final String url = ("jdbc:mysql://localhost:3306/sravan7");	//We use private because url, password, username can be accessible only in this class. SO for security purpose
	private static final String username = "root";
	private static final String password = "root";

	public static Connection getConnection() throws SQLException {		//getConnection() is the static method. Here we use method instead of try, catch blocks. Beacuse these block is valid for only DBconnection. SO to use this getConnection method by other classes we use public 
        return DriverManager.getConnection(url, username, password);	//It creates the connection between Java and Mysql. So we can call DBConnection.getConnection() whenever you need a DB connection.
    }
}
