package com.simplesoft.app.controllers.views;

import java.io.IOException;

import com.simplesoft.App;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}