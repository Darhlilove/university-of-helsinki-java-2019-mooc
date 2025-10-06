
/**
 *
 * @author darhlilove
 */
public class Timer {

    ClockHand hundredSeconds = new ClockHand(100);
    ClockHand seconds = new ClockHand(60);

    public String toString() {
        return seconds + ":" + hundredSeconds;
    }

    public void advance() {
        hundredSeconds.advance();

        if (hundredSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
}
