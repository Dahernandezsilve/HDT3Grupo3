import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayListTest {

    StackArrayList s = new StackArrayList();

    @Test
    void pullT() {
        s.push("+");
        assertEquals(s.pull(), "+");
    }

    @Test
    void pullF() {
        s.push("+");
        assertEquals(s.pull(), 0);
    }

    @Test
    void peekT() {
        s.push("1");
        assertEquals(s.peek(), "1");
    }

    @Test
    void peekF() {
        s.push("1");
        assertEquals(s.peek(), "0");
    }

    @Test
    void countT() {
        s.push("1");
        s.push("+");
        assertEquals(s.count(), 2);
    }

    @Test
    void countF() {
        s.push("1");
        s.push("+");
        assertEquals(s.count(), 1);
    }

    @Test
    void isEmptyT() {
        s.push("d");
        assertEquals(s.isEmpty(), false);
    }

    @Test
    void isEmptyF() {
        s.push("d");
        assertEquals(s.isEmpty(), true);
    }
}