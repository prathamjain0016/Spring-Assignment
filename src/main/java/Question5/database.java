package Question5;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

	private static final String URL = "jdbc:mysql://localhost:3307/trainer";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Acc0@user";
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}