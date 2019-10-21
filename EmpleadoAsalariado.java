public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salarioSemanal){
        super(nombre, apellido, nss);
        this.salarioSemanal=salarioSemanal;
    }
    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal=salarioSemanal;
    }
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    public double ingresos(){
        return salarioSemanal;
    }
    public String toString(){
        return super.toString() + "con salario samanal de: " + getSalarioSemanal();
    }
}
