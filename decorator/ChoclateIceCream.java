package dhiraj.design.decorator;

public class ChoclateIceCream extends IceCream{
    @Override
    String getDescription() {
        return "Choclate";
    }

    @Override
    int cost() {
        return 30;
    }
}
