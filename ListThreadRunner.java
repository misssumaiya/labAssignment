package Problem_E1;

import java.util.LinkedList;
import java.util.List;

public class ListThreadRunner {
    public static void main(String[] args) {

        final int THREAD = 100;
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i <= THREAD; i++){

            AddRunnable<Integer> a = new AddRunnable<>(list,100,50);
            AddRemovable<Integer> r = new AddRemovable<>(list,100,50);

            Thread t1 = new Thread(a);
            Thread t2 = new Thread(r);

            t1.start();
            t2.start();
        }
    }
}
