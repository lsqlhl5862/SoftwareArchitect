package Lab2.Interpreter;

import java.util.Queue;
import java.util.Stack;

public class ModExpression extends  SymbolExpression {
    public ModExpression(Expression left, Expression right)
    {
        this.left=left;
        this.right=right;
    }
    @Override
    public int interpret(Queue<Integer> var) {
        return left.interpret(var)%right.interpret(var);
    }
}
