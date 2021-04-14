package linkedList;

public class MyLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node Head;

    public void toAdd(int dataValue){

        Node newNode = new Node(dataValue);
        Node temp = Head;

        if(Head == null){
            Head = newNode;
            return;
        }


        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public Node toDelete( int position){

        Node temp = Head;

        if(position == 0){
            Head = Head.next;
            temp.next = null;
        }else{
            Node mid = null;
            Node prev = null;

            int count = 0;

            while(count <= position){
                prev = mid;
                mid = temp;
                temp = temp.next;
            }
            prev.next = temp;
            mid.next = null;
        }


        return Head;
    }

    public void printValues(){
        Node temp = Head;

        while(temp != null){
            //System.out.println(temp.data);
            temp = temp.next;
        }
    }

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


        }

        return Head;
    }

}
