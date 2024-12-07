package KI306.Kutsan.Lab3;

/**
 * Клас TelevisionApp тестує функціональність телевізора з тюнером.
 */
public class TelevisionApp {
    public static void main(String[] args) {
        TelevisionWithTuner tv = new TelevisionWithTuner("Samsung", 42.0);

        tv.turnOn();
        tv.changeChannel(5);
        tv.setFrequency(98.7);
        tv.showInfo();
        tv.turnOff();
    }
}
