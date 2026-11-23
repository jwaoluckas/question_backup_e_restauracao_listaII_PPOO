package command;

import device.Light;

public class LightCommand implements Command {

    public enum Action { ON, OFF }

    private final Light light;
    private final Action action;

    public LightCommand(Light light, Action action) {
        this.light = light;
        this.action = action;
    }

    @Override
    public void execute() {
        switch (action) {
            case ON -> light.on();
            case OFF -> light.off();
        }
    }
}
