public class ShopiPay extends Emoney {
    public ShopiPay() {
        this.name = "ShopiPay";
    }

    @Override
    public void topUp(double amount) {
        System.out.println("Top up: " + amount);
        this.balance += (amount + (0.05 * amount));
        this.balance();
    }

    @Override
    public void pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Pay " + amount + " using " + this.name);
        } else {
            System.out.println("Not enough balance.");
        }
        this.balance();
    }
}
