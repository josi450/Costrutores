public class TestaPorta {

public static void main(String[] args){

	Porta porta = new Porta();
	porta.setAbre();
	porta.setFecha();
	
	porta.cor = "Rosa";
	porta.cor  = "Azul";
	porta.cor  = "Verde";
	porta.cor  = "Amarelo";
        porta.cor  = "Marrom";
	
	porta.dimensaoX = 80;
	porta.dimensaoY = 75;
	porta.dimensaoZ= 100;
	
	System.out.println("A porta está aberta? " + porta.isEstaAberta());
	System.out.println("Cor da porta:"+porta.cor );
}
}
