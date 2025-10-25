package Behavioral.MediatorPattern.Mediator;

import Behavioral.MediatorPattern.Object.Collegue;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements AuctionMediator {

    List<Collegue> collegues = new ArrayList<>();

    @Override
    public void placeBid(Collegue bidder, int amount) {
        for (Collegue collegue : collegues) {
            if (!collegue.equals(bidder)) {
                collegue.recieveBidNotifications(amount);
            }
        }
    }

    @Override
    public void addBidder(Collegue collegue) {
        collegues.add(collegue);
    }
}
