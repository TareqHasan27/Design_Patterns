package Behavioral.StatePattern.States;

import Behavioral.StatePattern.Context.Player;

public class LockedState extends State {

    LockedState(Player p) {
        super(p);
        p.setPlaying(false);
    }
    @Override
    public String OnPlay() {
        player.changeState(new ReadyState(player));
        return "Playing";
    }

    @Override
    public String OnLock() {
        if(player.isPlaying()){
            player.changeState(new ReadyState(player));
            return "Playing";
        }
        return "Locked";
    }

    @Override
    public String OnNext() {
        return "Play a song first";
    }

    @Override
    public String OnPrevious() {
        return "Play a song first";
    }
}
