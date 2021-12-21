public class Pilha<E>{
    private int maxSize;
    private E[] stackArray;
    private int topo;


    public Pilha(int s){
        maxSize = s;
        stackArray = (E[]) new Object[maxSize];
        topo = -1;
    }

    public void insert(E j){
        if(!isFull())
            stackArray[++topo] = j;
    }

    public E remove() throws PilhaVaziaException{
        E temp;
        if(!isEmpty()){
            temp = stackArray[topo--];
        }else{
            throw new PilhaVaziaException("Pilha Vazia");
        }
        return temp;
    }

    public E getTopo() throws PilhaVaziaException{
        if(isEmpty()){
            throw new PilhaVaziaException("Pilha Vazia");
        }
        return stackArray[topo];
    }

    public boolean isEmpty(){
        return (topo==-1);
    }

    public boolean isFull(){return (topo==maxSize-1);}

    public int size(){return topo+1;}

}
