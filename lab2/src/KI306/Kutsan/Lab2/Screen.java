package KI306.Kutsan.Lab2;

/**
 * Клас Screen моделює екран телевізора.
 */
public class Screen {
    private String resolution = "1920x1080";
    private double size = 32.0;

    public String getInfo() {
        return size + " inch, " + resolution;
    }
}
