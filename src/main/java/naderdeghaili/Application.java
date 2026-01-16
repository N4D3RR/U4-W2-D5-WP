package naderdeghaili;

import naderdeghaili.entities.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        GameCollection gameCollection = new GameCollection();

        //VideoGames
        Game g1 = new VideoGame(1, "Call of Duty", 2025, 80, "MultiPlatform", 30, Genre.FPS);
        Game g2 = new VideoGame(2, "Fortnite", 2017, 0, "MultiPlatform", 100, Genre.TPS);
        Game g3 = new VideoGame(3, "Red Dead Redemption", 2020, 60, "MultiPlatform", 30, Genre.ACTION);
        Game g4 = new VideoGame(4, "Arc Raiders", 2025, 40, "MultiPlatform", 30, Genre.TPS);

        //TableGames
        Game g6 = new TableGame(6, "Monopoly", 1935, 30, 4, 30);
        Game g7 = new TableGame(7, "Risk", 1959, 50, 4, 180);
        Game g8 = new TableGame(8, "Exploding Kittens", 2015, 20, 4, 20);
        Game g9 = new TableGame(9, "Hotel", 1974, 40, 4, 90);

        //Games per funzione update
        Game g5 = new VideoGame(5, "Expedition 66", 2024, 40, "MultiPlatform", 30, Genre.ADVENTURE);
        Game g10 = new TableGame(10, "Taboo", 1989, 20, 4, 30);

        gameCollection.addGame(g1);
        gameCollection.addGame(g2);
        gameCollection.addGame(g3);
        gameCollection.addGame(g4);
        gameCollection.addGame(g6);
        gameCollection.addGame(g7);
        gameCollection.addGame(g8);
        gameCollection.addGame(g9);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    MENU
                    1 - Aggiungi gioco
                    2 - Ricerca per ID
                    3 - Ricerca per prezzo massimo
                    4 - Ricerca giochi da tavolo per numero giocatori
                    5 - Rimuovi gioco per ID
                    6 - Aggiorna gioco per ID
                    7 - Ottieni le statistiche della collezione
                    """);

        }


    }

}
