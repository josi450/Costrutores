
public class Produto {
    
    private String nome;
    private double preco;
    //Construtor

    public Produto(String n, double p) {
        this.nome = n;
        this.preco = p;
    }
    
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setPreco(double p) {
        this.preco = p;
    }
    
    double diminuir10(double diminui){
    double pro =(diminui * 0.9);
    return pro;
        
    }
    double aumenta25(double aumenta){
    double acrs= (aumenta * 1.25);
    return acrs;
    }
    
}
