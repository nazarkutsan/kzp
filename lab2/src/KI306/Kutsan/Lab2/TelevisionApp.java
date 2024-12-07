package KI306.Kutsan.Lab2;

/**
 * Клас TelevisionApp тестує функціональність телевізора.
 */
public class TelevisionApp {
    public static void main(String[] args) {
        try {
            Television tv = new Television();
            tv.turnOn();
            tv.changeChannel(5);
            tv.adjustVolume(15);
            tv.showInfo();
            tv.turnOff();
            tv.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
