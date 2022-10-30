public class Vehiculo {
    static int tamano = 10;
    static Vehiculo vehiculos[] = new Vehiculo[tamano];
    static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){

    }

    //Constructor de 3 parametros
    public Vehiculo(int modelo, String marca, double valorComercial){
        this(modelo, marca, valorComercial, "verde");
    }

    //Constructor de 4 parametros
    public Vehiculo(int modelo, String marca, double valorComercial, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = color;
    }

    //Metodos settter y getter
    public int getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public double getValorComercial(){
        return valorComercial;
    }

    public String getColor(){
        return color;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setValorComercial(double valorComercial){
        this.valorComercial = valorComercial;
    }

    public void setColor(String color){
        this.color = color;
    }

    //Obtener info del vehiculo
    public String toString(){
        String informacion = "Modelo:" + this.modelo + " Marca:" + marca + " Valor comercial:" + valorComercial + " Color:" + color;
        return informacion;
    }

    //Mostrar informacion del array
    public static String toStringVehiculos(){
        String vehConcatenado = "";
        for(int i = 0; i < posAnadir; i++){
            vehConcatenado += vehiculos[i].toString();
        }
        return vehConcatenado;
    }

    //Numero de vehiculos
    public static int cantidadVehiculos(){
        return posAnadir;
    }

    //Anadir vehiculo a la lista 
    public void anadirVehiculo(Vehiculo vehiculo){
        vehiculos[posAnadir] = vehiculo;
        posAnadir ++;
    }
    
    //Metodo por color
    public static String toStringVehiculos(String color){
        String vehConcatenado = "";
        for(int i = 0; i < posAnadir; i++){
            if(vehiculos[i].getColor().equals(color)){
                vehConcatenado += vehiculos[i].toString();
            }
        }
        return vehConcatenado;
    }

    //Metodo por modelo
    public static String toStringVehiculosModelo(int year1, int year2){
        String vehConcatenado = "";
        for(int i = 0; i < posAnadir; i++){
            if((vehiculos[i].getModelo() >= year1) && (vehiculos[i].getModelo() <= year2)){
                vehConcatenado += vehiculos[i].toString();
            }
        }
        return vehConcatenado;
    }
}
