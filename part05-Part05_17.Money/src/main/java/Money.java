
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        int thisInCents = (this.euros * 100) + this.cents;
        int comparedInCents = (compared.euros * 100) + compared.cents;

        return thisInCents < comparedInCents;
    }

    public Money minus(Money decreaser) {
        int thisInCents = (this.euros * 100) + this.cents;
        int decreaserInCents = (decreaser.euros * 100) + decreaser.cents;

        int difference = Math.max(0, thisInCents - decreaserInCents);

        return new Money(difference / 100, difference % 100);
    }
}
