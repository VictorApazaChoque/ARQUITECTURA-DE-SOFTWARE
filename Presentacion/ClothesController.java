package Presentacion;
import Negocio.ServicioRopa;
import AccesoDatos.RepositorioRopa;
import AccesoDatos.RepositorioRopaEnMemoria;
import AccesoDatos.FabricaRopa;
import AccesoDatos.Ropa;

// Controlador que gestiona la capa de presentación
class ClothesController {
    private ServicioRopa servicio;

    public ClothesController() {
        RepositorioRopa repositorio = new RepositorioRopaEnMemoria();
        this.servicio = new ServicioRopa(repositorio);
        // Añadiendo ropa de ejemplo
        servicio.agregarRopa(FabricaRopa.crearRopa("1", "Camiseta", 150.00));
        servicio.agregarRopa(FabricaRopa.crearRopa("2", "Pantalon", 220.00));
    }

    public void mostrarRopa() {
        for (Ropa ropa : servicio.obtenerTodaLaRopa()) {
            System.out.println("ID: " + ropa.getId() + ", Nombre: " + ropa.getNombre() + ", Precio: " + ropa.getPrecio());
        }
    }
}
