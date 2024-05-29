package AccesoDatos;

import java.util.*;
// Interfaz para el repositorio de ropa
public interface RepositorioRopa {
    void guardar(Ropa ropa);
    List<Ropa> encontrarTodas();
}