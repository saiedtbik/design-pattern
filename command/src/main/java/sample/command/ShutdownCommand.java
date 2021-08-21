package sample.command;

import sample.receiver.Receiver;

public class ShutdownCommand extends Command {
    public ShutdownCommand(Receiver receiver) {
     super(receiver);
    }

    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }
}
