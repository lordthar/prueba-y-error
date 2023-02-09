module proyectounibanco.unibanco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens proyectounibanco.Model to javafx.fxml;
    exports proyectounibanco.Model;
}