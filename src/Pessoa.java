public class Pessoa {
    
    private String nome;
    private int idade;
    //Construtor

    public Pessoa(String n, int i) {
        this.nome = n;
        this.idade = i;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }
    
    
    void fazAniversario(){
    idade= this.idade+1;
   
}
}
