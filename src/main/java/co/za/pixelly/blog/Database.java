package co.za.pixelly.blog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final String DB_URL = "jdbc:sqlite:db/blog.db";

    // Establish connection to SQLite
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Create tables for the blog app
    public static void createTables() {
        String createPostTableSQL = "CREATE TABLE IF NOT EXISTS post (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "title TEXT NOT NULL, " +
                "content TEXT NOT NULL" +
                ");";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(createPostTableSQL);
            System.out.println("Table 'posts' created or already exists.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
