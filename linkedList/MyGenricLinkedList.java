package linkedList;

public class MyGenricLinkedList<E> {
    static class Node<E>{
        E data;
        Node<E> next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    Node<E> Head;

    public void toAdd(E dataValue){

        Node<E> newNode = new Node<E>(dataValue);
        Node<E> temp = Head;

        if(Head == null){
            Head = newNode;
            return;
        }


        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void printValues(){
        Node temp = Head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
