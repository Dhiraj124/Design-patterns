package dhiraj.design.strategy;

public class FlatDiscount implements DiscountStratergy{
    @Override
    public void giveDiscount() {
        System.out.println("Giving flat discount");
    }
}
