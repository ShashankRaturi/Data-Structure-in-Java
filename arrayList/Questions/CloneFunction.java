package arrayList.Questions;

import java.util.ArrayList;

public class CloneFunction {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        list1.add(4);
        list1.add(8);
        list1.add(63);

        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);

        System.out.println(list1.equals(list2));   //checking whether list1 and list2 are equal or not

        list2 = (ArrayList<Integer>) list1.clone();

        System.out.println("After cloning list2 : " + list2);

        System.out.println(list1.equals(list2));



    }
}
