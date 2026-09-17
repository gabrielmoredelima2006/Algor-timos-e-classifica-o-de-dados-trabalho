import java.util.ArrayList;

public class Division extends Expression 
{
    private ArrayList<Expression> expressions;

    public Division(Expression dividendo, Expression divisor) 
    {
        this.expressions = new ArrayList<>();
        this.expressions.add(dividendo);
        this.expressions.add(divisor);
    }
    public double evaluate() 
    {
        
        return expressions.get(0).evaluate() / expressions.get(1).evaluate();
    }
}