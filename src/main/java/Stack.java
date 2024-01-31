import java.util.LinkedList;

public class Stack<E> {

    private LinkedList<E> stack;

    public Stack() {
        this.stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        boolean bool = false;
        try {
            bool = stack.isEmpty();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return bool;
    }

    public E peek() {
        return stack.peek();
    }

    public E pop() {
        return stack.pop();
    }

    public void push(E item) {
        stack.push(item);
    }

    public int search(Object o) {
        int cpt =0;
        for (Object ot: this.stack
             ) {
            if (ot.equals(o)) {
                cpt++;
            }
        }return cpt;
    }
}
