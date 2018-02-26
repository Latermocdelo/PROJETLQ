package todolist;

public class Test {
    public static void main(String[] args) {
        //Test de List.java
        List l = new List();

        System.out.println(l.getDeadline());
        System.out.println(l.getDescription());
        System.out.println(l.getTitle());

        System.out.println(l.verifDate(l.getDeadline()));



        //Test de ToDoList.java
        ToDoList tdl = new ToDoList();
        List l1 = new List("todolist 1","verifier si la todolist marche","13/02/2018");

        tdl.addList(l);
        tdl.addList(l1);
        tdl.printList();
        System.out.println(tdl.removeListIndex(0));
        System.out.println(tdl.removeListObject(l1));
        System.out.println(tdl.removeListIndex(2));
        tdl.printList();




    }

}
