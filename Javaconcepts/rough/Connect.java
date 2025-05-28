package rough;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect 
{

	    public static void main(String[] args) 
	    {
	        // ✅ Use your actual QA DB details
	        String url = "jdbc:sqlserver://QADB-MSSQL-HAN1:1433;databaseName=IvyCPG_BimboColumbia01";
	        String user = "IvyCPG_BimboColumbia01_QAuser";
	        String password = "IvyCPG_BimboColumbia01_QAuserjkiml90hbvrg";

	        try 
	        {
	            // Step 1: Establish connection
	            Connection conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Connected to QA Database Successfully!");

	            // Step 2: Create a statement
	            Statement stmt = conn.createStatement();

	            // Step 3: Execute a correct SQL query
	            String sql = "update AppData_Transaction_Sequence set TRS_Sequence_No='19330' where TRS_Id=436";
	            int rowsAffected = stmt.executeUpdate(sql);

	            // Step 4: Print success message
	            System.out.println("✅ Data Inserted! Rows Affected: " + rowsAffected);

	            // Step 5: Close connection
	            conn.close();
	        } 
	        catch (SQLException e) 
	        {
	            System.out.println("❌ SQL Exception Occurred!");
	            System.out.println("Error Message: " + e.getMessage());
	            System.out.println("SQL State: " + e.getSQLState());
	            System.out.println("Error Code: " + e.getErrorCode());
	            e.printStackTrace();
	        }
	}
}
