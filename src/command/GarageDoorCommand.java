package command;

import device.GarageDoor;

public class GarageDoorCommand implements Command {

    public enum Action { UP, DOWN, STOP }

    private final GarageDoor door;
    private final Action action;

    public GarageDoorCommand(GarageDoor door, Action action) {
        this.door = door;
        this.action = action;
    }

    @Override
    public void execute() {
        switch (action) {
            case UP -> door.up();
            case DOWN -> door.down();
            case STOP -> door.stop();
        }
    }
}
