package command;

import device.Hottub;

public class HottubCommand implements Command {

    public enum Action { CIRCULATE, JETS_ON, JETS_OFF, TEMPERATURE }

    private final Hottub hottub;
    private final Action action;
    private final int value;

    public HottubCommand(Hottub hottub, Action action) {
        this(hottub, action, 0);
    }

    public HottubCommand(Hottub hottub, Action action, int value) {
        this.hottub = hottub;
        this.action = action;
        this.value = value;
    }

    @Override
    public void execute() {
        switch (action) {
            case CIRCULATE -> hottub.circulate();
            case JETS_ON -> hottub.jetsOn();
            case JETS_OFF -> hottub.jetsOff();
            case TEMPERATURE -> hottub.setTemperature(value);
        }
    }
}
