module boulderdashremake.boulder_dash_remake {
    requires javafx.controls;
    requires javafx.fxml;


    opens boulder_dash_remake to javafx.fxml;
    exports boulder_dash_remake;
}