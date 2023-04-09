import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SpamBot {

    public static void main (String[]args) throws AWTException, InterruptedException {
        int  x = 1;
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Text:");
        String Text = scanner.nextLine();

        StringSelection  stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        System.out.println("The spamming  will begin in 5 seconds");
        Thread.sleep(5000);

        while(x <= 10){

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

            x++;
        }
    }
}