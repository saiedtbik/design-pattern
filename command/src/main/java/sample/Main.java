package sample;

import sample.command.Command;
import sample.command.ShutdownCommand;
import sample.receiver.AsianReceiver;
import sample.receiver.Receiver;

public class Main {
    public static void main(String[] args) {
        Receiver asianReceiver = new AsianReceiver();
        Command command  = new ShutdownCommand(asianReceiver);
        ServerCommandInvoker.invoke(command);
    }
}
