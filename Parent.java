package Projects;

import java.util.Scanner;

public class Parent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DAOService d = new DAOService();
		System.out.println("enter you want: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : d.employees(sc);
		break;
		
		case 2 : d.display();
		break;
		
		default: System.out.println("not a valid option: ");
		}
	}

}

//JVM starts execution from main method
//User enters the choice. SO either 1 or 2 is selected. Then it goes to DAoService class and calls those methods. And DbConnection build the connection between sql DAOService by using getConnetion() and DBConnection class
//Then it insert or select the query by the selected case. Like if we choose case 1 then it goes to executeUpdate() which is used to "insert, update" the queries. It is int datatype. 
//For case 2 we use executeQuery() which is used to select the query and it is ResultSet type.
//For case 2 we use while(r.next()). it moves the cursor to the next row in the ResultSet


//DAOService is responsible for database operations.
//DbConnection is responsible for establishing the connection.
//PreparedStatement executes parameterized SQL queries.
//executeUpdate() is used for modifying records.
//executeQuery() is used for retrieving records.
//ResultSet stores the data returned by SELECT queries.
//r.next() moves through the retrieved rows.
//Child is a model class that represents employee data.