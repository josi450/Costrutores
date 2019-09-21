public class TestaEsfera {
    public static void main (String[] args){
        Esfera esf1 = new Esfera (1.57);
   
        
        double calculoVolume= esf1.volume(esf1.getRaio());
        
        System.out.println ("Volume da esfera:"+calculoVolume);
    }
    
}
