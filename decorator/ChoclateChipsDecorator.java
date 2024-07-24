package dhiraj.design.decorator;

public class ChoclateChipsDecorator extends IceCreamDecorator{

    IceCream iceCream;
    ChoclateChipsDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + " with Choco Chips";
    }

    @Override
    int cost() {
        return iceCream.cost() + 4;
    }
}
