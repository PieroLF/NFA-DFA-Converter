import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    public void testHelperMethods() {
        final State INITIAL_FINAL = new State(0,true, true);
        final State INITIAL_NOT_FINAL = new State(0,true, false);
        final State NOT_INITIAL_FINAL = new State(1,false, true);
        final State NOT_INITIAL_NOT_FINAL = new State(1,false, false);

        // Tests for INITIAL_FINAL
        assertTrue(INITIAL_FINAL.isInitial());
        assertTrue(INITIAL_FINAL.isIFinal());

        // Tests for INITIAL_NOT_FINAL
        assertTrue(INITIAL_NOT_FINAL.isInitial());
        assertFalse(INITIAL_NOT_FINAL.isIFinal());

        // Tests for NOT_INITIAL_FINAL
        assertFalse(NOT_INITIAL_FINAL.isInitial());
        assertTrue(NOT_INITIAL_FINAL.isIFinal());

        // Tests for NOT_INITIAL_NOT_FINAL
        assertFalse(NOT_INITIAL_NOT_FINAL.isInitial());
        assertFalse(NOT_INITIAL_NOT_FINAL.isIFinal());


    }


}