package dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class EmpConnection {
		private static final String driver = "com.mysql.cj.jdbc.Driver";
		private static final String url = "jdbc:mysql://localhost:3306/database2";
		private static final String name = "root";
		private static final String password = "21551A05C6";
		private  static Connection con = null;
		public static Connection getconn(){
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,name,password);
				System.out.println("Database connection sucessfully");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
}
