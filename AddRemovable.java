package Problem_E1;
import java.util.List;
public class AddRemovable<E> implements Runnable{
    List<E> list;
    private static final int DELAY = 1;
    private E element;
    private int count;

    public AddRemovable(List<E> list,E element,int count){

        this.list = list;
        this.element = element;
        this.count = count;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= count ; i++){

                list.remove(element);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }
    }
}
