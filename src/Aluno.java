public class Aluno {
   String nome;
   String cpf;
   Data dataDeNascimento;
    
   public String getImprimir (){
        String aluno= this.nome + "\n"
                + this.cpf + "\n"
                +this.dataDeNascimento.imprimir();
        return aluno;
    }
    public void setNome (String n){
         this.nome= n ;
          
                }
 
    public void setCpf (String c){
        this.cpf=c;
    }
   


}