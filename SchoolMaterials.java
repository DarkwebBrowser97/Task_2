import java.util.Scanner;
public class SchoolMaterials {
    public static void main ( String[]args){
        Scanner scanner = new Scanner(System.in);

        // Брой пакети с химикалки
        double BroiPaketiHimikali = Double.parseDouble(scanner.nextLine());
        //Брой пакети с маркери
        double BroiPaketiMarkeri = Double.parseDouble(scanner.nextLine());
        //Литри препарат за  почистване на Дъската
        double LitriPreparatZaDuska = Double.parseDouble(scanner.nextLine());
        //Процент Намаление
        double ProcentNamalenie = Double.parseDouble(scanner.nextLine());
        double suma = BroiPaketiHimikali * BroiPaketiMarkeri * LitriPreparatZaDuska -(ProcentNamalenie / 100) / 25;
        System.out.println(suma);

    }


}