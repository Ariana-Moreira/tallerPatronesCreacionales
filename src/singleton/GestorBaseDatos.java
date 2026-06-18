package singleton;

publis class GestorBaseDatos{
    private static GestorBaseDatos conxionUnica;
    
    private GestorBaseDatos(){

    }
    public static GestorBaseDatos obtenerConexion(){
        if (conxionUnica == null){
            conxionUnica = new GestorBaseDatos();
        }
        return conxionUnica
    }
    public void conectar(){
        System.out.println("Conexión establecida")
    }

    public void consultar(){
        System.out.println("Consulta realizada")
    }
}
