package LinkedList;

public class CircularLinarLinkedList {
//    CREATING NODE
    static class Node{
        int data;
       Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //    HEAD -> POINTING AT THE STARTING NODE OF LINKED LIST
    static Node Head = null;

    //    TAIL -> POINTING AT THE ENDING NODE OF LINKED LIST
    static Node Tail = null;

    static void display(){
       Node temp = Head;

//        TRAVERSAL
        while (temp != Tail){
            System.out.print(temp.data + " -> ");
//            Increment
            temp = temp.next;
        }
        System.out.println(Tail.data);
    }

//    INSERTION

    static void InsertionAtStarting(int data){
        Node ob = new Node(data);

//      EDGE CONDITION WHEN LINKED LIST IS EMPTY
        if(Head == null){
            Head = ob;
            Tail = ob;

            Tail.next = Head;
            return;
        }
        ob.next = Head;
        Head = ob;

        Tail.next = Head;
    }

    static void InsertionAtEnding(int data){
        Node ob = new Node(data);
//        EDGE CONDITION WHEN LINKED LIST IS EMPTY
        if(Head == null){
            Head = ob;
            Tail = ob;
            Tail.next = Head;
            return;
        }
        Tail.next = ob;
        Tail = ob;

        Tail.next = Head;
    }

    static void InsertionAtParticularPosition(int data , int position){
        Node ob = new Node(data);
//        EDGE CONDITION WHEN LINKED LIST IS EMPTY
        if(Head == null){
            Head = ob;
            Tail = ob;
            return;
        }

        if(position == 1){
            InsertionAtStarting(data);
            return;
        }
        Node temp = Head;
        int pos = 1;
        while (pos < position-1){
            temp = temp.next;
            pos++;
        }
        if(temp == Tail){
            InsertionAtEnding(data);
            return;
        }
        Node previous_next = temp.next;
        temp.next = ob;
        ob.next = previous_next;
        Tail.next = Head;
    }

    public static void main(String[] args) {
        InsertionAtEnding(10);
        InsertionAtEnding(20);
        InsertionAtEnding(30);
        InsertionAtEnding(40);
        InsertionAtEnding(50);
        display();
    }
}
