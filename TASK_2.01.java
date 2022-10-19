import java.io.Console;
import java.util.Scanner;

class TASK {
    public static void main(String[] args){
        System.out.println("Enter a value for N :");
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("a_n = 3 + 2 * (n + 1)");
        System.out.println("n = " + n);
        int sum = 0;
        int  sumDividedByFive = 0;
        for (int i = 0; i <= n; i++)
        {
            int a = 3 + 2*(i+1);
            System.out.println("a_" + i + "=" + a);
            sum += a;
            if(a % 5 == 0) {
                sumDividedByFive += a;
            }
        }

        System.out.println("Sum is : " + sum);
        System.out.println("Sum of number which are divided by five is : " + sumDividedByFive);
    }

}
