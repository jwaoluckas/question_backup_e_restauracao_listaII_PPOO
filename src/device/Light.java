package device;

import java.io.Serializable;

public class Light implements Serializable {

    private transient boolean on;

    public void on() {
        on = true;
        System.out.println("Light: acesa");
    }

    public void off() {
        on = false;
        System.out.println("Light: apagada");
    }
}
