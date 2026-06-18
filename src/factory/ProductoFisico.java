package factory;

public class ProductoFisico extends Producto{

    private double precio;
    private String dimensiones;

    public ProductoFisico(int codigo, String nombre, double precio, double peso,String dimensiones){
        super (codigo, nombre, precio);
        this.peso=peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println(
            "Producto Físico: "
            + nombre + " Peso: "
            + peso + " Dimensiones: "
            + dimensiones);
    }
}