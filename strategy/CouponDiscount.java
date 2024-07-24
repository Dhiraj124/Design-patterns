package dhiraj.design.strategy;

public class CouponDiscount implements DiscountStratergy{
    @Override
    public void giveDiscount() {
        System.out.println("Giving 50$ coupon");
    }
}
