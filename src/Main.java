public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    task2.fizz();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                task2.buzz();
            }
        });

        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                task2.fizzbuzz();
            }
        });
        Thread d = new Thread(new Runnable() {
            @Override
            public void run() {
                task2.number();
            }
        });
        a.start();
        b.start();
        c.start();
        d.start();
    }
}