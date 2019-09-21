public class TestaPessoa {
    public static void main(String[] args)
    {     
     Pessoa  pessoa1 = new Pessoa("Josi", 20);
       
       
        System.out.println("Idade anterior: " +pessoa1.getIdade());
        
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        
        System.out.println("Idade atual: " +pessoa1.getIdade());
        
    }
}