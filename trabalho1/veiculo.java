public class veiculo
{
    private int passengers;
    private int fuelCap;
    private int mpg;
    public veiculo(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }
    public int getPassengers() 
    {
        return passengers;
    }

    public void setPassengers(int passengers) 
    {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) 
    {
        this.mpg = mpg;
    }
    public String toString() {
        return "Passageiros: " + passengers + 
               " | Cap. Combustível: " + fuelCap + " galões" +
               " | Consumo: " + mpg + " mpg";
    }
}