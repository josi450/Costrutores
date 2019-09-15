public class TestaEsfera {
    public static void main (String[] args){
        Esfera esf1 = new Esfera ();
        esf1.raio=1.57;
        
        double calculoVolume= esf1.setVolume(esf1.raio);
        
        System.out.println ("Volume da esfera:"+calculoVolume);
    }
    
}
