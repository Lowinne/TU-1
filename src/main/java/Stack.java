import java.util.LinkedList;

public class Stack<E> {
    private LinkedList<E> queue;
    public Stack() {
        this.queue = new LinkedList<E>();
    }
    public boolean isEmpty() {
        boolean bool = false;
        try {
            bool = queue.isEmpty();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return bool;
    }
    public void push(E elem) {
        try{
            queue.push(elem);
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
    public E pop() {
        E item = null;
        try {
            item = this.queue.pop();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return item;
    }
    public int size() {
        int s = 0;
        try {
            s = this.queue.size();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return s;
    }
    public E front() {
        E item = null;
        try {
            item = this.queue.peekFirst();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return item;
    }
}
