package LinkedList;

public class LLImplementation {

    Node head;

   public static class Node{

        String data;
        Node next;
        Node(String str){
            this.data = str;
            Node next = null;
        }
    }

    //add first method
    public void  addFirst(String str){
        Node  newNode = new Node(str);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public  void  addLast(String str){

       Node newNode = new Node("to Newtonschool");
       if(head==null){
           head = newNode;
           return;
       }
       Node ptr = head;
       while (ptr.next != null){
           ptr = ptr.next;
       }

       ptr.next = newNode;
    }

    //printlist
    public  void  printList(){

       if(head == null){
           System.out.println("List is empty nothing to print!");
           return;
       }

       Node ptr = head;
       while (ptr != null){
           System.out.print(ptr.data + " --> ");
           ptr = ptr.next;
       }
       System.out.println("null");
    }

    //delete firnode
    public void deleteFirst(){

       if(head == null){
           System.out.println("List is empty nothing to delete");
           return;
       }

       Node ptr = head;
       head =ptr.next;
    }

    public  void  deleteLast(){
        if(head == null){
            System.out.println("List is empty nothing to delete");
            return;
        }

        //if only one element is present in node
        if(head.next == null){
            head = null;
            return;
        }
        Node ptr = head;
        while (ptr.next.next!=null){
            ptr =ptr.next;
        }
        ptr.next = null;

    }

    //main method
    public static void main(String[] args) {
        LLImplementation list = new LLImplementation();

        list.addFirst("Welcome");
        list.addFirst("Mr. Hafeez");
        list.addLast("to Newtonschool");
        list.printList();


        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
