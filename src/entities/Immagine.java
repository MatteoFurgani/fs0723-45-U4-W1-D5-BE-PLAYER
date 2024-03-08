package entities;

import interfaces.Luminosita;
import interfaces.Play;

public class Immagine extends PlayerMultimediale implements Luminosita, Play {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("!");
        }
        System.out.println(" Il titolo dell'immagine è: " + titolo);
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
        if(luminosita > 0){
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("!");
        }
        System.out.println(" Il titolo dell'immagine è: " + titolo);

    }
}