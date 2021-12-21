public class ListaDuplaCircular {
    private int tamanho;
    private Node inicio;
    private Node fim;

    public void adicionar(int valor){
        Node newNode = new Node(valor);
        if(isEmpty()){
            inicio = newNode;
            fim = newNode;
            newNode.setAnterior(newNode);
            newNode.setProximo(newNode);
        }else{
            Node aux = inicio;
            while(aux.getProximo() != inicio){
                aux = aux.getProximo();
            }
            aux.setProximo(newNode);
            newNode.setAnterior(aux);
            this.fim = newNode;
            newNode.setProximo(inicio);
            this.inicio.setAnterior(newNode);
        }
        tamanho++;

    }

    public void remover(int valorRetirar) throws ListaVaziaException{
        //[22 33 4]

        Node aux = inicio;
        Node noAnterior = null;

        if(isEmpty()){
            throw new ListaVaziaException("Lista Vazia");
        }

        if(valorRetirar == aux.getValor()) {

            if (valorRetirar == aux.getValor()) {
                inicio = aux.getProximo();
            } else {
                while (aux.getProximo() != inicio && aux.getValor() != valorRetirar) {
                    noAnterior = aux;
                    aux = aux.getProximo();
                }
                if (aux.getProximo() != inicio) {
                    aux.getProximo().setAnterior(noAnterior);
                    noAnterior.setProximo(aux.getProximo());
                } else if (aux.getProximo() == inicio) {
                    aux.setAnterior(aux.getAnterior());
                }

            }
            this.tamanho--;
        }

    }

    public void mostrar(){
        System.out.println("inicio:" + inicio.getValor());
        System.out.println("fim:" + fim.getValor());
        Node aux = this.inicio;
        while (aux.getProximo() != null) {
            System.out.print("valor: " + aux.getValor());
            if (aux.getAnterior() != null){
                System.out.print(" anterior: " + aux.getAnterior().getValor());
            }else{
                System.out.print(" anterior vazio");
            }
            if (aux.getProximo() != null){
                System.out.println(" proximo: " + aux.getProximo().getValor());
            }else{
                System.out.println(" proximo vazio");
            }
            aux = aux.getProximo();
        }
        System.out.print("valor: " + aux.getValor());
        if (aux.getAnterior() != null){
            System.out.print(" anterior: " + aux.getAnterior().getValor());
        }else{
            System.out.print(" anterior vazio");
        }
        if (aux.getProximo() != null){
            System.out.println(" proximo: " + aux.getProximo().getValor());
        }else{
            System.out.println(" proximo vazio");
        }

    }

    public String toString(){
        String resultado = "[";
        Node aux = inicio;
        while(aux.getProximo() != inicio){
            resultado = resultado + aux.getValor() + " ";
            aux = aux.getProximo();
        }
        resultado = resultado + aux.getValor() + "]";
        return resultado;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

}
