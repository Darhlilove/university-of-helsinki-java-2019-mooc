
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money += 1000;
    }

    public double eatAffordably(double payment) {
        return cashTransaction(2.5, payment, "affordable");
    }

    public double eatHeartily(double payment) {
        return cashTransaction(4.3, payment, "hearty");
    }

    public boolean eatAffordably(PaymentCard card) {
        return cardTransaction(2.5, card, "affordable");
    }

    public boolean eatHeartily(PaymentCard card) {
        return cardTransaction(4.3, card, "hearty");
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    private double cashTransaction(double price, double payment, String mealType) {
        if (payment >= price) {
            this.money += price;

            switch (mealType) {
                case "affordable":
                    this.affordableMeals++;
                    break;
                case "hearty":
                    this.heartyMeals++;
                    break;
                default:

            }

            return payment - price;
        }

        return payment;
    }

    private boolean cardTransaction(double price, PaymentCard card, String mealType) {
        if (card.balance() >= price) {
            card.takeMoney(price);

            switch (mealType) {
                case "affordable":
                    this.affordableMeals++;
                    break;
                case "hearty":
                    this.heartyMeals++;
                    break;
                default:

            }
            return true;
        }

        return false;
    }
}
