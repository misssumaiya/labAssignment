package Problem_1;

import java.util.LinkedList;

public class CorruptedLinkedListDemo {

    private static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {

        int ThreadNum = 5;
        Thread[] threads = new Thread[ThreadNum];

        for (int i = 1; i<=ThreadNum; i++){
            threads[i] = new Thread(new ListManupulator());
            threads[i].start();
        }

        try {

            for (Thread thread : threads) {
                thread.join();
            }
        }

        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("list size is : " +list.size());
    }

     static class ListManupulator implements Runnable{
        @Override
        public void run() {

            for (int i = 0; i<10000; i++){

                list.add(i);
                list.removeLast();
            }
        }
    }

}
