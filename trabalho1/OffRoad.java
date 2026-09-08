public class OffRoad extends veiculo 
{
    private int groundClearance;
    public OffRoad(int passengers, int fuelCap, int mpg, int groundClearance) 
    {

        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() 
    {
        return groundClearance;
    }
    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }
    public String toString() 
    {
        return "[Off-Road] " + super.toString() + " | Distância do solo: " + groundClearance + " cm";
    }
}