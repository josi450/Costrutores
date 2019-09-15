public class TestaAluno {
    public static void main (String[] args){
        Aluno aluno1 = new Aluno ();
        aluno1.nome = "Josiane" ;
        aluno1.cpf = "123.456.789-00";
        Data data = new Data ();
        data.dia = 22;
        data.mes = 4;
        data. ano = 1999;
        aluno1.dataDeNascimento = data;
        
        String dados = aluno1.getImprimir ();
        System.out.println (dados);
    } 
    
}
