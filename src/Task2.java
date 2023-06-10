public class Task2{
    private volatile int counter = 1;
    private int finishProgram = 15;

    public void fizz() throws InterruptedException {
        while (counter <= finishProgram){
            if (counter % 3 == 0 && counter % 5 != 0){
                System.out.println("fizz");
                increment();
            }else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
        }
    }
    public void buzz(){
        while (counter <= finishProgram){
            if (counter % 5 == 0 && counter % 3 != 0){
                System.out.println("buzz");
                increment();
            }else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }}

        }
    }

    public void fizzbuzz(){
        while (counter <= finishProgram){
            if (counter % 3 == 0 && counter % 5 == 0){
                System.out.println("fizzbuzz");
                increment();
            }else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }}
        }
    }
    public void number(){
        while (counter <= finishProgram){
            if (counter % 3 != 0 && counter % 5 != 0){
                System.out.println(counter);
                increment();
            }else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }}
        }
    }
    private synchronized void increment(){
        counter++;
    }

}
