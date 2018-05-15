package Lab2.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    HashMap<String, StringImage> numberImageHashMap = new HashMap<>();
    HashMap<String, CharImage> numberHashMap = new HashMap<>();

    public StringImage manufactureStringImage(String input)
    {
        if(numberImageHashMap.containsKey(input))
        {
            System.out.println("已有资源");
            return numberImageHashMap.get(input);
        }
        else
        {
            System.out.println("创建资源");
            StringImage stringImage =new ConcreteStringImage();
            for(int i=0;i<input.length();i++)
            {
                stringImage.addNumber(manufactureCharImage(input.charAt(i)));
            }
            numberImageHashMap.put(input, stringImage);
            return stringImage;
        }
    }

    private CharImage manufactureCharImage(char input)
    {
        if(numberHashMap.containsKey(String.valueOf(input)))
        {
            return numberHashMap.get(String.valueOf(input));
        }
        else
        {
            CharImage charImage =new ConcreteCharImage(input);
            numberHashMap.put(String.valueOf(input),charImage);
            return charImage;
        }
    }
}
