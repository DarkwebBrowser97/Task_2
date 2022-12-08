import java.util.Scanner;
public class school {
    public static void main ( String[]args){
        Scanner scanner = new Scanner(System.in);
        double himikal = 5.80;
        double marker = 7.20;
        double preparat = 1.20;
        int paketHimikal = Integer.parseInt(scanner.nextLine());
        int paketMarker = Integer.parseInt(scanner.nextLine());
        int litriPreparat = Integer.parseInt(scanner.nextLine());
        double finalHimikal = himikal * paketHimikal;
        double finalMarker = marker * paketMarker;
        double finalPreparat = preparat * litriPreparat;
        double procent = Double.parseDouble(scanner.nextLine());
        double suma = finalPreparat + finalHimikal + finalMarker;
        double finalSuma = suma * (procent / 100);
        System.out.println(finalSuma);

    }
}