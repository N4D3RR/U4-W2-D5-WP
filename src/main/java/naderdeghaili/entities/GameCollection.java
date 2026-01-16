package naderdeghaili.entities;

import java.util.*;
import java.util.stream.Collectors;

public class GameCollection {

    Map<Integer, Game> games = new HashMap<>();

    public void addGame(Game game) {
        int id = game.getID();

        if (games.containsKey(id)) {
            throw new IllegalArgumentException("il gioco è già presente nella collezione");
        } else {
            games.put(id, game);
        }
    }

    public Game getById(int id) {
        if (games.containsKey(id)) {
            return games.get(id);
        } else {
            throw new IllegalArgumentException("il gioco non è presente nella collezione");
        }
    }

    public List<Game> getGamesWithPriceLowerThan(double price) {
        return games.values()
                .stream()
                .filter(game -> game.getPrice() < price)
                .toList();
    }

    public List<Game> getGamesPerPlayers(int players) {
        return games.values()
                .stream()
                .filter(game -> game instanceof TableGame)
                .filter(tableGame -> ((TableGame) tableGame).getNumberOfPlayers() >= players).toList();
    }

    public void removeById(int id) {
        if (games.containsKey(id)) {
            games.remove(id);
        } else {
            throw new IllegalArgumentException("il gioco non è presente nella collezione");
        }

    }

    public void updateById(int id, Game newGame) {
        if (games.containsKey(id)) {
            games.put(id, newGame);
        } else {
            throw new IllegalArgumentException("il gioco non è presente nella collezione");
        }

    }

    public void printGameStatistics() {

        long videoGames = games.values()
                .stream()
                .filter(game -> game instanceof VideoGame)
                .count();
        long tableGames = games.values()
                .stream()
                .filter(game -> game instanceof TableGame)
                .count();
//          List<Game> highestPrice = games.values().stream().sorted(Comparator.comparing(Game::getPrice)).limit(1).toList().reversed();
        Optional<Game> highestPrice = games.values()
                .stream()
                .max(Comparator.comparing(Game::getPrice));
        double averagePrice = games.values()
                .stream()
                .collect(Collectors.averagingDouble(Game::getPrice));

        System.out.println("i videogiochi sono: " + videoGames);
        System.out.println("i giochi da tavolo sono: " + tableGames);
        System.out.println("il gioco con il prezzo più alto è: " + highestPrice.map(Game::getTitle).orElse("Non ci sono giochi nella collezione"));
        System.out.println("il prezzo medio dei giochi è: " + averagePrice + "€");
    }
}




