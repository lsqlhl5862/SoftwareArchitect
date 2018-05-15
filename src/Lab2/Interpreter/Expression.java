package Lab2.Interpreter;


import java.util.Queue;
import java.util.Stack;

public abstract class Expression {
    public abstract  int interpret(Queue<Integer> var);
}
