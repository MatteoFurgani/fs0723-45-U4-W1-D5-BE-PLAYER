package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //-------------------------AUDIO-----------------------------

        System.out.println("Inserisci il titolo della canzone: ");
        String titoloAudio = scanner.nextLine();
        System.out.println("Inserisci il tempo di registrazione: ");
        int durataAudio = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume: ");
        int volumeAudio = Integer.parseInt(scanner.nextLine());

        Audio traccia1 = new Audio(titoloAudio, durataAudio, volumeAudio);

        System.out.println("Titolo: " + traccia1.titolo );
        System.out.println("Durata: " + traccia1.getDurata() + " secondi" );
        System.out.println("Volume: " + traccia1.getVolume());

        traccia1.play();
        System.out.println("----------------------------");

        //-------------------------VIDEO-----------------------------

        System.out.println("Inserisci il titolo del video: ");
        String titoloVideo = scanner.nextLine();
        System.out.println("Inserisci la durata del video: ");
        int durataVideo = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il volume del video: ");
        int volumeVideo = Integer.parseInt(scanner.nextLine());;
        System.out.println("Inserisci la luminosità del video: ");
        int luminositaVideo = Integer.parseInt(scanner.nextLine());

        Video video1 = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);

        System.out.println("Titolo: " + video1.titolo );
        System.out.println("Durata: " + video1.getDurata() + " secondi" );
        System.out.println("Volume: " + video1.getVolume());
        System.out.println("Luminosità: " + video1.getLuminosita());

        video1.play();

        //-------------------------IMMAGINE-----------------------------

        System.out.println("inserisci la luminosità:");
        int luminositaImmagine = Integer.parseInt(scanner.nextLine());

        Immagine immagine1 = new Immagine(luminositaImmagine);


        System.out.println("Luminosità: " + immagine1.getLuminosita());

        immagine1.show();

        scanner.close();
    }
}
