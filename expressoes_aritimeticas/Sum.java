import java.util.ArrayList;

public class Sum extends Expression 
{
    private ArrayList<Expression> expressions;

    public Sum() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expr) 
    {
        this.expressions.add(expr);
    }
    public double evaluate() 
    {
        double total = 0;
        
        for (Expression expr : expressions) 
        {
            total += expr.evaluate();
        }
        return total;
    }
}