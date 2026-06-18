package factory;

public abstract class Producto{
    protected int codigo;
    protected String nombre;
    protected double precio;

    public Producto(int codigo, String nombre, double precio){
        this.codigo= codigo;
        this.nombre= nombre;
        this.precio= precio;
    }

    public abstract void mostrarInformacion();
}
