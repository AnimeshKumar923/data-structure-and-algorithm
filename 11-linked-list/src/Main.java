public class Main {
    public static void main(String[] args) {
        LL list=new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(17);
        list.insertFirst(9);
        list.insertLast(45);
        list.insert(125, 3);
        
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
    }
}
