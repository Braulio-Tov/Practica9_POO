public class EmpleadoPorComision extends Empleado{
    private double ventasTotales;
    private double tasaComision;
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventasTotales, double tasaComision){
        super(nombre, apellido, nss);
        this.ventasTotales=ventasTotales;
        this.tasaComision=tasaComision;
    }
    public void setVentasTotales(double ventasTotales){
        this.ventasTotales=ventasTotales;
    }
    public void setTasaComision(double tasaComision){
        this.tasaComision=tasaComision;
    }
    public double getVentasTotales(){
        return ventasTotales;
    }
    public double getTasaComisioin(){
        return tasaComision;
    }
    public double ingresos(){
        return tasaComision*ventasTotales;   
    }
    public String toString(){
        return super.toString() + "con ventas de: " + getVentasTotales() + " y tasa de: " + getTasaComisioin();
    }
}