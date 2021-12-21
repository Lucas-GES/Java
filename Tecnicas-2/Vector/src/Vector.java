public class Vector {
    private int size;
    private int[] vector;

    /**
     * Construtor para inicalizar o vetor com tamanho 20
     */
    public Vector()
    {
        vector = new int[20];
        size = 20;
    }

    /**
     * Construtor para inicalizar o vetor com tamanho recebido no parâmetro
     */
    public Vector(int size)
    {
        vector = new int[size];
        this.size = size;
    }

    /**
     * Insere um valor no primeiro elemento vazio do vetor, retornar true.
     * Se não existir elemento vazio, retornar false.
     */
    public boolean insert(int element)
    {
        boolean saida = true;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == 0){
                vector[i] = element;
                break;
            }else{
                saida = false;
            }
        }
        return saida;
    }

    /**
     * Inserir um valor no elemento indicado pelo índice.
     * Para índice inválido, ou elemento com valor, retornar false,
     * caso contário, true.
     */
    public boolean insertInto(int element, int index)
    {
        boolean saida = true;
        if(vector[index] < vector.length) {
            vector[index] = element;
            if(vector[index] > vector.length){
                return saida = false;
            }else if(vector[index] == 0 ){
                saida = true;
            }
        }
        return saida;
    }

    /**
     * Retornar o valor do elemento na posição indicada pelo indice.
     * Para indice inválido, retornar 0.
     */
    public int get(int index){
        int saida = 0;
        for(int i = 0; i < vector.length ; i++){
            if( i == index){
                return saida = vector[i];
            }else if( vector[i] != index){
                saida = 0;
            }

        }
        return saida;
    }

    /**
     * Retorna o valor do primeiro elemento não vazio.
     * Caso não exista elemento com valor preenchido, retornar 0.
     */
    public int first()
    {
        int saida = 0;
        for(int i= 0; i < vector.length ; i++){
            if(vector[i] > 0 ){
                saida = vector[i];
                break;
            }else{
                saida = 0;
            }
        }
        return saida;
    }

    /**
     * Retorna o valor do último elemento não vazio.
     * Caso não exista elemento com valor preenchido, retornar 0.
     */
    public int last()
    {
        int saida = 0;
        for(int i = vector.length -1 ; i >= 0 ; i--){
            if(vector[i] > 0){
                saida = vector[i];
                break;
            }else{
                saida = 0;
            }
        }
        return saida;
    }

    /**
     * Remove o valor armazenado no elemento do índice do parâmetro. Retorna o valor removido.
     * Caso não exista elemento, retornar 0.
     * Caso não exista o índice, retornar 0.
     */
    public int remove(int index)
    {
        int saida = 0;
        for(int i = 0; i<vector.length;i++){
            if( i == index){
                saida += vector[i];
                vector[i] = 0;
            }else if (i != index){
                saida = 0;
            }else{
                saida = 0;
            }

        }
        return saida;
    }

    /**
     * Remove o último elemento adicionado no vetor.
     * Caso não há elementos no vetor, retorna 0.
     */
    public int remove()
    {
        int saida = 0;
        for(int i = vector.length -1 ; i >= 0 ; i--){
            if(vector[i] > 0) {
                vector[i] = 0;
                saida = vector[i];
                break;
            }else{
                saida = 0;
            }
        }
        return saida;
    }

    /**
     * Retorna o tamanho do vetor.
     */
    public int length()
    {
        int saida = 0;
        for(int i = 0; i < vector.length ; i++){
            saida++;
        }
        return saida;
    }

    /**
     * Retorna a quantidade de elementos do vetor.
     */
    public int size()
    {
        int saida = 0;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > 0){
                saida++;
            }
        }
        return saida;
    }

    /**
     * Verifica se o elemente existe no vetor.
     *
     * @return true ou false.
     */
    public boolean exist(int element)
    {
        boolean saida = true;
        for(int i=0 ; i < vector.length ; i++){
            if(element == vector[i]){
                return saida = true;
            }else if(element != vector[i]){
                saida = false;
            }
        }
        return saida;
    }

    /**
     * Converte o array em uma String.
     */
    public String toString()
    {
        String saida ="";

        for(int i = 0; i< vector.length ; i++){
            saida += vector[i] + "" + ',';
        }
        return saida;
    }
}
