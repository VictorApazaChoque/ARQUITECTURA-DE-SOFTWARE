package Presentacion;
import java.util.ArrayList;
import java.util.List;
// Clase de la capa de presentación que inicia la aplicación
public class Main {
public static void main(String[] args) {
ClothesController controlador = new ClothesController();
controlador.mostrarRopa();
}
}