package entities;

import interfaces.Durata;
import interfaces.Play;
import interfaces.Volume;
import interfaces.Luminosita;

public class Video extends PlayerMultimediale implements Durata, Play, Volume, Luminosita {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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
            System.out.print(" ");
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(" Il titolo del video è: " + titolo);
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

    @Override
    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}
