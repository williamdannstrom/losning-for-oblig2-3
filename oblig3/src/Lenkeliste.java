//I denne klassen oppretter jeg en lenket liste med 5 metoder, størrelse, leggTil, hent, fjern og toString. Klassen inneholder også klassen Node.
public abstract class Lenkeliste <E> implements Liste<E>{
    int antObj = 0; //Antall objekter
    protected Node<E> hode; //Noden for hode (første objektet i listen)
    protected Node<E> hale; //Node for hale (siste objektet i listen)
    protected static class Node<E>{
        E data;
        Node<E> neste;
        Node(E x){
            this.data = x;
            this.neste = null;}
    }
    protected Node<E> start = null;
    public int stoerrelse() {
        return antObj;
    }

    public void leggTil(E x) {
        Node<E> E = new Node<>(x);
        if (antObj == 0){
            hode = E;
            hale = E;
        }
        else{
            hale.neste = E;
            hale = E;
        }
        antObj++;
    }

    public E hent() {
        if (antObj == 0){
            return null;
        }
        return hode.data;
    }
    @Override
    public E fjern() {
        if (antObj == 0){ //Ugyldig indeks
            throw new UgyldigListeindeks(0);
        }
        E x = hode.data;
        hode = hode.neste;
        antObj--;
        return x;
    }
    @Override
    public String toString() {
        String outStr = "";
        outStr = outStr + "[";
        Node<E> p = hode;
        while (p!=null){
            outStr = outStr + p.data.toString();
            if (p.neste != null){
                outStr = outStr + ", ";
            }
        }
        outStr = outStr + "]";
        return outStr;
    }
}