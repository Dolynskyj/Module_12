package task_1;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        Сlock сlock = new Сlock(30);
        Timer timer = new Timer(30);
        Thread time = new Thread(сlock);
        Thread fiveCecond = new Thread(timer);
        time.start();
        fiveCecond.start();
    }
}
