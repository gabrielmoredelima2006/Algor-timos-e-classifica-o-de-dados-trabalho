public class Truck extends veiculo 
{
    private int cargoCap;
    public Truck(int passengers, int fuelCap, int mpg, int cargoCap) 
    {
        super(passengers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int cargoCap) 
    {
        this.cargoCap = cargoCap;
    }
    public String toString() 
    {
        return "[Caminhão] " + super.toString() + " | Carga: " + cargoCap + " kg";
    }
}