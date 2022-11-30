import java.util.Scanner;
public class convertorFromRadiansToDegrees {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double dergees = radians * 180 / Math.PI;
        System.out.println(dergees);
    }
}