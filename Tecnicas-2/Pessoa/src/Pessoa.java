public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){return nome;}

    public int getIdade(){return  idade;}

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa p) {
        if(this.idade > p.idade){
            return 1;
        }else{
            if(this.idade < p.idade){
                return -1;
            }
        }
        return 0;
    }
}
