public class Nodo<T>{
    private T element;
    private Nodo next;

    public Nodo(T element) {
        this.element = element;
        this.next = null;
    }
    
    public T getElement() {
        return element;
    }
    public void setElement(T element) {
        this.element = element;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

    
}