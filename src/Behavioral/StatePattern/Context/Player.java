package Behavioral.StatePattern.Context;

import Behavioral.StatePattern.States.ReadyState;
import Behavioral.StatePattern.States.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
   private State state;
   private boolean isPlaying = false;
   private List<String> playlist = new ArrayList<>();
   private int CurrentTrack = 0;


   public Player() {
       this.state= new ReadyState(this);
       setPlaying(true);
       for(int i = 1; i <= 5; i++)
       {
           playlist.add(STR."Track \{i}");
       }
   }


    public void changeState(State state) {
       this.state=state;
    }

    public State getState() {
        return state;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public String startPlayback() {
        return STR."playing \{playlist.get(CurrentTrack)}";
    }

    public String NextTrack()
    {
        CurrentTrack++;
        if(CurrentTrack > playlist.size())
        {
            CurrentTrack = 0;
        }
        return STR."playing \{playlist.get(CurrentTrack)}";
    }

    public String PreviousTrack()
    {
        CurrentTrack--;
        if(CurrentTrack < 0)
        {
            CurrentTrack = playlist.size()-1;
        }
        return STR."playing \{playlist.get(CurrentTrack)}";
    }

    public void setCurrentTrackAfterStop() {
        this.CurrentTrack = 0;
    }

}
