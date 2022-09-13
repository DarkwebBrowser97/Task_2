import java.util.Scanner;

class Task_2 {
    static void printAP(int a,int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i - 1) * n + " ");
        }
    }

    public static void main(String[] args) {
        int a,n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a,and n : ");
        a = sc.nextInt();
        n = sc.nextInt();

        printAP(a,n);
    }
}