package command;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private final File file;
    private List<Command> history = new ArrayList<>();

    public RemoteControl(File file) {
        this.file = file;
    }

    public void press(Command command) {
        command.execute();
        history.add(command);
        store();
    }

    public void store() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(history);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Command> load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Command>) in.readObject();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public void restore() {
        history = load();
        for (Command command : history) {
            command.execute();
        }
    }
}
