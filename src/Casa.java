public class Casa {
 
    String cor;
    Boolean porta1, porta2, porta3;
    int total;
    
    void pinta(String s) {        
        cor = s;
        System.out.println("A cor da casa é: "+ cor);
    }
    
    int quantasPortasEstaoAbertas() {
       if (porta1 == true) {
           int p1 = 1;
           total = p1;
       }
       if (porta2 == true) {
           int p2 = 1;
           total = total + p2;
       }
       if (porta3 == true) {
           int p3 = 1;
           total = total + p3;
       }       
       return total;       
    }
}
    