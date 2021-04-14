package linkedList;

import java.util.LinkedList;

public class Linked_list1 {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(4);
        list1.add(14);
        list1.add(24);
        list1.add(34);
        list1.add(44);
        System.out.println(list1);

        System.out.println("Now another list");

        MyLinkedList mll = new MyLinkedList();
        mll.toAdd(23);
        mll.toAdd(96);

        mll.printValues();

        System.out.println("NOw NAother list : ");

        MyGenricLinkedList<String> strList= new MyGenricLinkedList();
        strList.toAdd("ALpha");
        strList.toAdd("Betaa");
        strList.printValues();





    }
}
