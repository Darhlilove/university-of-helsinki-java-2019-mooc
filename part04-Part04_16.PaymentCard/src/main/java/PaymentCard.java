/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darhlilove
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        double amount = 2.6;
        if (this.balance < amount) {
            return;
        }

        this.balance -= amount;
    }

    public void eatHeartily() {
        double amount = 4.6;
        if (this.balance < amount) {
            return;
        }

        this.balance -= amount;
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }

        if (this.balance + amount > 150) {
            this.balance = 150;
            return;
        }
        
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
