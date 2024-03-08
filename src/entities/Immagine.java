package entities;

public class Immagine {
    private int luminosita;

    public Immagine(int luminosita) {

        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void show(){
        for(int i = 0; i < luminosita; i++){
            System.out.println("!");
        }

    }
    public void aumentaLuminosita(){
        luminosita++;
    }
    public void diminuisciLuminosita(){
        if(luminosita > 0){
            luminosita--;
        }
    }
}
