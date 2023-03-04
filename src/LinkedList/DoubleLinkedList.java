

public class DoubleLinkedList {
    static class Node{
        int data;
        Node next;
        Node previous;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    static Node Head = null;
    static Node Tail = null;
//    DISPLAY FROM HEAD
    static void displayFromHead(){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data + " -> ");

//            INCREMENT
            temp = temp.next;
        }
        System.out.println("NULL");
    }

//    DISPLAY FROM TAIL
    static void displayFromTail(){
        Node temp = Tail;
        System.out.print("NULL");
        while (temp != null){
            System.out.print( " <- " + temp.data);

//            DECREMENT
            temp = temp.previous;
        }
        System.out.println();
    }


    static void InsertionAtStarting(int data){
        Node ob = new Node(data);

        ob.next = Head;
        Head.previous = ob;

        Head = ob;
    }

    static void InsertingAtEnding(int data){
        Node ob = new Node(data);
//        EDGE CONDITION WHEN LINKED LIST IS EMPTY
        if(Head == null){
            Head = ob;
            Tail = ob;
            return;
        }

        Tail.next = ob;
        ob.previous = Tail;

        Tail = ob;
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
            InsertingAtEnding(data);
            return;
        }

        Node previous_next = temp.next;

        temp.next = ob;
        ob.previous = temp;

        ob.next = previous_next;
    }


    public static void main(String[] args) {
        Node ob1 = new Node(10);
        Head = ob1;
        Node ob2 = new Node(20);
        ob1.next = ob2;
        ob2.previous = ob1;

        Node ob3 = new Node(30);
        ob2.next = ob3;
        ob3.previous = ob2;

        Node ob4 = new Node(40);
        ob3.next = ob4;
        ob4.previous = ob3;

        Tail = ob4;

        displayFromHead();
        displayFromTail();

        InsertionAtStarting(5);
        displayFromHead();
        displayFromTail();
        InsertingAtEnding(100);
        displayFromHead();
        displayFromTail();
        InsertionAtParticularPosition(1000 , 3);
        displayFromHead();
        displayFromTail();
    }

}
