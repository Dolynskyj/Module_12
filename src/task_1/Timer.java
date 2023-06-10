package task_1;

public class Timer extends Thread{
    private int second = 0;
    private final int finishProgram ;

    public Timer(int finishProgram){
        this.finishProgram = finishProgram;
    }

    @Override

    public void run() {
        while (second < finishProgram){
            if (second >= 5){
            System.out.println("Минуло 5 секунд");}
            second+=5;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void ff(){
        System.out.println("Працює потік - " + Thread.currentThread());
    }
}
