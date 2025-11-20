import java.sql.*;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/yourDB", "root", "password");

            // Prepare SQL delete statement
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM your_table WHERE id = ?");

            // Set the value to delete
            ps.setInt(1, 101);

            // Execute deletion
            ps.executeUpdate();
            System.out.println("Record deleted");

            // Close the connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
