package Behavioral.MediatorPattern.Mediator;

import Behavioral.MediatorPattern.Object.Collegue;

public interface AuctionMediator {
    public void placeBid(Collegue collegue ,int amount);
    public void addBidder(Collegue collegue);
}
