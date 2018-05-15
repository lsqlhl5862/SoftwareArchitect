package Lab2.Flyweight;

import java.util.ArrayList;

public abstract class StringImage {
    protected ArrayList<CharImage> list=new ArrayList<>();
    public abstract void addNumber(CharImage number);
    public abstract void display();
}
