import java.time.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate DZISIAJ = LocalDate.now();
        String today = DZISIAJ.getDayOfWeek().name();


        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();

        System.out.println("Czy jestes mieszkancem Warszawy? (tak/nie)");
        String miasto = scanner.next();

        System.out.println("Czy jest czwartek? (tak/nie)");
        String dzien = scanner.next();

        double cena1 = 40;
        double znizka = 0;



        if (wiek < 10 ){
            cena1 = 0;
            znizka = 100;


        }else if (wiek >= 10 && wiek <= 18 ) {
            cena1 = 20;
            znizka = 50;
        }
        else {
            cena1 = 40;
            znizka = 0;
        }

        if (miasto.equals("tak")){
        cena1 *= 0.9;
        znizka += 10;

        }

        if (dzien.equals("tak")){

            cena1 = 0;
        }





        System.out.println("Data: "+ wiek + " years old, weekday Ticket price: " + cena1+ " PLN.");
        System.out.println("Discount: "+znizka+ "%");






    }
}