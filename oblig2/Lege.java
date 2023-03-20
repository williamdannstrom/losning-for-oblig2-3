package oblig2;

public class Lege {
    public final String navn;
    public Lege(String navn){
        this.navn = navn;
    }
    public String hentNavn() {
        return this.navn;
    }
    public String toString(){
        return ("Navn paa lege: " + this.hentNavn());
    }
}
class Spesialist extends Lege implements Godkjenningsfritak{
    public final String kontrollkode;
    public Spesialist(String navn, String kontrollkode){
        super(navn);
        this.kontrollkode = kontrollkode;
    }
    public String hentKontrollkode(){
        return this.kontrollkode;
    }
    @Override
    public String toString(){
        return ("Navn paa lege: " + this.hentNavn() + "\nKontrollkode: " + this.hentKontrollkode());   
    }
}