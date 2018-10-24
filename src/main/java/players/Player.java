package players;

import core.GameInfo;
import core.Move;

public abstract class Player {

    protected final GameInfo info;

    public abstract Move getMove();

    public Player(GameInfo info){
        this.info = info;
    }

}
