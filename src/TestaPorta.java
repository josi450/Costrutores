public class TestaPorta {

public static void main(String[] args){

	Porta porta = new Porta(false,"Marrom",80,75,100);
	porta.abre();
	porta.fecha();
	
	
	
	System.out.println("A porta está aberta? " + porta.estaAberta());
	System.out.println("Cor da porta:"+porta.getCor());
}
}
