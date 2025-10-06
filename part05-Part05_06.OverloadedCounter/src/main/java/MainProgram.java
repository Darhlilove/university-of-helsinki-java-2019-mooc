
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter();
        
        counter.increase();
        counter.increase(5);
        counter.decrease();
        counter.increase(2);
        System.out.println("Value: " + counter.value());
    }
}
