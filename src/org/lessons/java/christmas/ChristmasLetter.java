package org.lessons.java.christmas;


import java.util.List;
import java.util.Random;

public class ChristmasLetter {
        private String nomeMittente;
        private String indirizzoMittente;
        private List<String> listaDesideri;

        public ChristmasLetter(String nomeMittente, String indirizzoMittente, List<String> listaDesideri) {
            setNomeMittente(nomeMittente);
            setIndirizzoMittente(indirizzoMittente);
            setListaDesideri(listaDesideri);
        }

        public String getNomeMittente() {
            return nomeMittente;
        }

        public void setNomeMittente(String nomeMittente) {
            this.nomeMittente = nomeMittente;
        }

        public String getIndirizzoMittente() {
            return indirizzoMittente;
        }

        public void setIndirizzoMittente(String indirizzoMittente) {
            this.indirizzoMittente = indirizzoMittente;
        }

        public List<String> getListaDesideri() {
            return listaDesideri;
        }

        public void setListaDesideri(List<String> listaDesideri) {
            this.listaDesideri = listaDesideri;
        }

        public void send() throws Exception {
            if (listaDesideri.size() > 5) {
                throw new Exception("brutto avaro che non sei altro, la lista non può contenere più di 5 elementi");
            }

            Random random = new Random();
            boolean mittenteBuono = random.nextBoolean();

            if (!mittenteBuono) {
                throw new Exception("bro non sei stato bravo, vai a lavorare!");
            }

            System.out.println("Lettera a Babbo Mirko:");
            System.out.println("Nome bambino: " + getNomeMittente());
            System.out.println("Indirizzo bambino: " + getIndirizzoMittente());
            System.out.println("Lista dei desideri:");

            for (int i = 0; i < getListaDesideri().size(); i++) {
                System.out.printf("%d. %s%n", i + 1, getListaDesideri().get(i));
            }
        }
}

