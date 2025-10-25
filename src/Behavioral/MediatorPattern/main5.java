import Behavioral.MediatorPattern.Mediator.AuctionMediator;
import Behavioral.MediatorPattern.Mediator.ConcreteMediator;
import Behavioral.MediatorPattern.Object.Bidder;

void main() {
    ConcreteMediator concreteMediator = new ConcreteMediator();
    Bidder b1 = new Bidder( concreteMediator,"Tareq");
    Bidder b2 = new Bidder( concreteMediator,"Mehedi");
    Bidder b3 = new Bidder( concreteMediator,"Hasan");
    b1.placeBid(500);
    b2.placeBid(550);
    b3.placeBid(600);
}
