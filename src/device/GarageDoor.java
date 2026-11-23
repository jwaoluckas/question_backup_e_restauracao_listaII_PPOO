package device;

import java.io.Serializable;

public class GarageDoor implements Serializable {

    private transient String state = "fechada";

    public void up() {
        state = "aberta";
        System.out.println("GarageDoor: " + state);
    }

    public void down() {
        state = "fechada";
        System.out.println("GarageDoor: " + state);
    }

    public void stop() {
        state = "parada";
        System.out.println("GarageDoor: " + state);
    }
}
