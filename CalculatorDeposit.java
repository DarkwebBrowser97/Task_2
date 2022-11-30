import java.util.Scanner;
public class CalculatorDeposit {
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        double years = Double.parseDouble(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double sum = deposit + years * ((deposit * (interest / 100) ) / 12);
        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        System.out.println(sum);




    }
}