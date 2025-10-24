// GameSystem klasse med 4 attributes
public class GameSystem {

    private Game[] games = new Game[3];
    private Player[] players = new Player[3];
    private int gameCount;
    private int playerCount;

    // overloaded konstruktører

    // default konstruktør med 3 pladser til både spil og spillere
    public GameSystem(){}


    // Konstruktør der tillader specificering af størrelsen på arrays
    public GameSystem(int maxGames, int maxPlayers){
        this.games = new Game[maxGames];
        this.players = new Player[maxPlayers];
    }

    // Metode til at tilføje et spil til Game Arrayet
    public void addGame(Game game){
        if(gameCount < games.length){
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Cannot add more games, array is full.");
        }
    }

    // Metode til at tilføje en spiller til Player Arrayet
    public void addPlayer(Player player){
        if(playerCount < players.length){
            players[playerCount] = player;
            playerCount ++;
        }
        else{
            System.out.println("Cannot add more players, array is full.");
        }
    }


    // Metode til at vise alle spil i Game Arrayet
    public void displayAllGames(){
        for(Game game : games){
            if(game != null){
                System.out.println(game);
            }
        }
    }


    // Metode til at vise alle spillere i Player Arrayet
    public void displayAllPlayers(){
        for(Player player : players){
            if(player != null){
                System.out.println(player);
            }
        }
    }


    // Metode til at opdatere en spillers score baseret på deres ID
    public void updatePlayerScore(int playerId, double score){
        for(Player player : players){
            if(player != null && player.getPlayerId() == playerId){
                player.updateScore(score);
                System.out.println("Updated score for player ID " + playerId + " to " + score + "\n");
                return;
            }
        }
        System.out.println("Player with ID " + playerId + " not found.");
    }


    // Metode til at finde et spil baseret på dets ID
    public Game findGameById(int gameId){
        for(Game game : games){
            if(game != null && game.getGameId() == gameId){
                System.out.println("Found game with ID " + gameId + ": " + game.getTitle() + "\n");
                return game;
            }
        }
        return null;
    }


    // Metode til at finde en spiller baseret på deres ID
    public Player findPlayerById(int playerId){
        for(Player player : players){
            if(player != null && player.getPlayerId() == playerId){
                System.out.println("Found player with ID " + playerId + ": " + player.getPlayerName() + "\n");
                return player;
            }
        }
        return null;
    }


    // Metode til at beregne samlede indkomst fra alle spil
    public double calculateTotalRevenue(){
        double total = 0.0;
        for(Game game : games){
            if (game != null){
                total += game.getPrice();
            }
        }
        System.out.println("Total revenue from all games is: " + total + "$ \n");
        return total;
    }


    // Metode til at finde den spiller med højeste score
    public Player findTopScoringPlayer(){
        Player topPlayer = null;
        double highestScore = -1.0;
        for(Player player : players){
            if(player != null && player.getScore() > highestScore) {
                highestScore = player.getScore();
                topPlayer = player;
                System.out.println("Top scoring player is " + topPlayer.getPlayerName() + " with score " + highestScore + "\n");
            }
        }
        return topPlayer;
    }



}
