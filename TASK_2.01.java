import java.io.Console;
import java.util.Scanner;

class TASK {
    public static void main(String[] args){
        System.out.println("a_n = 3 + 2 * (n + 1)");
        System.out.println("n = ");
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n; i++)
        {
            System.out.println("a_" + i);
            int a = 3 + 2*(i+1);
            System.out.println("a_" + i + "=" + a);
        }
    }
}
