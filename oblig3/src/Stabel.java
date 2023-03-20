//Klassen stabel er en subklasse av Lenkeliste som betyr at den arver alle variabler og metoder.
//I tillegg skriver den om metoden leggTil slik at den legger til nye noder som hodet på listen.
public class Stabel<E> extends Lenkeliste<E>{
    @Override
    public void leggTil(E x) {
        Node<E> E = new Node<>(x);
        if (antObj == 0){
            hode = E;
            hale = E;
        }
        else{
            Node<E> p = hode;
            hode = E;
            hode.neste = p;
        }
        antObj++;
    }
}