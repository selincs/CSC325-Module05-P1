module saracoglu.module05selinsaracoglu {
    requires javafx.controls;
    requires javafx.fxml;


    opens saracoglu.module05selinsaracoglu to javafx.fxml;
    exports saracoglu.module05selinsaracoglu;
}