package dhiraj.design.decorator;

public class ButtorScotchIceCream extends IceCream{

    @Override
    String getDescription() {
        return "Buttor";
    }

    @Override
    int cost() {
        return 20;
    }
}
