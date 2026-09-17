public class Main {
    public static void main(String[] args) {
        System.out.println("=== Teste de Expressões Aritméticas ===\n");
        Sum exp1 = new Sum();
        exp1.addExpression(new Number(10));
        exp1.addExpression(new Number(20));
        exp1.addExpression(new Number(30));
        System.out.println("10 + 20 + 30 = " + exp1.evaluate());
        Sum soma2 = new Sum();
        soma2.addExpression(new Number(10));
        soma2.addExpression(new Number(20));
        Multiplication exp2 = new Multiplication();
        exp2.addExpression(soma2); 
        exp2.addExpression(new Number(5));
        System.out.println("(10 + 20) * 5 = " + exp2.evaluate());
        Subtraction sub3 = new Subtraction(new Number(100), new Number(20));
        Sum soma3 = new Sum();
        soma3.addExpression(new Number(5));
        soma3.addExpression(new Number(3));
        Division exp3 = new Division(sub3, soma3);
        System.out.println("(100 - 20) / (5 + 3) = " + exp3.evaluate());
        Sum soma4Esq = new Sum();
        soma4Esq.addExpression(new Number(10));
        soma4Esq.addExpression(new Number(20));
        Multiplication mult4Esq = new Multiplication();
        mult4Esq.addExpression(soma4Esq);
        mult4Esq.addExpression(new Number(5));
        Division div4Dir = new Division(new Number(100), new Number(4));
        Sum soma4Dir = new Sum();
        soma4Dir.addExpression(div4Dir);
        soma4Dir.addExpression(new Number(7));
        Subtraction exp4 = new Subtraction(mult4Esq, soma4Dir);
        System.out.println("((10 + 20) * 5) - ((100 / 4) + 7) = " + exp4.evaluate());
    }
}