package Behavioral.StatePattern.States;

import Behavioral.StatePattern.Context.Player;

public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
    }
    @Override
    public String OnPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String OnLock() {
        player.changeState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String OnNext() {
        return "Not Available";
    }

    @Override
    public String OnPrevious() {
        return "Not Available";
    }
}
