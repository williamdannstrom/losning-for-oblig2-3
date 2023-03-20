//Klassen IndeksertListe arver Lenkeliste og skriver om metodene leggTil, sett, hent, fjern og har en ny metode hentPos.
//I denne klassen sender man inn en ny node som argument i tillegg til en posisjon som indikerer hvor i listen noden blir lagt til.
//Klassen tar også i bruk ugyldigindeks på alle metodene bortsett fra hentPos for å unngå å prøve å legge til eller hente en node som er utenfor listen.
class IndeksertListe <E> extends Lenkeliste<E> {
    public void leggTil (int pos, E x) throws UgyldigListeindeks{
        if(pos < 0 || pos > stoerrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        if (pos == stoerrelse() || antObj == 0){ //Hvis posisjonen er like stor som størrelsen på listen kan noden legges til som siste element.
            leggTil(x);
        } else{
                Node<E> nyNode = new Node<>(x);
                if (pos == 0){
                    nyNode.neste = hode;
                    hode = nyNode;
                }else {
                    Node<E> forrige = hentPos(pos-1); //Den nye noden forrige er hentet fra metoden hentPos.
                    nyNode.neste = forrige.neste;
                    forrige.neste = nyNode;
                }
            antObj++;
        }
    }
    public void sett (int pos, E x) throws UgyldigListeindeks{
        if(pos < 0 || pos >= stoerrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        Node<E> node = hentPos(pos);
        node.data = x;
    }
    public E hent (int pos) {
        if(pos < 0 || pos > stoerrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        Node<E> out = hentPos(pos);
        return out.data;
    }
    public E fjern (int pos) throws UgyldigListeindeks{
        if(pos < 0 || pos >= stoerrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        E x;
        if (pos == 0){
            x = hode.data;
            fjern();
        } else{
            Node<E> forrige = hentPos(pos-1);
            Node<E> denne = hentPos(pos);
            x = denne.data;
            forrige.neste = denne.neste;
            denne.neste = null;
            antObj--;
        }
        return x;
    }
    public Node<E> hentPos(int pos){
        Node<E> ret = hode; //Noden som returneres dersom metoden blir kalt på.
        for(int x = 0; x < pos; x++){
            ret = ret.neste;
        }
        return ret;
    }
}