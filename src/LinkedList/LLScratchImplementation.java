package LinkedList;

public class LLScratchImplementation { //Linked List
    Node head; //help me to store the address of firt nod
    int size = 0; //count the size of linked list

    //Note : we will never touch head in our algo

    public  class Node{
        String data;
        Node next;

        Node(String str){
            this.data = str;
            this.next = null;
            size++;
        }
    }

    // 1 : addLast method
    public  void  addLast(String str){
        //first create node always
        Node newNode = new Node(str);

        // 1 : check if node is empty
        if(head == null){
            //if linked list is empty then add newNode to the linked list and simply return
            head  = newNode;
            return;
        }

        Node ptr = head;

        //go to last node
        while(ptr.next != null){
            ptr = ptr.next;
        }
        //insert value at last node
        ptr.next = newNode;

    }

    // 2 : add first in linked list
    public  void  addFirst(String str){
        Node newNode = new Node(str);
        if(head == null){
            head = newNode;
//            System.out.println(head.next);
            return;
        }
        newNode.next = head;
        head = newNode;


    }


    // 3 : remove first node
    public  void  removeFirst(){
        if(head == null){
            System.out.println("Nothing is there to delete, list is empty");
            return;
        }
        head = head.next;

        //now we have to decrease size also
        size--;
    }

    // 4 : remove last node
    public  void  removeLast(){
        if(head == null){
            System.out.println("Nothing is there to delete, list is empty");
            return;
        }
        size--;

        //check if there is only one node
        if(head.next == null){
            head=null;
            return;
        }

        //if more than one node present
        Node ptr = head;
        while (ptr.next.next!=null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }


    //  : get size of linked list
    public  int getSize(){
        return  size;
    }

    //  : print linked list
    public  void  printList(){
        Node ptr = head;

        while (ptr!= null){
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
    }


    //main method
    public static void main(String[] args) {

        //create linked list
        LLScratchImplementation list = new LLScratchImplementation();
        list.addFirst("Mr. Hafizur");
        list.addFirst("Mr. Salil");

        list.printList();

//        list.addLast("Welcome ");
//        list.addLast("to ");
//        list.addLast("newton ");
//        list.addLast("school ");
//        list.printList();
//
//        System.out.println();
//        System.out.println( "size : " + list.getSize());
//
//        list.addFirst("Mr. Hafeez! ");
//        list.printList();
//
//        System.out.println();
//        System.out.println( "size : " + list.getSize());
//
//        list.removeFirst();
//        list.removeLast();
//        list.printList();
//
//        System.out.println();
//        System.out.println( "size : " + list.getSize());


    }
}
