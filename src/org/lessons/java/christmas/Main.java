package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del mittente: ");
        String nomeMittente = scanner.nextLine();

        System.out.print("Inserisci l'indirizzo del mittente: ");
        String indirizzoMittente = scanner.nextLine();

        List<String> listaDesideri = new ArrayList<>();

        while (true) {
            System.out.print("Inserisci un desiderio per la lista (oppure 'stop' per terminare): ");
            String desiderio = scanner.nextLine();

            if (desiderio.equalsIgnoreCase("stop")) {
                break;
            }

            listaDesideri.add(desiderio);

            System.out.printf("Hai inserito %d desideri finora.%n", listaDesideri.size());
            System.out.print("Vuoi continuare? (s/n) ");
            String risposta = scanner.nextLine();

            if (risposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Ordiniamo alfabetico
        Collections.sort(listaDesideri);

        ChristmasLetter lettera = new ChristmasLetter(nomeMittente, indirizzoMittente, listaDesideri);

        try {
            lettera.send();
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}