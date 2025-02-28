package HW1;
import java.util.*;
public class GameEventManager {
    private final List<GameObserver> players = new ArrayList<>();

    public void addPlayer(GameObserver player) {
        players.add(player);
    }

    public void notifyPlayers(String event) {
        for (GameObserver player : players) {
            player.update(event);
        }
    }
}