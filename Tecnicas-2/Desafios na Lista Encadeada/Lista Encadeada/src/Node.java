public class Node {
    private int valor;
    private Node proximo;
    private Node anterior;

    public Node(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public Node getProximo(){
        return this.proximo;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }

    public Node getAnterior(){
        return this.anterior;
    }

    public void setAnterior(Node anterior){
        this.anterior = anterior;
    }
}
