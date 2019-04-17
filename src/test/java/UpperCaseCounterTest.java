import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void nullCheck() {
        String str = null;

        int result  = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);

    }

    @Test
    public void emptyCheck() {
        String str="";
    }




}