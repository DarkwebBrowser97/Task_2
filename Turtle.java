import javax.swing.*;
import java.awt.*;

public class Turtle extends JPanel {
    private int x;
    private int y;
    private int angle;

    public Turtle() {
        x = 200;
        y = 200;
        angle = 0;
    }

    public void moveForward(int distance) {
        int newX = x + (int) (distance * Math.cos(Math.toRadians(angle)));
        int newY = y + (int) (distance * Math.sin(Math.toRadians(angle)));

        Graphics g = getGraphics();
        g.drawLine(x, y, newX, newY);

        x = newX;
        y = newY;
    }

    public void turnRight(int degrees) {
        angle = (angle + degrees) % 360;
    }

    public void turnLeft(int degrees) {
        angle = (angle - degrees + 360) % 360;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Turtle Graphics");
        Turtle turtle = new Turtle();

        frame.add(turtle);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        turtle.moveForward(100);
        turtle.turnRight(90);
        turtle.moveForward(100);
        turtle.turnRight(90);
        turtle.moveForward(100);
        turtle.turnRight(90);
        turtle.moveForward(100);
    }
}
