import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList namesList;

    @BeforeEach
    public void setUp() {
        namesList = new LinkedList();
        assertNotNull(namesList);
    }

    @Test
    public void add() {
        namesList.add("James");
        assertTrue(namesList.size()==1);
    }
}