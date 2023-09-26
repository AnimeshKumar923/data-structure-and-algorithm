public class Main {
    public static void main(String[] args) {
        // singly linked-list
        
        // LL list=new LL();

        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(17);
        // list.insertFirst(9);
        // list.insertLast(45);
        // list.insert(125, 3);
        
        // list.display();

        // list.deleteFirst();
        // list.display();

        // list.deleteLast();
        // list.display();

        // list.delete(1);
        // list.display();




        // doubly linked-list
        // DLL listdll=new DLL();
        
        // listdll.insertFirst(87);
        // listdll.insertFirst(65);
        // listdll.insertFirst(7);
        // listdll.insertFirst(20);

        // listdll.insertLastWithoutTail(587);

        // listdll.insert(65, 254);

        // listdll.display();





        // circular linked-list
        CLL listcll=new CLL();

        listcll.insert(54);
        listcll.insert(66);
        listcll.insert(87);
        listcll.insert(20);
        listcll.insert(8);

        listcll.display();

        listcll.delete(20);
        listcll.display();
    }
}
