module com.example.jfxccrefactor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxccrefactor to javafx.fxml;
    exports com.example.jfxccrefactor;
}