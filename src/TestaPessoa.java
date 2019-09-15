public class TestaPessoa {
    public static void main(String[] args)
    {     
     Pessoa  pessoa1 = new Pessoa();
        pessoa1.nome = "Josiane";
        pessoa1.idade = 20;
      
       
        System.out.println("Idade anterior: " +pessoa1.idade);
        
        pessoa1.getFazAniversario();
        pessoa1.getFazAniversario();
         pessoa1.getFazAniversario();
          pessoa1.getFazAniversario();
        
        System.out.println("Idade atual: " +pessoa1.idade);
        
        
        
       
    }
}