package command;

import device.TV;

public class TVCommand implements Command {

    public enum Action { ON, OFF, CHANNEL, VOLUME }

    private final TV tv;
    private final Action action;
    private final int value;

    public TVCommand(TV tv, Action action) {
        this(tv, action, 0);
    }

    public TVCommand(TV tv, Action action, int value) {
        this.tv = tv;
        this.action = action;
        this.value = value;
    }

    @Override
    public void execute() {
        switch (action) {
            case ON -> tv.on();
            case OFF -> tv.off();
            case CHANNEL -> tv.setInputChannel(value);
            case VOLUME -> tv.setVolume(value);
        }
    }
}
