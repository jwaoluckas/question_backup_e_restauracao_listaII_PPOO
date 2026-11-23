package device;

import java.io.Serializable;

public class TV implements Serializable {

    private transient boolean on;
    private transient int channel;
    private transient int volume;

    public void on() {
        on = true;
        System.out.println("TV: ligada");
    }

    public void off() {
        on = false;
        System.out.println("TV: desligada");
    }

    public void setInputChannel(int channel) {
        this.channel = channel;
        System.out.println("TV: canal " + this.channel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV: volume " + this.volume);
    }
}
