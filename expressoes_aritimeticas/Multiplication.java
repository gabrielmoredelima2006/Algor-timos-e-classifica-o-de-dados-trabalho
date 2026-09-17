import java.util.ArrayList;

public class Multiplication extends Expression 
{
    private ArrayList<Expression> expressions;

    public Multiplication() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expr)
    {
        this.expressions.add(expr);
    }
    public double evaluate() 
    {
        if (expressions.isEmpty()) return 0;
        
        double total = 1; 
        for (Expression expr : expressions) {
            total *= expr.evaluate();
        }
        return total;
    }
}