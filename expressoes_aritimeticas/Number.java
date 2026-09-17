public class Number extends Expression 
{
    private double value;

    public Number(double value) 
    {
        this.value = value;
    }
    public double evaluate() 
    {
        return this.value;
    }
}
