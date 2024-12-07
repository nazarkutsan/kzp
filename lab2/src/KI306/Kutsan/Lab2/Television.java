package KI306.Kutsan.Lab2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас Television моделює телевізор.
 */
public class Television {
    private Screen screen;
    private Tuner tuner;
    private Remote remote;
    private FileWriter log;

    public Television() throws IOException {
        this.screen = new Screen();
        this.tuner = new Tuner();
        this.remote = new Remote();
        this.log = new FileWriter("television.log", true);
    }

    public Television(Screen screen, Tuner tuner, Remote remote) throws IOException {
        this.screen = screen;
        this.tuner = tuner;
        this.remote = remote;
        this.log = new FileWriter("television.log", true);
    }

    public void turnOn() throws IOException {
        log.write("Television is turned on.\n");
        log.flush();
    }

    public void turnOff() throws IOException {
        log.write("Television is turned off.\n");
        log.flush();
    }

    public void changeChannel(int channel) throws IOException {
        tuner.setChannel(channel);
        log.write("Channel changed to " + channel + ".\n");
        log.flush();
    }

    public void adjustVolume(int volume) throws IOException {
        remote.setVolume(volume);
        log.write("Volume adjusted to " + volume + ".\n");
        log.flush();
    }

    public void showInfo() throws IOException {
        log.write("Screen Info: " + screen.getInfo() + "\n");
        log.write("Current Channel: " + tuner.getChannel() + "\n");
        log.flush();
    }

    public void dispose() throws IOException {
        log.close();
    }
}
