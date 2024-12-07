package KI306.Kutsan.Lab3;

/**
 * Абстрактний клас AbstractTelevision описує базову функціональність телевізора.
 */
public abstract class AbstractTelevision {
    private String brand;
    private double screenSize;

    public AbstractTelevision(String brand, double screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void changeChannel(int channel);
}
