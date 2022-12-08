import java.util.*;
import java.awt.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        World habitat = new World(300,300);
        Turtle yertle = new Turtle(habitat);
        yertle.setDelay(0.5);

        habitat.show(true);

        yertle.forward();
        yertle.turnLeft(90);
        yertle.forward();
        yertle.turnLeft(90);
        yertle.forward();
        yertle.turnLeft(90);
        yertle.forward();
        yertle.turnLeft(90);
    }
}