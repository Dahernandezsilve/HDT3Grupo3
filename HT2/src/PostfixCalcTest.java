import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalcTest {

    PostfixCalc p = new PostfixCalc();
    @Test
    void evaluateT() {
        assertEquals(p.Evaluate("1 3 + 4 / 3 +"),4);
    }

    @Test
    void evaluateF() {
        assertEquals(p.Evaluate("1 4 / 3 +"),5);
    }


}