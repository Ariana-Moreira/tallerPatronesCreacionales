package factory;

public class CreaProductoDigital extends CreaProductos{

    @Override
    public Producto crearProducto(){
        return new ProductoDigital(2, "Curso Bitcoin", 50, 1500, "MP4");
    }
}