import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeChaineTest {
    ListeChaine fa0, fa1;

    @BeforeEach
    void setUp() {
        fa0 = new ListeChaine("First");
        ListeChaine.push("Second", fa0);
        ListeChaine.push("Third", fa0);
        ListeChaine.push("Fourth", fa0);

    }

    @Test
    void peek() {
        assertEquals("First", ListeChaine.peek(fa0));
    }

    @Test
    void queue() {
        assertEquals("Second", ListeChaine.queue(fa0).getContenu());
    }


    @Test
    void search() {
        assertTrue(ListeChaine.search("Third",fa0));
        assertFalse(ListeChaine.search("Fifth",fa0));
    }

    @Test
    void pop() {
        fa0 = ListeChaine.pop(fa0);
        assertEquals("Second", fa0.getContenu());

    }

    @Test
    void size() {
        assertEquals(4,ListeChaine.size(fa0));
    }

    @Test
    void isEmpty() {
        assertFalse(ListeChaine.isEmpty(fa0));
        assertTrue(ListeChaine.isEmpty(fa1));
    }
}