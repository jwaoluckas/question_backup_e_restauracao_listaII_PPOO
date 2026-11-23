package command;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private final File file;
    private final List<Command> history = new ArrayList<>();

    public RemoteControl(File file) {
        this.file = file;
    }

    public void press(Command command) {
        command.execute();
        history.add(command);
        store(command);
    }

    private void store(Command command) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file, true))) {
            out.writeObject(command);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
