package Lab2.Interpreter;

import java.util.Queue;

public abstract class SymbolExpression extends Expression {

    protected  Expression left;
    protected  Expression right;
    public abstract int interpret(Queue<Integer> var);
}
