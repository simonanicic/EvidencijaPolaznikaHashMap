import java.util.*;

public class EvidencijaPolaznika {

    private static final Map<String, Polaznik> polazniciMap = new HashMap<>();
    private static final List<Polaznik> polazniciList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("4")) {
            System.out.println("1. Unos polaznika\n2. Izmiješaj polaznike\n3. Ispis polaznika\n4. Izlaz");
            input = sc.nextLine();
            switch (input) {
                case "1": {
                    unosPolaznika(sc);
                    break;
                }
                case "2": {
                    izmijesajPolaznike();
                    break;
                }
                case "3": {
                    ispisPolaznika();
                    break;
                }
                case "4": {
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

        if(polazniciMap.containsKey(email)) {
            System.out.println("Korisnik s tim emailom već postoji!");
        } else {
            polazniciMap.put(email, polaznik);
        }
    }

    private static void ispisPolaznika() {
        polazniciList.forEach(Polaznik::ispisDetaljaPolaznika);
    }

    private static void izmijesajPolaznike() {
        polazniciMap.forEach((email, polaznik) -> polazniciList.add(polaznik));
        Collections.shuffle(polazniciList);
    }
}