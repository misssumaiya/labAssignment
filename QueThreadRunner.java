package Problem_E3;

public class QueThreadRunner {
    public static void main(String[] args) {

        final int REPETITION = 100;
        Queue<String> q = new Queue<>();

        ProducerThread p = new ProducerThread(q,REPETITION);
        ConsumerThread c = new ConsumerThread(q,REPETITION);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
