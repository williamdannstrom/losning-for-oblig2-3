//Klassen Prioritetskø arver Lenkeliste og skriver om metoden leggTil.
//Denne metoden skal legge til noden i køen på den måten at noden før har lavere eller lik verdi og noden etterfulgt har høyere eller lik verdi.
class Prioritetskoe<E extends Comparable<E>> extends Lenkeliste<E>{
    @Override
    public void leggTil(E x) {
        Node<E> leggtil = new Node<>(x);
        if(antObj == 0){ //Hvis noden er den eneste i listen blir hodet og halen lik den noden.
            hode = hale = leggtil;
        }else if (x.compareTo(hode.data) < 0) { //Dersom x har lavere verdi enn dataen til hode blir noden hode gjort til leggtil.
            leggtil.neste = hode;
            hode = leggtil;
        }else {
            Node<E> forrige = hode;
            Node<E> denne = hode.neste;
            while (denne != null && x.compareTo(denne.data) > 0) { //Så lenge verdien av denne ikke er null og x har høyere verdi enn dataen til denne.
                forrige = denne;
                denne = denne.neste;
            }
            forrige.neste = leggtil;
            leggtil.neste = denne;
            if (denne == null) {
                hale = leggtil;
            }
        }
        antObj++;
    }
}