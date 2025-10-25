import Behavioral.StatePattern.Context.Player;
import Behavioral.StatePattern.States.State;

static void main() {
    Player player = new Player();
    State s = player.getState();


System.out.println(STR."Initial State: \{s.getClass().getSimpleName()}");

    System.out.println(s.OnPrevious());
    System.out.println(s.OnNext());
    System.out.println(s.OnPlay());

    // update the state reference after state change
    s = player.getState();
    System.out.println(STR."State after Play: \{s.getClass().getSimpleName()}");

    System.out.println(s.OnNext());
    System.out.println(s.OnPrevious());
    System.out.println(s.OnLock());

    s = player.getState();
   System.out.println(STR."State after Lock: \{s.getClass().getSimpleName()}");
}