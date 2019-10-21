public abstract class Empleado{
    private String nombre;
    private String apellido;
    private String nss;
    
    public Empleado(String nombre, String apellido, String nss){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nss=nss;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNss(){
        return nss;
    }
    public String toString(){
        return getNombre() + getApellido()+ "numero de seguridad: "+ getNss();
    }
    public abstract double ingresos();
}
