package entities;

import interfaces.Play;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PlayerMultimediale[] elementi = new PlayerMultimediale[5];
        elementi[0] = new Audio("November Rain", 6, 10);
        elementi[1] = new Audio("Master Of Puppets", 4, 8);
        elementi[2] = new Video("Avengers", 10, 10, 15);
        elementi[3] = new Video("Il Corvo", 5, 7, 10);
        elementi[4] = new Immagine("Foto Profilo", 20);


        while (true) {
            System.out.println("Inserisci un numero da 1 a 5 oppure 0 per uscire: ");
            int scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Grazie per averci scelto, arrivederci!!!");
                break;
            } else if (scelta >= 1 && scelta <= 5) {

                PlayerMultimediale elementoScelto = elementi[scelta - 1];
                if (elementoScelto != null) {
                    ((Play) elementoScelto).play();
                }
            } else {
                System.out.println("Indice non valido.");

            }
        }

        scanner.close();
    }


}
