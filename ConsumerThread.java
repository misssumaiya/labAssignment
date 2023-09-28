package Problem_E3;

public class ConsumerThread implements Runnable{

    private static final int DELAY = 1;
    private Queue<String> q;
    private int count;

    public ConsumerThread(Queue<String> queue, int count) {

        this.q = queue;
        this.count = count;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= count; i++){

                q.remove();
               Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }
    }
}
