public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldo, double horas){
        super(nombre, apellido, nss);
        this.horas=horas;
        this.sueldo=sueldo;  
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public void setHoras(double horas){
        this.horas=horas;
    }
    public double getSueldo(){
        return sueldo;
    }
    public double getHoras(){
        return horas;
    }
    public double ingresos(){
        if (getHoras() <=40){
            return sueldo*horas;
        }
        else{
            return 40*sueldo+(horas-40)*sueldo*1.5;
        }
    }
    public String toString(){
        return super.toString() + "con sueldo de: " + getSueldo() + "y horas trabajadas: " + getHoras();
    }
}