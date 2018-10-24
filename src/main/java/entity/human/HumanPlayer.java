package entity.human;

import core.GameInfo;
import core.Move;
import entity.Player;

public class HumanPlayer extends Player {
    private Move move;

    public HumanPlayer(GameInfo gameInfo){super(gameInfo);}


    @Override
    public Move getMove() {
        return null;
    }
}
