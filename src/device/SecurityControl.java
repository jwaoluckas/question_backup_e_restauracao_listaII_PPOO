package device;

import java.io.Serializable;

public class SecurityControl implements Serializable {

    private transient boolean armed;

    public void arm() {
        armed = true;
        System.out.println("SecurityControl: alarme armado");
    }

    public void disarm() {
        armed = false;
        System.out.println("SecurityControl: alarme desarmado");
    }
}
