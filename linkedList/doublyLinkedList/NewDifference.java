package linkedList.doublyLinkedList;

import linkedList.MyLinkedList;

public class NewDifference {

    public static void main(String[] args) {

        MyDoublyLinkedList in = new MyDoublyLinkedList();
        MyLinkedList mll = new MyLinkedList();

        long dstart = System.currentTimeMillis();
        for(int i = 1; i <= 1000; ++i){
            in.toAdd(i);
        }
        in.reversePrinting();
        long dend = System.currentTimeMillis();


        long sstart = System.currentTimeMillis();
        for (int i = 1; i <= 1000; ++i){
            mll.toAdd(i);
        }
        mll.toReverse();
        mll.printValues();
        long send = System.currentTimeMillis();

        System.out.println("Doubly linked list : "+(dend - dstart) + "\nSingly linked list : "+(send - sstart));

    }
}
