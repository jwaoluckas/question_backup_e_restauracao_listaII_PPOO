import command.CeilingFanCommand;
import command.GarageDoorCommand;
import command.HottubCommand;
import command.LightCommand;
import command.RemoteControl;
import command.SecurityControlCommand;
import command.SoundCommand;
import command.TVCommand;
import device.CeilingFan;
import device.GarageDoor;
import device.Hottub;
import device.Light;
import device.SecurityControl;
import device.Sound;
import device.TV;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File backup = new File("backup.ser");

        System.out.println("=== Configurando a casa ===");
        RemoteControl remote = new RemoteControl(backup);
        configureHouse(remote);

        System.out.println();
        System.out.println("=== PANE ELÉTRICA: tudo em memória foi perdido ===");
        remote = new RemoteControl(backup);

        System.out.println();
        System.out.println("=== Restaurando a partir do disco ===");
        remote.restore();
    }

    private static void configureHouse(RemoteControl remote) {
        Light light = new Light();
        TV tv = new TV();
        Sound sound = new Sound();
        CeilingFan fan = new CeilingFan();
        GarageDoor door = new GarageDoor();
        Hottub hottub = new Hottub();
        SecurityControl security = new SecurityControl();

        remote.press(new LightCommand(light, LightCommand.Action.ON));
        remote.press(new TVCommand(tv, TVCommand.Action.ON));
        remote.press(new TVCommand(tv, TVCommand.Action.CHANNEL, 5));
        remote.press(new TVCommand(tv, TVCommand.Action.VOLUME, 20));
        remote.press(new SoundCommand(sound, SoundCommand.Action.ON));
        remote.press(new SoundCommand(sound, SoundCommand.Action.RADIO));
        remote.press(new SoundCommand(sound, SoundCommand.Action.VOLUME, 12));
        remote.press(new CeilingFanCommand(fan, CeilingFanCommand.Action.HIGH));
        remote.press(new CeilingFanCommand(fan, CeilingFanCommand.Action.LOW));
        remote.press(new GarageDoorCommand(door, GarageDoorCommand.Action.UP));
        remote.press(new GarageDoorCommand(door, GarageDoorCommand.Action.DOWN));
        remote.press(new HottubCommand(hottub, HottubCommand.Action.CIRCULATE));
        remote.press(new HottubCommand(hottub, HottubCommand.Action.TEMPERATURE, 38));
        remote.press(new HottubCommand(hottub, HottubCommand.Action.JETS_ON));
        remote.press(new SecurityControlCommand(security, SecurityControlCommand.Action.ARM));
        remote.press(new LightCommand(light, LightCommand.Action.OFF));
        remote.press(new TVCommand(tv, TVCommand.Action.CHANNEL, 12));
    }
}
