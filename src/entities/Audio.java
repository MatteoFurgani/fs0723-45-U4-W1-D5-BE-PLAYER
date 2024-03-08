package entities;

import interfaces.Durata;
import interfaces.Play;
import interfaces.Volume;

public class Audio extends PlayerMultimediale implements Durata, Volume, Play {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println("Il titolo della canzone è: " + titolo);
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }
}
