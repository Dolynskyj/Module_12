package task_1;

public class Сlock  extends  Thread{
    private int second = 0;
    private final int finishProgram;
    public Сlock(int finishProgram){
        this.finishProgram = finishProgram;
    }
    @Override

    public void run() {
        while (second < finishProgram){
            System.out.println(second + " секунд");
            synchronized (this){
            second++;}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
