package todolist;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<List> al_l;  //Creation d'une ArrayList 'al_l' ('ArrayList_List')

    //Creation du constructeur
    public  ToDoList(){
        al_l = new ArrayList<List>();
    }


    //Methodes
    public void addList(List liste){
        al_l.add(liste);
    }

    public boolean removeListIndex(int index){
        if(index<al_l.size()) {
            al_l.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeListObject(List liste){
        if(al_l.contains(liste)) {
            al_l.remove(liste);
            return true;
        }
        else{
            return false;
        }
    }

    public void printList(){
        System.out.println("ToDoList : ");
        for(int i=0; i<al_l.size();i++){
            System.out.println("- "+al_l.get(i).getTitle());
        }
    }






}
