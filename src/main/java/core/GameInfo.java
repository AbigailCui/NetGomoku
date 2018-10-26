package core;

public class GameInfo {
    private final GameSetings settings;
    private int gameTimeRemaining;
    private int playerIndex;
    private int opponentIndex;

    public GameInfo(GameSetings settings, int gameTimeRemaining, int playerIndex, int opponentIndex) {
        this.settings = settings;
        this.gameTimeRemaining = gameTimeRemaining;
        this.playerIndex = playerIndex;
        this.opponentIndex = opponentIndex;
    }

    public int getGameTimeRemaining() {
        return gameTimeRemaining;
    }

    public int getPlayerIndex() {
        return playerIndex;
    }

    public int getOpponentIndex() {
        return opponentIndex;
    }

    public int getSize(){
        return settings.getSize();
    }
}
