public class ListaDupla {
    private int tamanho;
    private Node inicio;
    private Node fim;

    public void adicionar(int valor){
        Node newNode = new Node(valor);
        if(isEmpty()){
            inicio = newNode;
            fim = newNode;
        }else{
            Node aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(newNode);
            newNode.setAnterior(aux);
            this.fim = newNode;
        }
        tamanho++;

    }

    public int getPosicao(int posicao){
        int saida = 0;
        Node aux = inicio;
        int cont = 0;

        if(posicao > tamanho || posicao < 0){
            saida = -1;
        }else {
            for (int i = 1; i <= posicao; i++) {
                cont = i;
                if (cont == posicao) {
                    saida = aux.getValor();
                } else {
                    saida = -1;
                }
                aux = aux.getProximo();
            }
        }
        return saida;
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
                while (aux.getProximo() != null && aux.getValor() != valorRetirar) {
                    noAnterior = aux;
                    aux = aux.getProximo();
                }
                if (aux.getProximo() != null) {
                    aux.getProximo().setAnterior(noAnterior);
                    noAnterior.setProximo(aux.getProximo());
                } else if (aux.getProximo() == null) {
                    noAnterior.setProximo(aux.getProximo());
                } else if (aux.getProximo() == inicio) {
                    aux.setAnterior(null);
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
        while(aux.getProximo() != null){
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
