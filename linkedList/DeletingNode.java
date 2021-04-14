package linkedList;

public class DeletingNode {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node Head;

    public Node toDelete(Node Head , int position){

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





}
