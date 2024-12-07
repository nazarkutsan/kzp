package KI306.Kutsan.Lab3;

/**
 * Клас TelevisionWithTuner реалізує телевізор з тюнером.
 */
public class TelevisionWithTuner extends AbstractTelevision implements TunerControl {
    private boolean isOn;
    private int currentChannel;
    private double tunerFrequency;

    public TelevisionWithTuner(String brand, double screenSize) {
        super(brand, screenSize);
        this.isOn = false;
        this.currentChannel = 1;
        this.tunerFrequency = 0.0;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Телевізор увімкнено.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Телевізор вимкнено.");
    }

    @Override
    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Канал змінено на " + channel);
        } else {
            System.out.println("Спочатку увімкніть телевізор.");
        }
    }

    @Override
    public void setFrequency(double frequency) {
        this.tunerFrequency = frequency;
        System.out.println("Частоту тюнера встановлено на " + frequency + " MHz.");
    }

    @Override
    public double getFrequency() {
        return tunerFrequency;
    }

    public void showInfo() {
        System.out.println("Бренд: " + getBrand());
        System.out.println("Розмір екрану: " + getScreenSize() + " дюймів");
        System.out.println("Поточний канал: " + currentChannel);
        System.out.println("Частота тюнера: " + tunerFrequency + " MHz");
    }
}

