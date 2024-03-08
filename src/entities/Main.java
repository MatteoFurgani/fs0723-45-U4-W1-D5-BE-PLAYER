package entities;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlayerMultimediale[] elementi = new PlayerMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci un numero da 1 a 5 oppure 0 per uscire: ");
            int tipoElemento = scanner.nextInt();
            scanner.nextLine();

            switch (tipoElemento) {

                //----------------------AUDIO--------------------------

                case 1:
                    System.out.println("Inserisci il titolo dell'audio " + (i));
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci la durata dell'audio " + (i));
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume dell'audio " + (i));
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Audio(titoloAudio, durataAudio, volumeAudio);


                    System.out.println("Dettagli dell'audio " + (i));
                    System.out.println("Titolo: " + titoloAudio);
                    System.out.println("Durata: " + durataAudio);
                    System.out.println("Volume: " + volumeAudio);
                    elementi[i].play();
                    break;

                case 2:
                    System.out.println("Inserisci il titolo dell'audio " + (i));
                    String titoloAudio2 = scanner.nextLine();
                    System.out.println("Inserisci la durata dell'audio " + (i));
                    int durataAudio2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume dell'audio " + (i));
                    int volumeAudio2 = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Audio(titoloAudio2, durataAudio2, volumeAudio2);


                    System.out.println("Dettagli dell'audio " + (i));
                    System.out.println("Titolo: " + titoloAudio2);
                    System.out.println("Durata: " + durataAudio2);
                    System.out.println("Volume: " + volumeAudio2);
                    elementi[i].play();
                    break;

                //----------------------VIDEO--------------------------

                case 3:
                    System.out.println("Inserisci il titolo del video " + (i));
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video " + (i));
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del video " + (i));
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità del video " + (i));
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);


                    System.out.println("Dettagli del video " + (i));
                    System.out.println("Titolo: " + titoloVideo);
                    System.out.println("Durata: " + durataVideo);
                    System.out.println("Volume: " + volumeVideo);
                    System.out.println("Luminosità: " + luminositaVideo);
                    elementi[i].play();
                    break;

                case 4:
                    System.out.println("Inserisci il titolo del video " + (i));
                    String titoloVideo2 = scanner.nextLine();
                    System.out.println("Inserisci la durata del video " + (i));
                    int durataVideo2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del video " + (i) );
                    int volumeVideo2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità del video " + (i));
                    int luminositaVideo2 = Integer.parseInt(scanner.nextLine());;
                    elementi[i] = new Video(titoloVideo2, durataVideo2, volumeVideo2, luminositaVideo2);


                    System.out.println("Dettagli del video " + (i));
                    System.out.println("Titolo: " + titoloVideo2);
                    System.out.println("Durata: " + durataVideo2);
                    System.out.println("Volume: " + volumeVideo2);
                    System.out.println("Luminosità: " + luminositaVideo2);
                    elementi[i].play();
                    break;

                //----------------------IMMAGINE--------------------------

                case 5:
                    System.out.println("Inserisci il titolo dell'immagine " + (i));
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine " + (i));
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titoloImmagine, luminositaImmagine);


                    System.out.println("Dettagli dell'immagine " + (i));
                    System.out.println("Titolo: " + titoloImmagine);
                    System.out.println("Luminosità: " + luminositaImmagine);
                    elementi[i].play();
                    break;

                case 0:
                    System.out.println("Grazie e arrivederci!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Tipo di elemento non valido.");
                    break;
            }
        }

    }


}
