package entity;

import core.GameInfo;
import core.GameState;
import core.Move;

public abstract class Player {

    protected final GameInfo info;

    public abstract Move getMove(GameState state);

    public Player(GameInfo info){
        this.info = info;
    }


}
