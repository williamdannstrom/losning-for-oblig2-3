package oblig2;

abstract class Legemiddel {
    public final String navn;
    int pris;
    public final double virkestoff;
    public final int ID;
    static int counter = 0;
    public Legemiddel(String navn, int pris, double virkestoff){
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
        this.ID = counter;
        counter++;

    }
    public int hentPris(){
        return this.pris;
    }
    public void settNyPris(int pris){
        this.pris = pris;
    }
}
class Narkotisk extends Legemiddel{
    public final int styrke;
    public Narkotisk(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }
}
class Vanedannende extends Legemiddel{
    public final int styrke;
    public Vanedannende(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }
}
class Vanlig extends Legemiddel{
    public Vanlig(String navn, int pris, double virkestoff) {
        super(navn, pris, virkestoff);
    }
}
