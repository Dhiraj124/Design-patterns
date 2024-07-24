package dhiraj.design.decorator;

public class RainbowSprinkleDecorator extends IceCreamDecorator{
    IceCream iceCream;
    RainbowSprinkleDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    String getDescription() {
        return iceCream.getDescription() + " with Rainbow Sprinkler";
    }

    @Override
    int cost() {
        return iceCream.cost() + 10;
    }
}
