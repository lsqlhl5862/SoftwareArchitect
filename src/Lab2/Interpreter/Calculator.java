package Lab2.Interpreter;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Calculator {
    private Expression expression=null;
    private Queue<Integer> var=new LinkedBlockingQueue<>();

    //解析表达式
    public Calculator(String expString) {
        char[] charArray = expString.toCharArray();
        StringBuffer tempNum = new StringBuffer();
        for (char t : charArray) {
            if (t <= '9' && t >= '0') {
                tempNum.append(t);
            }
            else {
                var.add(Integer.valueOf(tempNum.toString()));
                tempNum.delete(0,tempNum.length());
                Expression left;
                Expression right;
                if(expression==null)
                {
                    left=new ValueExpression();
                    right=new ValueExpression();
                }
                else
                {
                    left = expression;
                    right=new ValueExpression();
                }
                switch (t)
                {
                    case '*':
                        expression=new MulExpression(left,right);
                        break;
                    case '/':
                        expression=new DivExpression(left,right);
                        break;
                    case '%':
                        expression=new ModExpression(left,right);
                        break;
                }
            }
        }
        var.add(Integer.valueOf(tempNum.toString()));
        tempNum.delete(0,tempNum.length());
    }
    public int getResult()
    {

        return expression.interpret(var);
    }
}
