import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<String> st1, st2, st0;

    @BeforeEach
    public void setUp() throws Exception {
        st0 = new Stack<String>();
        st1 = new Stack<String>();
        st1.push("plop");

        st2 = new Stack<String>();
        st2.push("a");
        st2.push("b");
    }
    @Test
    void testIsEmpty() {
        assertTrue(st0.isEmpty());
        assertFalse(st1.isEmpty());
    }

    @Test
    void testPeek() {
        assertEquals(st1.peek(),"plop");
        assertEquals(st2.peek(),"b");
    }

    @Test
    void pop() {
        st2.pop();
        assertEquals(st2.peek(),"a");
    }

    @Test
    void push() {
        st0.push("String");
        assertEquals(st0.peek(),"String");

    }

    @Test
    void search() {

    }
}