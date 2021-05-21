import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task3 {
	   public static void main(String[] args) {

		   try{
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection con=DriverManager.getConnection(
			   "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=true","root","root");	
			   Statement stmt = con.createStatement();
		    
		         System.out.println("Inserting records");          
		         String sql = "INSERT INTO world.emp_Table VALUES (106,'Nitika', 20000)";
		         stmt.executeUpdate(sql);
		         sql = "INSERT INTO world.emp_Table VALUES (107,'Shivani',50000)";
		         stmt.executeUpdate(sql);
		         sql = "INSERT INTO world.emp_Table VALUES (108,'Roshni',30000)";
		         stmt.executeUpdate(sql);
		         sql = "INSERT INTO world.emp_Table VALUES(109,'Priti',25000)";
		         stmt.executeUpdate(sql);
		         sql = "INSERT INTO world.emp_Table VALUES(110,'Rushabh',28000)";
		         stmt.executeUpdate(sql);
		         System.out.println("Inserted records ");   	 	  
		   
		   ResultSet rs=stmt.executeQuery("select * from world.emp_Table");
		   while(rs.next())
		   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		   con.close();
		   }
		   catch(Exception e)
		   { 
			   System.out.println(e);
		   }
		   }
		}

