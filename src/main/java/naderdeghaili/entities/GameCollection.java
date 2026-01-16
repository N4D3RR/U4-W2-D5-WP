package naderdeghaili.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCollection {

    Map<Integer, Game> games = new HashMap<>();

    public void addGame(Game game) {
      int id = game.getID();

      if (games.containsKey(id))
      {throw new IllegalArgumentException("il gioco è già presente nella collezione");}
      else{ games.put(id, game);}
    }

    public Game getById(int id) {
        if (games.containsKey(id)){
        return games.get(id);}
        else {throw new IllegalArgumentException("il gioco non è presente nella collezione");}
    }

    public List<Game> getGamesWithPriceLowerThan(double price) {
        return
    }

    public List<TableGame> getGamesPerPlayers(int players) {
        return
    }

    public void removeById(int id) {
        if (games.containsKey(id))
        {games.remove(id);}
        else {throw new IllegalArgumentException("il gioco non è presente nella collezione");}

    }

    public void updateById(int id, Game newGame) {
        if (games.containsKey(id))
        {games.put(id, newGame);}
        else {throw new IllegalArgumentException("il gioco non è presente nella collezione");}

    }

    public void printGameStatistics() {
    }


}
