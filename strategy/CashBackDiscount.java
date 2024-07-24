package dhiraj.design.strategy;

public class CashBackDiscount implements DiscountStratergy{
    @Override
    public void giveDiscount() {
        System.out.println("Giving 10$ cashback");
    }
}
