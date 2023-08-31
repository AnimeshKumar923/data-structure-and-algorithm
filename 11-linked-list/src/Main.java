public class Main {
    public static void main(String[] args) {
        LL list=new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(9);
        list.insertFirst(17);
        list.insertLast(45);
        list.insert(125, 5);
        
        list.display();

    }
}
