package linkedList;

public class ReverseingTheLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node Head;

    public Node toReverse(){

        if(Head.next != null){

            Node temp = Head;
            Node mid = null;
            Node prev = null;

            while(temp != null){
                prev = mid;
                mid = temp;
                temp = temp.next;

                mid.next = prev;
            }
            Head = mid;

            temp = Head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }


        }

        return Head;
    }
}
