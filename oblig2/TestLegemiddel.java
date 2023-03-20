package oblig2;

public class TestLegemiddel{
    public static void main(String[] args) {
        testNarkotisk();
        testVanedannende();
        testVanlig();
    }
    public static void testNarkotisk(){
        int forventetID = 0;
        System.out.println("\n\n\nTest sjekk for legemiddel av klassen narkotiske stoffer: ");
        Narkotisk morfin = new Narkotisk("morfin", 400, 10, 10);
        System.out.println("ID av dette produktet er: "+morfin.ID+". Prisen av "+ morfin.virkestoff + "mg "+ morfin.navn +" er: " + morfin.hentPris() + "kr og har styrke: "+ morfin.styrke+".");
        if(forventetID == morfin.ID){
            System.out.println("Forventet ID: "+ morfin.ID+". Testen er bestaatt.\n\n\n");
        }else{
            System.out.println("Feil ID");
        }
    }
    public static void testVanedannende(){
        int forventetID = 1;
        System.out.println("Test sjekk for legemiddel av klassen vanedannende stoffer: ");
        Vanedannende benzo = new Vanedannende("benzodiazepiner", 100, 15, 6);
        System.out.println("ID av dette produktet er: "+benzo.ID+". Prisen av "+ benzo.virkestoff + "mg "+ benzo.navn +" er: " + benzo.hentPris() + "kr og har styrke: "+ benzo.styrke+".");
        if(forventetID == benzo.ID){
            System.out.println("Forventet ID: "+ benzo.ID+". Testen er bestaatt.\n\n\n");
        }else{
            System.out.println("Feil ID");
        }
    }
    public static void testVanlig(){
        int forventetID = 2;
        System.out.println("Test sjekk for legemiddel av klassen vanlige stoffer: ");
        Vanlig ibux = new Vanlig("ibux", 75, 500);
        System.out.println("ID av dette produktet er: "+ibux.ID+". Prisen av "+ ibux.virkestoff + "mg "+ ibux.navn +" er: " + ibux.hentPris() + "kr.");
        if(forventetID == ibux.ID){
            System.out.println("Forventet ID: "+ ibux.ID+". Testen er bestaatt.\n\n\n");
        }else{
            System.out.println("Feil ID");
        }
    }
}