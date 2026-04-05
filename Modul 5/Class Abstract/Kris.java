public class Kris extends Emoney {
    public Kris() {
        this.name = "Kris";
    }

    @Override
    public void topUp(double amount) {
        System.out.println("Top up: " + amount);
        // Bonus 5% saat deposit
        double bonus = 0.05 * amount;
        this.balance += (amount + bonus);
        this.balance();
    }

    @Override
    public void pay(double amount) {
        // Diskon 3% saat pembayaran
        double discount = 0.03 * amount;
        double amountToPay = amount - discount;

        if (this.balance >= amountToPay) {
            this.balance -= amountToPay;
            System.out.println("Pay " + amount + " using " + this.name + " (Discount applied)");
        } else {
            System.out.println("Not enough balance.");
        }
        this.balance();
    }
}


