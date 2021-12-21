public class Node<E> {
    private E valor;
    private Node proximo;
    private Node anterior;

    public Node(E valor){
        this.valor = valor;
    }

    public E getValor(){
        return this.valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    public Node getProximo(){
        return this.proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }

    public void  setAnterior(Node anterior){
        this.anterior = anterior;
    }
}
