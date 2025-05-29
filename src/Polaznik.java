public class Polaznik implements Comparable<Polaznik> {

    private String ime;
    private String prezime;
    private String email;

    @Override
    public int compareTo(Polaznik o) {
        return o.email.compareTo(this.email);
    }

    @Override
    public String toString() {
        return email;
    }

    public Polaznik(String ime, String prezime, String email) {
        this.email = email;
        this.prezime = prezime;
        this.ime = ime;
    }

    public void ispisDetaljaPolaznika() {
        System.out.println("ime: " + ime + ", prezime: " + prezime + ", email:" + email);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
