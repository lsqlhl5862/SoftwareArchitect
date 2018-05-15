package Lab2.Interpreter;

import java.util.Queue;

public class MulExpression extends  SymbolExpression {
    public MulExpression(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }
    @Override
    public int interpret(Queue<Integer> var) {
        return left.interpret(var)*right.interpret(var);
    }
}
