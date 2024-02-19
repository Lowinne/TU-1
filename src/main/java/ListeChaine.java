public class ListeChaine {
    private final int contenu;
    private ListeChaine suivant;
    public ListeChaine(int contenu, ListeChaine suivant) {
        this.contenu = contenu;
        this.suivant = suivant;
    }
     static int peek(ListeChaine a){
        return a.contenu;
    }
    static ListeChaine queue(ListeChaine a){
        return a.suivant;
    }

     static ListeChaine push(int x, ListeChaine a){
        return new ListeChaine(x,a);
    }

     static boolean search(int x, ListeChaine a){
        while (a != null) {
            if( a.contenu == x ){
                return true;
            }
            a = a.suivant;
        }
        return false;
    }
    /*Delete first*/
    static ListeChaine pop(int x, ListeChaine a){
        if(a == null){
            return a;
        }
        if(a.contenu == x){
            return a.suivant;
        }
        ListeChaine b = a;
        ListeChaine c = b.suivant;
        for (; c != null; b = c, c = c.suivant){
            if(c.contenu == x){
                b.suivant = c.suivant;
                break;
            }
        }
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
