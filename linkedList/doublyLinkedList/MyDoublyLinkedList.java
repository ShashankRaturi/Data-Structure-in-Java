package linkedList.doublyLinkedList;

public class MyDoublyLinkedList {

    static class Node{
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail = head;

    public Node toAdd(int dataValue){

        Node newNode = new Node(dataValue);

        if(head == null){
            head =  newNode;
            newNode.next = null;
        }else{

            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }

        return head;
    }

    public void reversePrinting(){

        Node temp = tail;
        while(temp != null){
            //System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList in = new MyDoublyLinkedList();
        in.toAdd(53);
        in.toAdd(8);
        in.toAdd(21);
        in.toAdd(31);
        in.reversePrinting();
    }
}
