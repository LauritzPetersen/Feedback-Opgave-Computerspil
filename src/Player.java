// Player klasse med 4 attributes

public class Player {
    private int playerId;
    private String playerName;
    private int age;
    private double score;


    //overloaded konstruktører

    /* konstruktør med "default" værdier hvis ingen værdier er
    givet ved oprettelsen af et Player objekt */

    public Player() {
        this(0, "guest", 18, 0.0);
    }

    /* konstruktør med 3 "default" værdier hvis kun playerId
    værdien er oplyst i oprettelse af et Player objekt */

    public Player(int playerId) {
        this(playerId, "guest", 18, 0.0);
    }
    /* konstruktør med 2 "default" værdier hvis kun playerId og
     playerName er oplyst i oprettelse af et Player objekt */

    public Player(int playerId, String playerName) {
        this(playerId, playerName, 18, 0.0);
    }

    /* konstruktør med en enkelt "default" værdi hvis ikke
     score værdien er oplyst i oprettelse af et Player objekt */

    public Player(int playerId, String playerName, int age) {
        this(playerId, playerName, age, 0.0);
    }

    /* Primær konstruktør hvor alle værdier er oplyst ved
    oprettelse af et Player objekt */

    public Player(int playerId, String playerName, int age, double score) {
        this.setPlayerId(playerId);
        this.setPlayerName(playerName);
        this.setAge(age);
        this.setScore(score);
    }


    // setters for vores attributes
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }


    // getters for vores attributes
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }


    //Override metode til at display player details
    @Override
    public String toString(){
        return "Player ID: " + playerId + "\n" +
                "Player Name: " + playerName + "\n" +
                "Age: " + age + "\n" +
                "Score: " + score + "\n" +
                "-----------------------";
    }

    // metode til at opdatere score
    public void updateScore(double score) {
        this.score = score;
    }
}