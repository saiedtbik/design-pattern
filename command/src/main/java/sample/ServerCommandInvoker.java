package sample;

import sample.command.Command;

public class ServerCommandInvoker {
public static void invoke(Command command){
    command.execute();
}
}
