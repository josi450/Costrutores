public class TestaCasa {
    public static void main (String args[]){
         
        Casa casa1= new Casa("Rosa",true,true,true,3);
        
        
        casa1.pinta("Rosa");
        System.out.println("A quantidade de portas abertas é: " + casa1.quantasPortasEstaoAbertas());        
    }
    
}