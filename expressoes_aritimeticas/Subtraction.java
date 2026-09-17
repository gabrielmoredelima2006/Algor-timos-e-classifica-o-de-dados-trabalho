import java.util.ArrayList;

public class Subtraction extends Expression {
    private ArrayList<Expression> expressions;

    public Subtraction(Expression minuendo, Expression subtraendo)
    {
        this.expressions = new ArrayList<>();
        this.expressions.add(minuendo);
        this.expressions.add(subtraendo);
    }
    public double evaluate() 
    {
        return expressions.get(0).evaluate() - expressions.get(1).evaluate();
    }
}