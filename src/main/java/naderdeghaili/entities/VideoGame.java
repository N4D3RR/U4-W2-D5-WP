package naderdeghaili.entities;

public class VideoGame extends Game {
    private String platform;
    private int durationInHours;
    private Genre genre;

    public VideoGame(int ID, String title, int yearPublished, double price, String platform, int durationInHours, Genre genre) {
        super(ID, title, yearPublished, price);
        this.platform = platform;
        this.durationInHours = durationInHours;
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
