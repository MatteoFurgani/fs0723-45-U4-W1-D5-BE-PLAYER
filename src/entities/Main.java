package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo della canzone: ");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci il tempo di registrazione: ");
        int durata = scanner.nextInt();
        System.out.println("Inserisci il volume: ");
        int volume = scanner.nextInt();

        Audio traccia1 = new Audio(titolo, durata, volume);

        System.out.println("Titolo: " + traccia1.titolo );
        System.out.println("Durata: " + traccia1.getDurata() + " secondi" );
        System.out.println("Volume: " + traccia1.getVolume());

        traccia1.play();



    }
}
