public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int value){

        if(tail==null){
            insertFirst(value);
            return;
        }

        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size){
            insertLast(value);
            return;
        }

        Node temp=head; // i starts from one because this is already at 0th index.

        for(int i=1; i<index; i++){
            temp=temp.next;
        }

        Node node=new Node(value, temp.next);
        temp.next=node;
        
        size++;
    }

    public Node get(int index){    
        // this get function gives reference to the just previous index of the target index

        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }


    public Node findElement(int value){   
        // this function returns the index where the value is found 

        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }

        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        System.out.println("The deleted item is: "+val);
    }

    public void deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        System.out.println("The deleted item is: "+val);
    }

    public void delete(int index){
        // this function deletes element from any given index


        if(index==0){
            deleteFirst();
        }
        
        if(index==size-1){
            deleteLast();
        }
        
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        System.out.println("The deleted item is: "+val);
    }

    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
        
        System.out.println("Size = "+size);
    }

    
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
