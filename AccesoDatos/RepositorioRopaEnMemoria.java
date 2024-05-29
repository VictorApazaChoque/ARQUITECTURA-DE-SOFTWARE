package AccesoDatos;

import java.util.*;
// Implementación en memoria del repositorio de ropa
public class RepositorioRopaEnMemoria implements RepositorioRopa {
    private List<Ropa> listaRopa = new ArrayList<>();

    @Override
    public void guardar(Ropa ropa) {
        listaRopa.add(ropa);
    }

    @Override
    public List<Ropa> encontrarTodas() {
        return new ArrayList<>(listaRopa);
    }
}
