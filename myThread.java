class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1 - " + i);
        }
    }
}

class Task2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task2 - " + i);
        }
    }
}

public class myThread {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Thread t2 = new Thread(new Task2());

        t1.start(); // start Thread subclass
        t2.start(); // start Runnable-based thread
    }
}