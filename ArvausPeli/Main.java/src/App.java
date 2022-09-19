import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**Säännöt**");
        System.out.println("Arvaa numero 1-50");
        System.out.println("Oikea arvaus + 20 krediittiä");
        System.out.println("Väärä arvaus -5 krediittiä");
        System.out.println("Peli päättyy, kun krediitit on loppu");
        System.out.println("-1 Lopeta peli kesken");
        System.out.println("");
        Arvauskone uusiKone = new Arvauskone();
        int numero = uusiKone.random();

        Scanner lukija = new Scanner(System.in);
        System.out.println("Paljonko Krediittejä ladataan?");
        Krediitti uusiPeli = new Krediitti(Integer.valueOf(lukija.nextLine()));
        System.out.println("");
        
        while (true) {
            int oikeat = 0;
            System.out.println("Arvaa numero 1-50 ");
            System.out.println("Arvaus: ");
            int arvaus = Integer.valueOf(lukija.nextLine());
            if (arvaus == -1) {
                break;
            }
            
            if (arvaus < numero && arvaus > 0) {
                uusiPeli.vahenna();
                System.out.println(uusiPeli.saldo());
                System.out.println("arvaus liian pieni yritä uudelleen");
            }
            if (arvaus > numero && arvaus < 51) {
                uusiPeli.vahenna();
                uusiPeli.saldo();
                System.out.println("arvaus liian suuri yritä uudelleen");
            }
            if (arvaus == numero) {
                oikeat += 1;
                uusiPeli.lisaa();
                numero = uusiKone.newRandom();
                uusiKone.setRandom();
                System.out.println("Onneksi olkoon! arvasit oikein!!!");
                System.out.println("Oikeita arvauksia: " + oikeat);
            }
            if (arvaus < 1 || arvaus > 50) {
                System.out.println("Luvut ainoastaan 1-50");
            }
            if (uusiPeli.getAloitus() <= 0) {
                System.out.println("Saldo 0");
                System.out.println("Peli päättyi!");
                System.out.println("Oikeata arvauksia: " + oikeat);
                break;
            }
            
        }
        System.out.println(uusiPeli.saldo() + " Kiitos");
    }
}
