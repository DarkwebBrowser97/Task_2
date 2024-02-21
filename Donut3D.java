import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Donut3D extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int R1 = 100;
    private static final int R2 = 200;
    private static final double A_STEP = 0.07;
    private static final double B_STEP = 0.03;

    private BufferedImage buffer;

    public Donut3D() {
        buffer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
        render();
    }

    private void render() {
        for (double a = 0; a < 2 * Math.PI; a += A_STEP) {
            for (double b = 0; b < 2 * Math.PI; b += B_STEP) {
                double x = Math.cos(a) * (R1 + R2 * Math.cos(b));
                double y = Math.sin(a) * (R1 + R2 * Math.cos(b));
                double z = R2 * Math.sin(b);

                int screenX = (int) (x * 50) + WIDTH / 2;
                int screenY = (int) (y * 50) + HEIGHT / 2;

                if (screenX >= 0 && screenX < WIDTH && screenY >= 0 && screenY < HEIGHT) {
                    int brightness = (int) ((1 + z / 400) * 128);
                    int color = new Color(brightness, brightness, brightness).getRGB();
                    buffer.setRGB(screenX, screenY, color);
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(buffer, 0, 0, this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("3D Donut");
        Donut3D donut3D = new Donut3D();

        frame.add(donut3D);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
