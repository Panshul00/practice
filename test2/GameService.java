
import java.util.ArrayList;
import java.util.List;
class GameService {
    private static ArrayList<Game> games = new ArrayList<>();
    public GameService() {
        games.add(new Game("SnowBird", "Danny", 300));
        games.add(new Game("FreshFood", "Ram", 450));
        games.add(new Game("Batsman", "Kate", 400));
        games.add(new Game("Pokiman", "Steeve", 600));
        games.add(new Game("YammyTommy", "Narayan", 350));
    }

    public List<Game> viewAll() {
        return games;
    }

    public String authorSearch(String author) {
        return games.stream()
                .filter(game -> game.getAuthorName().equalsIgnoreCase(author))
                .map(Game::getGameName)
                .findFirst()
                .orElse("NOT FOUND");
    }
}
