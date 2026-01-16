package naderdeghaili.entities;

public class TableGame extends Game {
    private int numberOfPlayers;
    private int durationInMinutes;

    public TableGame(int ID, String title, int yearPublished, double price, int numberOfPlayers, int durationInMinutes) {
        super(ID, title, yearPublished, price);
        setNumberOfPlayers(numberOfPlayers);
        this.durationInMinutes = durationInMinutes;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers < 2 || numberOfPlayers > 10) {
            throw new IllegalArgumentException("Number of players must be between 2 and 10");
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
