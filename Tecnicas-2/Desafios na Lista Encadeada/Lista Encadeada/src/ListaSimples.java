public class ListaSimples {
    private int tamanho;
    private Node inicio;

    public void adicionar(int valor){
        Node newNode = new Node(valor);
        if(isEmpty()){
            inicio = newNode;
        }else{
            Node aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(newNode);
        }
        tamanho++;

    }

    public void remover(int valorRetirar) throws ListaVaziaException{
        Node aux = inicio;
        Node noAnterior = null;

            if(isEmpty()){
                throw new ListaVaziaException("Lista Vazia");
            }
        if(valorRetirar == aux.getValor()) {
            if (valorRetirar == aux.getValor()) {
                inicio = aux.getProximo();

            } else if (aux.getValor() != valorRetirar) {
                while (aux.getProximo() != null && aux.getValor() != valorRetirar) {
                    noAnterior = aux;
                    aux = aux.getProximo();
                }
                noAnterior.setProximo(aux.getProximo());


            }


            this.tamanho--;
        }

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

    public String toString() throws ListaVaziaException{
        String resultado = "[";
        Node aux = inicio;

        if(isEmpty()){
            throw new ListaVaziaException("Lista Vazia");
        }

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
