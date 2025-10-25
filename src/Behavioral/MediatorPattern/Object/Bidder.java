package Behavioral.MediatorPattern.Object;

import Behavioral.MediatorPattern.Mediator.AuctionMediator;

public class Bidder implements Collegue{
    AuctionMediator mediator;
    private String name;

    public Bidder(AuctionMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addBidder(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void placeBid( int amount) {
        mediator.placeBid(this , amount);
    }

    @Override
    public void recieveBidNotifications(int amount) {
        System.out.println(STR."Bidder \{name} got the notification that someone has bid up \{amount}");
    }
}
