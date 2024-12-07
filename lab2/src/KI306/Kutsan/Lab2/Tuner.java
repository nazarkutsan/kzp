package KI306.Kutsan.Lab2;

/**
 * Клас Tuner моделює тюнер телевізора.
 */
public class Tuner {
    private int currentChannel = 1;

    public void setChannel(int channel) {
        this.currentChannel = channel;
    }

    public int getChannel() {
        return currentChannel;
    }
}
