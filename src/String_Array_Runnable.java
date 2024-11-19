// Custom thread class using Runnable (String array)

class StringArrayRunnable implements Runnable {
    private String[] strings;

    public StringArrayRunnable(String[] strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        for (String str : strings) {
            System.out.println(Thread.currentThread().getName() + " - " + str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class String_Array_Runnable {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "from", "Runnable"};
        StringArrayRunnable stringArrayRunnable = new StringArrayRunnable(strings);

        Thread thread1 = new Thread(stringArrayRunnable, "Thread-1");
        Thread thread2 = new Thread(stringArrayRunnable, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

/*
Output:
Thread-1 - Hello
Thread-2 - Hello
Thread-1 - World
Thread-2 - World
Thread-1 - from
Thread-2 - from
Thread-1 - Runnable
Thread-2 - Runnable
 */