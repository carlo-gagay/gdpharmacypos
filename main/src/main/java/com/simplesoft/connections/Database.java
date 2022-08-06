package com.simplesoft.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:sqlite:/";
    private static final String DATABASE_DIR = "/home/carlotabayag/Documents";
    private static final String DATABASE_NAME = "database.db";
    private static Database instance = null;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL + DATABASE_DIR + "/" + DATABASE_NAME);
            System.out.println("SQLite Connection stablished");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public PreparedStatement getPreparedStatement(String sql)  throws SQLException {
        Connection conn = this.getConnection();
        if (conn == null) throw new SQLException("Returned null on getting connection.");
        return conn.prepareStatement(sql);
    }

}
