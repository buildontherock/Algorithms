package test.java;

import main.java.CalculateString;
import main.java.RightToLeft;
import org.junit.Test;

/**
 * Created by Austin Burkhart on 2/15/2016.
 */
public class RightToLeftTest {

    CalculateString rightToLeft = new RightToLeft();

    @Test
    public void testRightToLeft(){
        System.out.println(rightToLeft.convertStringToInteger("nine hundred ninety five"));
    }
}
