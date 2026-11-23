package command;

import device.SecurityControl;

public class SecurityControlCommand implements Command {

    public enum Action { ARM, DISARM }

    private final SecurityControl security;
    private final Action action;

    public SecurityControlCommand(SecurityControl security, Action action) {
        this.security = security;
        this.action = action;
    }

    @Override
    public void execute() {
        switch (action) {
            case ARM -> security.arm();
            case DISARM -> security.disarm();
        }
    }
}
