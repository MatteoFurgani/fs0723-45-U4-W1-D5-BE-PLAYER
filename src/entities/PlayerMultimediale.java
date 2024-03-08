package entities;
import interfaces.Riproduzione;

abstract class PlayerMultimediale implements Riproduzione {
    protected String titolo;

    public PlayerMultimediale(String titolo) {
        this.titolo = titolo;
    }
}
