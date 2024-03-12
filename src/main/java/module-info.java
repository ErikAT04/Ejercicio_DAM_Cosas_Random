module org.example.programaxd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.programaxd to javafx.fxml;
    exports org.example.programaxd;
}