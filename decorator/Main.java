package dhiraj.design.decorator;

public class Main {
    public static void main(String[] args) {

        IceCream iceCream = new ButtorScotchIceCream();
        iceCream = new ChoclateSyrupDecorator(new ChoclateChipsDecorator(iceCream));
        print(iceCream);
    }
    static void print(IceCream icecream) {
        System.out.println("Desc: " + icecream.getDescription());
        System.out.println("Cost: " + icecream.cost());
    }
}
