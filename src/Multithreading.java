// Multithreading in Java

class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*
Output:
Thread-1 - 1
Thread-2 - 1
Thread-1 - 2
Thread-2 - 2
Thread-1 - 3
Thread-2 - 3
 */