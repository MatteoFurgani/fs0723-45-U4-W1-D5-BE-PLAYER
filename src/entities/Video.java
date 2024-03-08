package entities;

public class Video extends PlayerMultimediale {
    private int durata;
    private int volume;
    private int luminosita;

    public Video ( String titolo, int durata, int volume, int luminosita){
        super ( titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }
    public int getLuminosita() {
        return luminosita;
    }
    public void aumentaLuminosita(){
        luminosita++;
    }
    public void diminuisciLuminosita(){
        if(luminosita > 0){
            luminosita--;
        }
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++){
            for(int j = 0; j < volume; j++){
                System.out.println("!");
            }
            System.out.println(" ");
            for(int k = 0; k < luminosita; k++){
                System.out.println("*");
            }
            System.out.println("Il titolo del video è: " + titolo);
        }


    }
}
