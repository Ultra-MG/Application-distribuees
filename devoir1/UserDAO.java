import java.sql.*;

public class UserDAO {
    private static final String INSERT_USER = "INSERT INTO users (name, Phone_number) VALUES (?, ?)";
    private static final String SELECT_USERS = "SELECT * FROM users";
    private static final String UPDATE_USER = "UPDATE users SET name = ? WHERE Phone_number = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE Phone_number = ?";

    public static void insertUser(String name, String number) {
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(INSERT_USER)) {
            pstmt.setString(1, name);
            pstmt.setString(2, number);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getUsers() {
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_USERS)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getString("Phone_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(String newName, String number) {
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(UPDATE_USER)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, number);
            pstmt.executeUpdate();
            System.out.println("User updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(String number) {
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(DELETE_USER)) {
            pstmt.setString(1, number);
            pstmt.executeUpdate();
            System.out.println("User deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertUser("Charlie", "70989756");
        getUsers();
        updateUser("Charlie Brown", "76543234");
        getUsers();
        deleteUser("03989723");
        getUsers();
    }
}
