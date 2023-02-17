package com.example.demo;


    import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

    public class LorenzAttractor extends Application {

        @Override
        public void start(Stage primaryStage) {
            int numPoints = 10000; // número de puntos a calcular
            double dt = 0.01; // tamaño del paso de tiempo
            double sigma = 10.0;
            double rho = 28.0;
            double beta = 8.0 / 3.0;

            double x = 0.1;
            double y = 0.0;
            double z = 0.0;

            Group root = new Group();
            double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE, minZ = Double.MAX_VALUE;
            double maxX = Double.MIN_VALUE, maxY = Double.MIN_VALUE, maxZ = Double.MIN_VALUE;
            for (int i = 0; i < numPoints; i++) {
                double dx = sigma * (y - x);
                double dy = x * (rho - z) - y;
                double dz = x * y - beta * z;
                x += dt * dx;
                y += dt * dy;
                z += dt * dz;

                if (x < minX) minX = x;
                if (y < minY) minY = y;
                if (z < minZ) minZ = z;
                if (x > maxX) maxX = x;
                if (y > maxY) maxY = y;
                if (z > maxZ) maxZ = z;

                double scale = 10.0;
                double xPos = scale * (x - minX) / (maxX - minX);
                double yPos = scale * (y - minY) / (maxY - minY);
                double zPos = scale * (z - minZ) / (maxZ - minZ);

                Line line = new Line(xPos, yPos, xPos, yPos);
                line.setStroke(Color.BLUE);
                root.getChildren().add(line);
            }

            Scene scene = new Scene(root, 600, 600, Color.WHITE);
            primaryStage.setTitle("Lorenz Attractor");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }


