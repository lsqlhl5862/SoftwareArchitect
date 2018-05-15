package Lab2.Interpreter;

import java.util.Queue;

public class ValueExpression extends Expression {
    @Override
    public int interpret(Queue<Integer> var) {
        return var.poll();
    }
}
