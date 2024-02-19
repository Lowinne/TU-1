public class ListeChaine {
    public String getContenu() {
        return contenu;
    }

    private final String contenu;
    private ListeChaine suivant;

    public ListeChaine(String contenu){
        this.contenu = contenu;
        this.suivant = null;
    }
     static String peek(ListeChaine a){
        return a.contenu;
    }
    static ListeChaine queue(ListeChaine a){
        return a.suivant;
    }

     static ListeChaine push(String x, ListeChaine a){
        while(a.suivant != null){
            a = a.suivant;
        }
        a.suivant = new ListeChaine(x);

        return a.suivant;
    }

     static boolean search(String x, ListeChaine a) {
        while (a != null) {
            if( a.contenu.equals(x) ){
                return true;
            }
            a = a.suivant;
        }
        return false;
    }
    /*Delete first*/
    static ListeChaine pop(ListeChaine a){
        a = a.suivant;
        return a;
    }
    static int size(ListeChaine a){
        int i = 0;
        while(a != null){
            a = a.suivant;
            i++;
        }
        return i;
    }
    static boolean isEmpty(ListeChaine a){
        return size(a) == 0;
    }
}
