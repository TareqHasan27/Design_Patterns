package Behavioral.StatePattern.States;

import Behavioral.StatePattern.Context.Player;

public abstract class State {
    Player player;
    State(Player player) {
        this.player = player;
    }
    public abstract String OnPlay();
    public abstract String OnLock();
    public abstract String OnNext();
    public abstract String OnPrevious();


}
