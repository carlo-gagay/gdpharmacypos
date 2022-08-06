package com.simplesoft.app.controllers.views;

import java.io.IOException;

import com.simplesoft.App;
import com.simplesoft.databases.migrations.create_users_table;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void testDriver() throws IOException {
        create_users_table users = new create_users_table();
        users.create();
    }
}
