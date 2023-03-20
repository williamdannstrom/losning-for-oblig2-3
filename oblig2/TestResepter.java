package oblig2;

public class TestResepter {
    public static void main(String[] args){
        testBlaa();
        testHvit();
        testMil();
        testP();
    }
    public static void testBlaa(){
        Vanedannende adderall = new Vanedannende("adderall", 400, 10, 10);
        Lege hansen = new Lege("dr hansen");
        blaaResepter resept = new blaaResepter(adderall, hansen, 0, 1);
        System.out.println(resept);
        resept.bruk();
        System.out.println(resept);
    }
    public static void testHvit(){
        Vanedannende benzo = new Vanedannende("benzodiazepiner", 200, 30, 6);
        Lege anton = new Lege("dr antonsen");
        HviteResepter resept = new HviteResepter(benzo, anton, 1, 2);
        System.out.println(resept.toString());
        resept.bruk();
        System.out.println(resept.toString());
    }
    public static void testMil(){
        Vanlig ibux = new Vanlig("ibux", 75, 500);
        Lege chris = new Lege("dr christensen");
        MilResept resept = new MilResept(ibux, chris, 2, 0);
        System.out.println(resept.toString());
        resept.bruk();
        System.out.println(resept.toString());
    }
    public static void testP(){
        Vanlig P = new Vanlig("p-piller", 500, 3500);
        Lege berg = new Lege("dr Berg");
        PResept resept = new PResept(P, berg, 3, 1);
        System.out.println(resept.toString());
        resept.bruk();
        System.out.println(resept.toString());
    }
}