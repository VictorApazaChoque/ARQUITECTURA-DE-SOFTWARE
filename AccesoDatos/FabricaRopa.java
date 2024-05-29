package AccesoDatos;


// Patrón Factory Method para crear instancias de ropa
public class FabricaRopa {
    public static Ropa crearRopa(String id, String nombre, double precio) {
        return new Ropa(id, nombre, precio);
    }
}
