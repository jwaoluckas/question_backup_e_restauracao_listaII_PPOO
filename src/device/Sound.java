package device;

import java.io.Serializable;

public class Sound implements Serializable {

    private transient boolean on;
    private transient String source = "nenhuma";
    private transient int volume;

    public void on() {
        on = true;
        System.out.println("Sound: ligado");
    }

    public void off() {
        on = false;
        System.out.println("Sound: desligado");
    }

    public void setCd() {
        source = "CD";
        System.out.println("Sound: fonte " + source);
    }

    public void setDvd() {
        source = "DVD";
        System.out.println("Sound: fonte " + source);
    }

    public void setRadio() {
        source = "Rádio";
        System.out.println("Sound: fonte " + source);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound: volume " + this.volume);
    }
}
