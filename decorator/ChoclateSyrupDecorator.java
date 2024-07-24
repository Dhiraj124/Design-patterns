package dhiraj.design.decorator;

public class ChoclateSyrupDecorator extends IceCreamDecorator{
    IceCream iceCream;

    ChoclateSyrupDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + " with choclate syrup";
    }

    @Override
    int cost() {
        return iceCream.cost() + 5;
    }
}
