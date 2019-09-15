public class Pessoa {
    
    String nome;
    int idade;
    
    public String setNome(String n){
        this.nome=n;
        return n;
    }
    public int setIdade(int i){
        this.idade=i;
        return i;
    }
    
    
    public void getFazAniversario(){
    idade= this.idade+1;
   
}
}
