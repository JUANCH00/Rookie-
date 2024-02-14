package co.edu.uptc.ejemplo1.enlazadas;

public class UptcList<T> {
    private Nodo<T> header = null;

    public void add(T info) {
        Nodo tmp = new Nodo();
        tmp.setInfo(info);
        tmp.setNext(null);

        if (header == null) {
            header = tmp;
        } else {
            Nodo ultimo = header;
            while (ultimo.getNext() != null) {
                ultimo = ultimo.getNext();
            }
            ultimo.setNext(tmp);
        }

    }

    public void remove() {
        Nodo<T> penultimate = header;
        while (penultimate.getNext().getNext() != null) {
            penultimate = penultimate.getNext();
        }
        penultimate.setNext(null);
    }

    public Nodo<T> getHeader() {
        return header;
    }

}
