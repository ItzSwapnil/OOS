// Java thread by implementing the Runnable interface

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*
Output:
Thread-1 - 0
Thread-2 - 0
Thread-1 - 1
Thread-2 - 1
 */