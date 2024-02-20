package co.edu.uptc.ejemplo1.enlazadas;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UptcList<T> implements List<T> {
    private Nodo<T> header = null;
    private Nodo<T> footer = null;

    @Override
    public boolean add(T info) {
        Nodo<T> tmp = new Nodo<T>();
        tmp.setInfo(info);

        if (header == null) {
            header = tmp;
            footer = header;
        } else {
            footer.setNext(tmp);
            footer = tmp;
        }
        return false;
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

    @Override
    public int size() {
        Nodo<T> aux = header;
        int count = 0;
        while (aux != null) {
            aux = aux.getNext();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        Nodo<T> aux = header;
        boolean flag = false;
        try {
            while (aux != null) {
                if (aux.getInfo().equals(o)) {
                    flag = true;
                }
                aux = aux.getNext();
            }
        } catch (NullPointerException e) {
            System.out.println("El objeto no existe");
        }
        return flag;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        header = null;
        footer = null;
    }

    @Override
    public T get(int index) {
        try {
            Nodo<T> aux = header;
            while (aux != null) {
                aux = aux.getNext();
            }
            return aux.getInfo();
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bound for lenght");
        }
    }

    @Override
    public T set(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, T element) {
        Nodo<T> temp = new Nodo<>();
        Nodo<T> aux = header;
        Nodo<T> aux2 = header;
        temp.setInfo(element);
        try {
            if (index == 0) {
                temp.setNext(header);
                header = temp;
            } else {
                for (int i = 0; i <= index - 1; i++) {
                    aux = aux2;
                    aux2 = aux2.getNext();
                }
                temp.setNext(aux2);
                aux.setNext(temp);
            }
        } catch (NullPointerException e) {
            System.out.println("El indice esta fuera del tamaño del vector");
        }

    }

    @Override
    public T remove(int index) {
        Nodo<T> aux = header;
        Nodo<T> elementDeleted = null;
        if (index == 0) {
            elementDeleted = header;
            header = header.getNext();
            if (header == footer) {
                header = footer = null;
            }
        } else {
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getNext();
            }
            elementDeleted = aux.getNext();
            aux.setNext(aux.getNext().getNext());
        }
        return elementDeleted.getInfo();
    }

    @Override
    public int indexOf(Object o) {
        Nodo<T> aux = header;
        int cont = 0;
        try {
            while (!aux.getInfo().equals(o)) {
                aux = aux.getNext();
                cont += 1;
            }
        } catch (NullPointerException e) {
            System.out.println("El objeto no existe");
        }
        return cont;
    }

    @Override
    public int lastIndexOf(Object o) {
        Nodo<T> aux = header;
        Nodo<T> temp = new Nodo<>();
        int cont = 0;
        int index = 0;
        try {
            do {
                if (aux.getInfo().equals(o)) {
                    temp = aux;
                    index = cont;
                }
                aux = aux.getNext();
                cont += 1;
            } while (aux.getNext() != null);
        } catch (NullPointerException e) {
            System.out.println("El objeto no existe");
        }
        return cont;
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    // Actividad 1
    private Nodo findNode(int index) {
        Nodo<T> aux = header;
        Nodo<T> temp = new Nodo<>();
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
            if (i == index) {
                temp = aux;
            }
        }
        return temp;
    }

    private Nodo findNode(Object object) {
        Nodo<T> aux = header;
        boolean flag = false;
        while (aux != null && flag != true) {
            if (aux.getInfo().equals(object)) {
                flag = true;
            } else {
                aux = aux.getNext();
            }
        }
        return aux;
    }

    /*
     * public int indexOf(Object object) {
     * 
     * }
     * public int lastIndexOf(Object object) {
     * 
     * }
     */

    public Object next() {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

    public Object previous() {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}
