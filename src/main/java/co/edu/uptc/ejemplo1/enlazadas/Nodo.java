package co.edu.uptc.ejemplo1.enlazadas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nodo")
public class Nodo<T> {
    private T info;
    private Nodo<T> next;

    // Contructor
    public Nodo() {
        next = null;
    }

    public Nodo(T info, Nodo next) {
        this.info = info;
        this.next = next;
    }

    @GetMapping("/info")
    public void add() {

    }

    // Getters and Setters
    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo getNext() {
        return this.next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
