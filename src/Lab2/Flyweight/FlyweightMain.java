package Lab2.Flyweight;

import java.util.Scanner;

public class FlyweightMain {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        StringImage stringImage1=flyweightFactory.manufactureStringImage("123");
        stringImage1.display();
        StringImage stringImage2=flyweightFactory.manufactureStringImage("123");
        stringImage2.display();
        //判断是否是同一资源
        System.out.println(stringImage1.equals(stringImage2));
        System.out.println("请输入数字字符串：");
        Scanner input=new Scanner(System.in);
        StringImage stringImage3=flyweightFactory.manufactureStringImage(input.nextLine());
        stringImage3.display();
    }
}
