package Problem_E3;

import java.time.LocalTime;

public class ProducerThread implements Runnable{

    private static final  int DELAY = 1;
    private Queue<String> q;
    private  int count;

    public ProducerThread(Queue<String> queue, int count) {

        this.q = queue;
        this.count = count;
    }

    @Override
    public void run() {

        try {

            for (int i =1 ; i<=count; i++){

                String time = LocalTime.now().toString();
                q.add(time);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }
    }
}
