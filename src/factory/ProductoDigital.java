package factory;

public class ProductoDigital extends Producto{

    private double porteArchivo;
    private String formato;

    public ProductoDigital(int codigo, String nombre, double precio, double porteArchivo ,String formato){
        super (codigo, nombre, precio);
        this.porteArchivo= porteArchivo;
        this.formato= formato;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println(
            "Producto Digital: "
            + nombre + " Tamaño: "
            + porteArchivo + " MB Formato: "
            + formato);
    }
}