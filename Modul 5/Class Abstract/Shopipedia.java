public class Shopipedia {
    public static void main(String[] args) {
        ShopiPay shopiCard = new ShopiPay();
        Customer miki = new Customer(shopiCard);
        miki.deposit(10000);
        miki.pay(2000);
        miki.pay(3000);
        miki.deposit(1000);
        miki.pay(7000);

        System.out.println("------------------");

        Opo opoCard = new Opo();
        Customer dono = new Customer(opoCard);
        dono.deposit(10000);
        dono.pay(2000);
        dono.pay(3000);
        dono.deposit(1000);
        dono.pay(7000);
    
        System.out.println("------------------");
        // Implementasi Kris menggunakan Anonymous Inner Class
        Emoney krisCard = new Emoney() {
            {
                this.name = "Kris";
            }

            @Override
            public void topUp(double amount) {
                System.out.println("Top up: " + amount);
                this.balance += (amount + (0.05 * amount));
                this.balance();
            }

            @Override
            public void pay(double amount) {
                double amountToPay = amount - (0.03 * amount);
                if (this.balance >= amountToPay) {
                    this.balance -= amountToPay;
                    System.out.println("Pay " + amount + " using " + this.name);
                } else {
                    System.out.println("Not enough balance.");
                }
                this.balance();
            }
        };
        // Digunakan sebagai Customer
        Customer vio = new Customer(krisCard);
        vio.deposit(10000);
        vio.pay(2000);
        vio.pay(3000);
        vio.deposit(1000);
        vio.pay(7000);

    }
}

