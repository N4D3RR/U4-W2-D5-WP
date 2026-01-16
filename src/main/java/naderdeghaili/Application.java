package naderdeghaili;

import naderdeghaili.entities.Game;
import naderdeghaili.entities.Genre;
import naderdeghaili.entities.TableGame;
import naderdeghaili.entities.VideoGame;

public class Application {

    public static void main(String[] args) {

        Game g1 = new VideoGame(1, "Call of Duty", 2025, 80, "MultiPlatform", 30, Genre.FPS);
        Game g2 = new VideoGame(2, "Fortnite", 2017, 0, "MultiPlatform", 100, Genre.TPS);
        Game g3 = new VideoGame(3, "Red Dead Redemption", 2020, 60, "MultiPlatform", 30, Genre.ACTION);
        Game g4 = new VideoGame(4, "Arc Raiders", 2025, 40, "MultiPlatform", 30, Genre.TPS);
        Game g5 = new VideoGame(5, "Expedition 66", 2024, 40, "MultiPlatform", 30, Genre.ADVENTURE);

        Game g6 = new TableGame(6, "Monopoly", 1935, 30, 4, 30);
        Game g7 = new TableGame(7, "Risk", 1959, 50, 4, 180);
        Game g8 = new TableGame(8, "Exploding Kittens", 2015, 20, 4, 20);
        Game g9 = new TableGame(9, "Hotel", 1974, 40, 4, 90);
        Game g10 = new TableGame(10, "Taboo", 1989, 20, 4, 30);


    }

}
