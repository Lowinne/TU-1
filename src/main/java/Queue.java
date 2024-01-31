import java.util.LinkedList;

public class Queue<E> {

    private LinkedList<E> stack;

    public Queue() {
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
        return stack.peekFirst();
    }

    public E pop() {
        return stack.pop();
    }

    public void push(E item) {
        stack.add(item);
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
