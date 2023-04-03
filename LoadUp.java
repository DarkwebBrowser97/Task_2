import java.util.Scanner;
public class LoadUp {
    public static void main ( String[]args){
        Scanner scanner = new Scanner(System.in);
        double v = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(v * b);
    }
}