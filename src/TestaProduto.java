
public class TestaProduto {
    public static void main (String[] args){
        
        Produto produto1 = new Produto();
        produto1.nome= "Macarrão";
        produto1.preco= 5.25;
        
        System.out.println("Produto vendido: " +produto1.nome);
        
        double valorCalculado = produto1.diminuir10(produto1.preco);
        
        System.out.println("Valor com desconto: "+valorCalculado);
        
        
        double valorCalculado1=produto1.aumenta25(produto1.preco);
        
        System.out.println("Valor com acréscimo: "+valorCalculado1);
        
    }
    
}
