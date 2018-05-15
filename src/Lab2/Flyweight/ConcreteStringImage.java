package Lab2.Flyweight;

public class ConcreteStringImage extends StringImage {
    @Override
    public void addNumber(CharImage number) {
            list.add(number);
    }

    @Override
    public void display() {
            for(CharImage number:list)
            {
                number.display();
            }
    }
}
