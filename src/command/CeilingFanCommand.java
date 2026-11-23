package command;

import device.CeilingFan;

public class CeilingFanCommand implements Command {

    public enum Action { HIGH, MEDIUM, LOW, OFF }

    private final CeilingFan fan;
    private final Action action;

    public CeilingFanCommand(CeilingFan fan, Action action) {
        this.fan = fan;
        this.action = action;
    }

    @Override
    public void execute() {
        switch (action) {
            case HIGH -> fan.high();
            case MEDIUM -> fan.medium();
            case LOW -> fan.low();
            case OFF -> fan.off();
        }
    }
}
