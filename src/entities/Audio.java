package entities;

public class Audio extends PlayerMultimediale {

    private int durata;
    private int volume;

    public Audio( String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void abbassaVolume(){
        if(volume > 0){
            volume--;
        }
    }
    public void alzaVolume(){
        volume++;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {

        for(int i = 0; i < volume; i++){
            System.out.println("!");
        }
        System.out.println("Il titolo della canzone è: " + titolo);


    }
}
