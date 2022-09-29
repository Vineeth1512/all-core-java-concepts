package connecting.database.in.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/Resourcing";
		String userName = "postgres";
		String password = "@1234";
		String query = "create table student( id integer not null primary key,name varchar(10),address text)";

		
			System.out.println("From   Startinig");
			Connection connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from student where id=1");

			// String name = resultset.getString("name");
			// String addres=resultset.getString("address");
			// statement.execute(query);
			// System.out.println(name+" "+addres);
			resultset.next();
			statement.close();

			System.out.println("from Catch block");
		
	}

}
