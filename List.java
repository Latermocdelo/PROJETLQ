package todolist;

public class List {
    // Initialisation des variables
    private String title;
    private String description;
    private String deadline;

    //Constructeurs
    public List(){
        title="Title";
        description="Enter a description";
        deadline="JJ/MM/AAAA";
    }

    public List(String wtitle,String wdescription, String wdeadline){   //les noms des variables ecrites commencent par 'w' -> write
        title = wtitle;
        description = wdescription;
        deadline = wdeadline;
    }


    //Methodes

    //Methodes get
    public String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }


    //Methodes set
    public void setTitle(String wtitle){
        title = wtitle;
    }

    public void setDescription(String wdescription) {
        description = wdescription;
    }

    public void setDeadline(String wdeadline) {
        deadline = wdeadline;
    }


    //Methodes verif date
    //On peut ajouter la verification que JJ,MM et AAAA sont des dates dates valides (integer && MM<13 ... )
    public boolean verifDate(String wdate){
        if(wdate.length()!=10){
            System.out.println("length");
            return false;
        }
        else if(wdate.charAt(2)!='/' || wdate.charAt(5)!='/'){
            System.out.println("/");
            return false;
        }
        else{
            return true;
        }
    }


}
