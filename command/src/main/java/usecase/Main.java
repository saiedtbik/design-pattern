package usecase;

public class Main {
    public static void main(String[] args) {
        // Main class Object is Client
        Task task = new Task(2,5); // command
        Thread t = new Thread(task); //invoker
        t.start(); // create a os thread and deliver command to it --it is receiver  
    }
}

class Task implements Runnable {
    int a;
    int b;

    public Task(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() { // execute function
        System.out.println(a * b);
    }
}

