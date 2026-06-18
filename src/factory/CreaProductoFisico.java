package factory;

public class CreaProductoFisico extends CreaProductos{

    @Override
    public Producto crearProducto(){
        return new ProductoFisico(1, "Laptop", 1200, 2.5, "35x25x2 cm");
    }
}