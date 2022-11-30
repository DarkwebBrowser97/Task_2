import java.util.Scanner;
class Intocen
{
    public static void main(String[] args)
    {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter Number of Inches:");
        float c=i.nextFloat() * 2.54f;
        System.out.print("Centimeters :" + c);
        System.exit(0);
    }
}
