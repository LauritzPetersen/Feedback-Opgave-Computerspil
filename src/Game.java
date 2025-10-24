// Game klasse med 4 attributes

public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;


    //overloaded konstruktører

    /* konstruktør med "default" værdier hvis ingen værdier er
    givet ved oprettelsen af et Game objekt */

    public Game(){
        this(0, "Unknown", "Unknown", 20.00);
    }

    /* konstruktør med 3 "default" værdier hvis kun gameId
    værdien er oplyst i oprettelse af et Game objekt */

    public Game(int gameId){
        this(gameId, "Unknown", "Unknown", 20.00);
    }

    /* konstruktør med 2 "default" værdier hvis kun gameId og
     title er oplyst i oprettelse af et Game objekt */

    public Game(int gameId, String title){
        this(gameId, title, "Unknown", 20.00);
    }

    /* konstruktør med en enkelt "default" værdi hvis ikke
     price værdien er oplyst i oprettelse af et Game objekt */

    public Game(int gameId, String title, String genre){
        this(gameId, title, genre, 20.00);
    }

    /* Primær konstruktør hvor alle værdier er oplyst ved
    oprettelse af et Game objekt */

    public Game(int gameId, String title, String genre, double price){
        this.setGameId(gameId);
        this.setTitle(title);
        this.setGenre(genre);
        this.setPrice(price);
    }


    // setters for vores attributes
    public void setGameId(int gameId){
        this.gameId = gameId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setPrice(double price){
        this.price = price;
    }


    // getters for vores attributes
    public int getGameId() {
        return gameId;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }


    // Override metode til at vise Game objektets informationer
    @Override
    public String toString(){
        return  "Game ID: " + gameId + "\n" +
                "Title: " + title + "\n" + "" +
                "Genre: " + genre + "\n" +
                "Price: $" + price + "\n" +
                "-----------------------";
    }
}
