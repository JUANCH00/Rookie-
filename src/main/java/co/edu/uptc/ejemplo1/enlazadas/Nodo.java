package co.edu.uptc.ejemplo1.enlazadas;

public class Nodo<T> {
    private T info;
    private Nodo<T> next;

    // Contructor
    public Nodo() {
        next = null;
    }

    public Nodo(T info, Nodo<T> next) {
        this.info = info;
        this.next = next;
    }

    // Getters and Setters
    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getNext() {
        return this.next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

}
