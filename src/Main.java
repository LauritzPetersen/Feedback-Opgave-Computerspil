public class Main {
    public static void main(String[] args) {

        GameSystem gameSystem = new GameSystem(10, 10);

        // Tilføjer spil til vores array i GameSystem
        gameSystem.addGame(new Game(1, "World of Warcraft", "MMORPG", 29.99));
        gameSystem.addGame(new Game(2, "Minecraft", "Survival"));
        gameSystem.addGame(new Game(3));
        gameSystem.addGame(new Game(4, "Blue Prince", "Puzzle", 19.99));
        gameSystem.addGame(new Game(5, "The Witcher 3", "RPG", 39.99));
        gameSystem.addGame(new Game(6));


        // Tilføjer spillere til vores array i GameSystem
        gameSystem.addPlayer(new Player(1, "Lars", 25, 1500.0));
        gameSystem.addPlayer(new Player(2, "Hans"));
        gameSystem.addPlayer(new Player(3, "Brian", 30));
        gameSystem.addPlayer(new Player(4, "Otto", 22, 2000.0));
        gameSystem.addPlayer(new Player(5, "Karl", 28));

        // Opdaterer en players score
        gameSystem.updatePlayerScore(4, 23.0);

        // Søger efter et spil findes ved det givne ID
        gameSystem.findGameById(4);

        // Søger om en spiller findes ved det givne ID
        gameSystem.findPlayerById(1);

        // Beregner den totale indtjening fra alle spil
        gameSystem.calculateTotalRevenue();

        // Finder den spiller med den højeste score
        gameSystem.findTopScoringPlayer();

        // printer alle spil og spillere i vores console
        gameSystem.displayAllGames();
        gameSystem.displayAllPlayers();








    }
}