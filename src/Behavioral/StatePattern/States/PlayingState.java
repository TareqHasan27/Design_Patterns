package Behavioral.StatePattern.States;

import Behavioral.StatePattern.Context.Player;

public class PlayingState extends State {

    PlayingState(Player player) {
        super(player);
    }
    @Override
    public String OnPlay() {
        player.changeState(new ReadyState(player));
        return "Paused";
    }

    @Override
    public String OnLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stopped";
    }

    @Override
    public String OnNext() {
        return player.NextTrack();
    }

    @Override
    public String OnPrevious() {
        return player.PreviousTrack();
    }
}
