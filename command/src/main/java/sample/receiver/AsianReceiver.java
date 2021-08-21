package sample.receiver;

public class AsianReceiver implements Receiver {
    public void connect() {
        System.out.println("Asian Connect!");
    }

    public void disconnect() {
        System.out.println("Asian Disconnect!!");
    }

    public void shutdown() {
        System.out.println("Asian ShutDown!!!");
    }

    public void reboot() {
        System.out.println("Asian Reboot!!!!");
    }
}
