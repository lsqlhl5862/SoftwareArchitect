package Lab2.Interpreter;

import java.util.Scanner;

public class InterpreterClient {
    public static void main(String[] args) {
        System.out.println("请输入表达式（如：2*3/1%5）：");
        Scanner input=new Scanner(System.in);
        Calculator calculator=new Calculator(input.nextLine());
        System.out.println(calculator.getResult());
    }
}
