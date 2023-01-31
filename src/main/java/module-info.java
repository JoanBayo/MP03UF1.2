module com.example.formulari {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.formulari to javafx.fxml;
    exports com.example.formulari;
}