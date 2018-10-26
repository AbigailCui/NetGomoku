package entity.human;

import core.GameInfo;
import core.GameState;
import core.Move;
import entity.Player;

public class HumanPlayer extends Player {
    private Move move;

    public HumanPlayer(GameInfo gameInfo){super(gameInfo);}

    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public Move getMove(GameState state) {
        try {
            synchronized (this){
                this.wait();
            }
        }catch (InterruptedException e){
            return null;
        }
        return move;
    }

}
