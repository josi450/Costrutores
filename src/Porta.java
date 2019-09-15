public class Porta {

private boolean aberta;
String cor;
double dimensaoX;
double dimensaoY;
double dimensaoZ;
    

public String getCor(){
        return this.cor;
    }
public double getDimensaoX(){
        return this.dimensaoX;
    }
public double getDimensaoY(){
        return this.dimensaoY;
    }
public double getDimensaoZ(){
        return this.dimensaoZ;
    }

public void setAbre() {
	aberta = true;
}

public void setFecha() {
	aberta = false;
}

public void SetPinta(String s) {
	this.cor += s;
}

public boolean isEstaAberta() {
	return aberta;

}

}
