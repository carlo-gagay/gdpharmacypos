package com.simplesoft.databases.migrations;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.simplesoft.connections.Database;
import com.simplesoft.interfaces.IMigration;

public class create_users_table implements IMigration {

    @Override
    public void create() {
        String sql = "CREATE TABLE users ( id int PRIMARY_KEY AUTO_INCREMENT, user_name varchar(255) UNIQUE NOT NULL, password varchar(255) NOT NULL, created_at DATETIME, update_at DATETIME)";
        try (PreparedStatement pStatement = Database.getInstance().getPreparedStatement(sql)) {
            if (pStatement.execute())
                System.out.println("Create users_table success");
            else
                System.out.println("Create users_table failed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void drop() {

    }
}
