import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            // Prepare SQL insert statement
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO your_table (id, name) VALUES (?, ?)");

            // Set values
            ps.setInt(1, 101);
            ps.setString(2, "Alice");

            // Execute update
            ps.executeUpdate();
            System.out.println("Record inserted");

            // Close connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
