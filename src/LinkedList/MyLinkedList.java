package LinkedList;

public class MyLinkedList {

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
        while (temp != null){
            System.out.print(temp.data + " -> ");
//            Increment
            temp = temp.next;
        }
        System.out.println("NULL");
    }

//    INSERTION

    static void InsertionAtStarting(int data){
            Node ob = new Node(data);

//            EDGE CONDITION WHEN LINKED LIST IS EMPTY
            if(Head == null){
                Head = ob;
                Tail = ob;
                return;
            }

            ob.next = Head;
            Head = ob;
    }

    static void InsertionAtEnding(int data){
        Node ob = new Node(data);
//        EDGE CONDITION WHEN LINKED LIST IS EMPTY
        if(Head == null){
            Head = ob;
            Tail = ob;
            return;
        }

        Tail.next = ob;
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
            InsertionAtEnding(data);
            return;
        }

        Node previous_next = temp.next;

        temp.next = ob;

        ob.next = previous_next;
    }


    public static void main(String[] args) {
        for (int i = 1 ; i <= 5 ;i++){
            InsertionAtEnding(10);
        }

        InsertionAtEnding(20);
        InsertionAtEnding(20);
        InsertionAtEnding(20);
        InsertionAtEnding(20);
        InsertionAtEnding(20);
//        Tail.next = Head;
//        display();
//        DeletionAtParticularPosition(3);
//        display();
        display();
        System.out.println(countData(10));
//        countNumberOfNodes(Head , 0);
    }


    static int countData(int data){
        Node temp = Head;
        int count = 0;


        while (temp != null){
            if(temp.data == data){
                count++;
            }

            temp = temp.next;
        }


        return count;
    }

    static void countNumberOfNodes(Node temp , int count){
        if(temp == null){
            System.out.println(count);
            return;
        }

        countNumberOfNodes(temp.next , count+1);
    }

//    DELETION FROM ENDING
    static void DeletionAtEnding(){
        if(Head == null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }
        Node temp = Head;
        while (temp.next != Tail){
            temp = temp.next;
        }
        temp.next = null;
        Tail = temp;
    }

//    DELETION FROM STARTING
    static void DeletionAtStarting(){
        if(Head == null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }

        Head = Head.next;
    }

//    static void DELETION OF PARTICULAR NODE
    static void DeletionAtParticularPosition(int position){

        if(Head == null){
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }

        Node temp = Head;
        int pos = 1;
        while (pos < position-1){
            temp = temp.next;
            pos++;
        }

        temp.next = temp.next.next;

    }
}

