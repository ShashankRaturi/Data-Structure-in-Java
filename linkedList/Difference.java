package linkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Difference {

    public static void getTimeDifference(List<Integer> list){

        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; ++i){
            list.add( 0, i);
        }
        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName() + " = " + (end - start));
    }

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        getTimeDifference(ll);
        getTimeDifference(al);
    }
}
