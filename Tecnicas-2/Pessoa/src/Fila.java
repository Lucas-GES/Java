public class Fila <E> {
    private int maxSize; //TAMANHO DA FILA
    private E[] queArray; //FILA EM ARRAY
    private int front; //INDICA O INICIO DA FILA
    private int rear; //INDICA O FINAL DA FILA
    private int nItems; //OCUPAÇÃO DA FILA

    public Fila(int s){
        maxSize = s;
        queArray = (E[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }

    public int size(){
        return nItems;
    }

    public void insert(E j){
        if(!isFull()) {
            if(rear == maxSize-1) //lida com circular
                rear = -1;
            queArray[++rear] = j;
            nItems++;
        }
    }

    public E remove() throws FilaVaziaException{
        E temp;
        if (!isEmpty()){
            temp = queArray[front++];

            if(front == maxSize)
                front = 0;
        }else{
            throw new FilaVaziaException("Fila Vazia");
        }
        return temp;
    }

    public E front() throws FilaVaziaException{
        if (isEmpty()){
            throw new FilaVaziaException("Fila Vazia");
        }
        return queArray[front];
    }

}
