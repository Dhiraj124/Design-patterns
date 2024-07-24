package dhiraj.design.strategy;

public class ApplyDiscount {
    DiscountStratergy discountStratergy;

    public ApplyDiscount(DiscountStratergy d) {
        this.discountStratergy = d;
    }

    void getDiscount() {
        discountStratergy.giveDiscount();
    }

    void setStrategy(DiscountStratergy d) {
        this.discountStratergy = d;
    }
}
