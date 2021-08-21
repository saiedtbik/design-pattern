package sample.receiver;

public class EuropeReceiver implements Receiver {

    public void connect() {
        System.out.println("Europe Connect!");
    }

    public void disconnect() {
        System.out.println("Europe Disconnect!!");
    }

    public void shutdown() {
        System.out.println("Europe ShutDown!!!");
    }

    public void reboot() {
        System.out.println("Europe Reboot!!!!");
    }
}
