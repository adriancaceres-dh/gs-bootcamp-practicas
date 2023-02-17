package com.example.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Rectangulo extends Application {
    private double mouseX, mouseY; // Variables para almacenar la posición del mouse

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Crear un objeto Rectangle
        Rectangle rectangulo = new Rectangle(100, 100, 200, 150); // coordenadas x, y, ancho y alto
        rectangulo.setFill(Color.BLUE); // Establecer el color de relleno
        rectangulo.setStroke(Color.BLACK); // Establecer el color del borde
        rectangulo.setStrokeWidth(2); // Establecer el ancho del borde

        // Agregar el rectángulo a un panel
        Pane panel = new Pane();
        panel.getChildren().add(rectangulo);

        // Agregar eventos de mouse para girar el rectángulo
        panel.setOnMousePressed(event -> {
            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
        });

        panel.setOnMouseDragged(event -> {
            double deltaX = event.getSceneX() - mouseX;
            double deltaY = event.getSceneY() - mouseY;
            Rotate rotate = new Rotate(deltaX + deltaY, rectangulo.getX() + rectangulo.getWidth() / 2, rectangulo.getY() + rectangulo.getHeight() / 2);
            rectangulo.getTransforms().add(rotate);
            mouseX = event.getSceneX();
            mouseY = event.getSceneY();
        });

        // Crear una escena y agregarla a la ventana
        Scene escena = new Scene(panel, 400, 400);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Ejemplo de Rectángulo Giratorio en JavaFX");
        primaryStage.show();
    }
}
