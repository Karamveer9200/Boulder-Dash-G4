module boulder_dash_remake {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens boulder_dash_remake to javafx.fxml;
    exports boulder_dash_remake;
}