package oblig2;

abstract class Resept {
    public final int ID;
    public final Legemiddel legemiddel;
    public final Lege underskrivendeLege;
    public final int pasientId;
    public int reit;
    static int counter = 0;
    public Resept(Legemiddel legemiddel, Lege underskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.underskrivendeLege = underskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        this.ID = counter;
        counter++;
    }
    public int hentId(){
        return this.ID;
    }
    public Legemiddel hentLegemiddel(){
        return this.legemiddel;
    }
    public Lege hentLege(){
        return this.underskrivendeLege;
    }
    public int hentPasientId(){
        return this.pasientId;
    }
    public int hentReit(){
        return this.reit;
    }
    public boolean bruk(){
        if(this.reit!=0){
            this.reit = this.reit -1;
            return true;
        }
        return false;
    }
    abstract public String farge();
    abstract public int prisAaBetale();
    public String toString(){
        return ("ReseptID: " + this.hentId() + "\nLegemiddel: " + this.hentLegemiddel().navn + "\n"+ this.hentLege().toString() + "\nPasientId: " + this.hentPasientId() + "\nReit: " + this.hentReit() + "\nResepttype: " + this.farge() + "\nPris: " + this.prisAaBetale() +"\n\n");
    }
}
class HviteResepter extends Resept{
    public HviteResepter(Legemiddel legemiddel, Lege underskrivendeLege, int pasientId, int reit){
        super(legemiddel, underskrivendeLege, pasientId, reit);
    }
    @Override
    public String farge(){
        return "Hvit";
    }
    @Override
    public int prisAaBetale(){
        return(legemiddel.hentPris());
    }
}
class blaaResepter extends Resept{
    public blaaResepter(Legemiddel legemiddel, Lege underskrivendeLege, int pasientId, int reit){
        super(legemiddel, underskrivendeLege, pasientId, reit);
        legemiddel.settNyPris((int)Math.round(legemiddel.pris*0.25));
    }
    @Override
    public String farge(){
        return "Blaa";
    }
    @Override
    public int prisAaBetale(){
        return(legemiddel.hentPris());
    }
}
class MilResept extends HviteResepter{
    public MilResept(Legemiddel legemiddel, Lege underskrivendeLege, int pasientId, int reit){
        super(legemiddel, underskrivendeLege, pasientId, 3);
        legemiddel.settNyPris(0);
    }
    @Override
    public int prisAaBetale(){
        return(legemiddel.hentPris());
    }
}
class PResept extends HviteResepter{
    public PResept(Legemiddel legemiddel, Lege underskrivendeLege, int pasientId, int reit){
        super(legemiddel, underskrivendeLege, pasientId, reit);
        if (legemiddel.hentPris() > 108){
            legemiddel.settNyPris(legemiddel.hentPris()-108);
        }else{
            legemiddel.settNyPris(0);
        }
    }
    @Override
    public int prisAaBetale(){
        return(legemiddel.hentPris());
    }
}
