import java.sql.*;

public class ShowAllValues {
    public static void main(String[] args) {
        try {
            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");

            // Display all records
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
