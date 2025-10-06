
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance(){
        if (day == 30 && month == 12) {
            this.day = 1;
            this.month = 1;
            this.year += 1;
            return;
        }
        
        if (day == 30) {
            this.day = 1;
            this.month += 1;
            return;
        }
        
        this.day += 1;    
    }
    
    public void advance(int howManyDays){
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }
            
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
