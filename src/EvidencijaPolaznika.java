import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvidencijaPolaznika {

    private static final Map<String, Polaznik> polaznici = new HashMap<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("3")) {
            System.out.println("1. Unos polaznika\n2. Ispis polaznika\n3. Izlaz");
            input = sc.nextLine();
            switch (input) {
                case "1": {
                    unosPolaznika(sc);
                    break;
                }
                case "2": {
                    ispisPolaznika();
                    break;
                }
                case "3": {
                    break;
                }
                default: {
                    System.out.println("Pogrešan unos!");
                }
            }

        }


        sc.close();
    }

    private static void unosPolaznika(Scanner sc) {
        System.out.println("Unesite ime:");
        String ime = sc.nextLine();
        System.out.println("Unesite prezime:");
        String prezime = sc.nextLine();
        System.out.println("Unesite email:");
        String email = sc.nextLine();

        Polaznik polaznik = new Polaznik(ime, prezime, email);

        if(polaznici.containsKey(email)) {
            System.out.println("Korisnik s tim emailom već postoji!");
        } else {
            polaznici.put(email, polaznik);
        }
    }

    private static void ispisPolaznika() {
        polaznici.forEach((email, polaznik) -> polaznik.ispisDetaljaPolaznika());
    }
}
