package src.clases;

public class Cliente {
    private String nombre;
    private String identificacion;

    public Cliente (String nombre, String identificacion){
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerIdentificacion(){
        return identificacion;
    }
}
