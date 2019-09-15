
public class Produto {
    
   String nome;
    double preco;
    
   public double setDiminuir10(double diminui){
    double pro =(diminui * 0.9);
    return pro;
        
    }
   public double Setaumenta25(double aumenta){
    double acrs= (aumenta * 1.25);
    return acrs;
    }

    double setAumenta25(double preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
