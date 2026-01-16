package naderdeghaili.entities;

public abstract class Game {
    private final int ID;
    private String title;
    private int yearPublished;
    private double price;

    public Game(int ID, String title, int yearPublished, double price) {
        this.ID = ID;
        this.title = title;
        this.yearPublished = yearPublished;
        setPrice(price);
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be equal or more than 0");
        }
        this.price = price;
    }

}
