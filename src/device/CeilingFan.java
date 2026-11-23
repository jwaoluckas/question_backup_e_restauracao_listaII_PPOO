package device;

import java.io.Serializable;

public class CeilingFan implements Serializable {

    private transient int speed;

    public void high() {
        speed = 3;
        System.out.println("CeilingFan: velocidade alta");
    }

    public void medium() {
        speed = 2;
        System.out.println("CeilingFan: velocidade média");
    }

    public void low() {
        speed = 1;
        System.out.println("CeilingFan: velocidade baixa");
    }

    public void off() {
        speed = 0;
        System.out.println("CeilingFan: desligado");
    }

    public int getSpeed() {
        return speed;
    }
}
