package Projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	
//DAO stands for Data Access Object. It contains SQl operations used by the java application
public class DAOService {

	public void employees(Scanner sc) {		//Here we are using Scanner object to take the user input. SO we import Scanner
		
		String sqlQuery = "insert into emp4" + "(empno, ename, job, mgr, hiredate, sal, comm, deptno)" + "values(?, ?, ?, ?, ?, ?, ?, ?)"; //Here only query is present with placeholders
		
		//For inserting
		try (Connection c = DbConnection.getConnection();  		//Here java calls getConnection() from Db.connection(). That method establishes a connection with MySQL using the database URL, username, and password.
			PreparedStatement s1 = c.prepareStatement(sqlQuery)){		//The actual PreparedStatement keeps the values separate from the SQL query. PreparedStatement object prepares insert so we can assign values to placeholders		
		
		
		System.out.println("enter empno: ");
		int eno = sc.nextInt();
		
		System.out.println("enter ename: ");
		String name = sc.next();
		
		System.out.println("enter job: ");
		String j= sc.next();
		
		System.out.println("enter mgr: ");
		int m = sc.nextInt();
		
		System.out.println("enter hiredate (yyyy-mm-dd): ");
		String date = sc.next();
		
		System.out.println("enter sal: ");
		double sal = sc.nextDouble();
		
		System.out.println("enter comm: ");
		String comm = sc.next();
		
		Integer input = comm.equalsIgnoreCase("null")		//If user enters null then it should display null otherwise it change into integer
		        ? null
		        : Integer.parseInt(comm);
		
		
		System.out.println("enter deptno: ");
		int deptno = sc.nextInt();
		
		
		s1.setInt(1, eno);			//These values are assigned to placeholders like (position, value)
		s1.setString(2, name);
		s1.setString(3, j);
		s1.setInt(4, m);
		s1.setString(5, date);
		s1.setDouble(6, sal);
		if (input == null) {
		    s1.setNull(7, java.sql.Types.INTEGER);
		} else {
		    s1.setInt(7, input);
		}
		s1.setInt(8, deptno);
		
		
		int rows = s1.executeUpdate();		//It updates the query. And it sends the INSERT query to MySQL.
		
		if(rows>0) {
			System.out.println("data is added sucessfully: ");
		}
		}catch(SQLException e1) {
			System.err.println(e1.toString());
		}
		

		
	}
	//Using join for displaying
		public void display() {
			String sql = "select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.deptno, e.comm " + "from emp4 as e " + "join dept as d on d.deptno = e.deptno";
			
			try(Connection c = DbConnection.getConnection();		//Connects java to Mysql
				PreparedStatement s1 = c.prepareStatement(sql);		//iT prepares the select query
				ResultSet r = s1.executeQuery()){					//Stores the result
					while(r.next()) {
						System.out.println(r.getInt("empno"));		//Here we want to get the values. Because we want the common values based on the condition
						System.out.println(r.getString("ename"));
						System.out.println(r.getString("job"));
						System.out.println(r.getInt("mgr"));
						System.out.println(r.getString("hiredate"));
						System.out.println(r.getDouble("sal"));
						
						System.out.println(r.getInt("deptno"));
						
						Object input = r.getObject("comm");		//If comm is NUll. Then it display as nUll instead of showing NUllPointerException
						System.out.println("Commission: " + input);
						System.out.println(" ");
						
					}
					
				
			}catch(SQLException e1) {
				System.err.println(e1.toString());
			}
					
		}
}
