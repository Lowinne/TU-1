import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<String> fa0, fa1, fa2;
    @BeforeEach
    public void setUp() throws Exception {
        fa0 = new Stack<String>();

        fa1 = new Stack<String>();
        fa1.push("plop");

        fa2 = new Stack<String>();
        fa2.push("a");
        fa2.push("b");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(fa0.isEmpty());
        assertFalse(fa1.isEmpty());
    }

    @Test
    public void testPush() {
        assertTrue(fa0.isEmpty());
        fa0.push("toto");
        assertFalse(fa0.isEmpty());
    }

    @Test
    public void TestSize() {
        assertEquals(fa2.size(),2);
        assertEquals(fa1.size(),1);
    }

    @Test
    public void testFront() {
        assertEquals(fa2.front(),"b");
        assertEquals(fa1.front(),"plop");
    }

    @Test
    public void testPop() {
        //exception
        try{
            fa0.pop();
        }catch(Exception e){
            //ok
        }
        assertEquals(fa1.pop(),"plop");
        assertTrue(fa1.isEmpty());
        assertEquals(fa2.pop(),"b");
        assertEquals(fa2.pop(), "a");
        assertTrue(fa2.isEmpty());
    }
}