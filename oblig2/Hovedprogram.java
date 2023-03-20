package oblig2;

public class Hovedprogram {
    public static void main(String[] args){
        Narkotisk heroin = new Narkotisk("heroin", 1000, 100, 9);
        Vanedannende kodein = new Vanedannende("kodein", 250, 1000, 7);
        Vanlig nesespray = new Vanlig("nesespray", 70, 50);
        Vanlig p = new Vanlig("p-pille", 50, 350);
        Lege hansen = new Lege("dr hansen");
        Spesialist henrikson = new Spesialist("dr henrikson", "kode1");
        HviteResepter hvit = new HviteResepter(nesespray, hansen, 0, 5);
        blaaResepter blaa = new blaaResepter(heroin, henrikson, 1, 4);
        MilResept mil = new MilResept(kodein, henrikson, 2, 3);
        PResept P = new PResept(p, hansen, 3, 1);
        System.out.println(hansen);
        System.out.println(henrikson);
        System.out.println(hvit);
        System.out.println(blaa);
        System.out.println(mil);
        System.out.println(P);
    }
}