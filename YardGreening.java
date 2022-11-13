import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeter = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double cost = squareMeter * price;
        double discount = cost * 18/100;
        System.out.printf("The final price is: %.2f lv.", (cost - discount));
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}