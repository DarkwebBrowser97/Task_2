import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        //Getting the number of dogs and the rest animals.
        Scanner scanner = new Scanner(System.in);
        String dogs = scanner.nextLine();
        String animals = scanner.nextLine();

        //Converting the input data to double values and performing the calculations.
        double d_gs = Double.parseDouble(dogs) * 2.50;
        double a_ns = Double.parseDouble(animals) * 4;

        //Displaying the result
        System.out.printf("%.2f", (d_gs + a_ns));
        System.out.print(" lv.");

    }
}