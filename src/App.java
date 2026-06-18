import singleton.GestorBaseDatos;
import factory.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando Singleton");
        GestorBaseDatos primero = GestorBaseDatos.obtenerConexion();
        GestorBaseDatos segundo = GestorBaseDatos.obtenerConexion();
        System.out.println(primero == segundo);
        primero.conectar();
        segundo.consultar();

        System.out.println("\n Probando Factory Method");

        CreaProductos creando;
        creando= new CreaProductoFisico();
        Producto pr1= creando.crearProducto();
        pr1.mostrarInformacion();

        creando= new CreaProductoDigital();
        Producto pr2= creando.crearProducto();
        pr2.mostrarInformacion();

        }
}
