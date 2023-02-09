module proyectounibanco.unibanco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens proyectounibanco.unibanco to javafx.fxml;
    exports proyectounibanco.unibanco;
}