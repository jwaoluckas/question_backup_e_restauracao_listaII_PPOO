package device;

import java.io.Serializable;

public class Hottub implements Serializable {

    private transient boolean circulating;
    private transient boolean jets;
    private transient int temperature;

    public void circulate() {
        circulating = true;
        System.out.println("Hottub: circulando água");
    }

    public void jetsOn() {
        jets = true;
        System.out.println("Hottub: jatos ligados");
    }

    public void jetsOff() {
        jets = false;
        System.out.println("Hottub: jatos desligados");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Hottub: temperatura " + this.temperature);
    }
}
