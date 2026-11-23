package command;

import device.Sound;

public class SoundCommand implements Command {

    public enum Action { ON, OFF, CD, DVD, RADIO, VOLUME }

    private final Sound sound;
    private final Action action;
    private final int value;

    public SoundCommand(Sound sound, Action action) {
        this(sound, action, 0);
    }

    public SoundCommand(Sound sound, Action action, int value) {
        this.sound = sound;
        this.action = action;
        this.value = value;
    }

    @Override
    public void execute() {
        switch (action) {
            case ON -> sound.on();
            case OFF -> sound.off();
            case CD -> sound.setCd();
            case DVD -> sound.setDvd();
            case RADIO -> sound.setRadio();
            case VOLUME -> sound.setVolume(value);
        }
    }
}
