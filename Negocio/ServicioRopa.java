package Negocio;
import AccesoDatos.RepositorioRopa;
import AccesoDatos.Ropa;
import java.util.*;
// Servicio de ropa que contiene la lógica de negocio
public class ServicioRopa {
    private RepositorioRopa repositorio;

    public ServicioRopa(RepositorioRopa repositorio) {
        this.repositorio = repositorio;
    }

    public void agregarRopa(Ropa ropa) {
        repositorio.guardar(ropa);
    }

    public List<Ropa> obtenerTodaLaRopa() {
        return repositorio.encontrarTodas();
    }
}
