public class DLL {

    private Node head;
    private Node tail;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        if(tail==null){
            tail=head;
        }
        head=node;
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);

        node.next=null;
        tail.next=node;
        node.prev=tail;
        tail=node;
    }

    public void insertLastWithoutTail(int value){
        Node node=new Node(value);
        Node last=head;

        node.next=null;
        
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
    }



    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+" -> ");
            last=node;
            node=node.next;
        }

        System.out.println("END");

        System.out.println("\n\nPrint in reverse:");
        while(last!=null){
            System.out.print(last.value+" -> ");
            last=last.prev;
        }
    
        System.out.println("START");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }


        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
