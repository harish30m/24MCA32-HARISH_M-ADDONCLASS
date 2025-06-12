package aa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_OPERATION {
    // JDBC URL, username and password of MySQL server
    static final String DB_URL = "jdbc:mysql://localhost:3306/employeedb";  // include database name here :contentReference[oaicite:11]{index=11}
    static final String USER   = "root";
    static final String PASS   = "SYSTEM";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
            return;
        }

        String createTableSQL = ""
            + "CREATE TABLE IF NOT EXISTS Employee ("
            + "  ID INT AUTO_INCREMENT PRIMARY KEY,"
            + "  Name VARCHAR(50),"
            + "  Age INT,"
            + "  Department VARCHAR(50)"
            + ")";

        String insertSQL = ""
            + "INSERT INTO Employee (Name, Age, Department) VALUES "
            + "('Kamal', 21, 'Full stack development'),"
            + "('Kannan', 22, 'Web Development'),"
            + "('Kesaven', 24, 'HR')";

        String selectSQL = "SELECT * FROM Employee";
        String deleteSQL = "DELETE FROM Employee WHERE Name = 'Kannan'";
        String updateSQL = "UPDATE Employee SET Age = 30 WHERE Name = 'Kannan'";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement()
        ) {
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'Employee' created or already exists.");

            int inserted = stmt.executeUpdate(insertSQL);
            System.out.println(inserted + " record(s) inserted.");

            System.out.println("\nAll records:");
            try (ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    System.out.printf(
                        "ID: %d, Name: %s, Age: %d, Dept: %s%n",
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getInt("Age"),
                        rs.getString("Department")
                    );
                }
            }

            int deleted = stmt.executeUpdate(deleteSQL);
            System.out.println("\n" + deleted + " record(s) deleted.");

            int updated = stmt.executeUpdate(updateSQL);
            System.out.println(updated + " record(s) updated.");

        } catch (SQLException se) {
            System.err.println("SQL error occurred:");
            se.printStackTrace();
        }

        System.out.println("\nGoodbye!...");
    }
}
