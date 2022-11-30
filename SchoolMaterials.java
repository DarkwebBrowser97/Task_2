import java.util.Scanner;
public class SchoolMaterials {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int broistranici=Integer.parseInt(scanner.nextLine());
        int stranici=Integer.parseInt(scanner.nextLine());
        int BroiNaDnite=Integer.parseInt(scanner.nextLine());
        int chasove = broistranici / stranici / BroiNaDnite ;
        System.out.println(chasove);



    }
}