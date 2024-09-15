
package edu.wit.cs.comp1000.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import edu.wit.cs.comp1000.PA1a;

@Timeout(1)
public class PA1aTestCase {

    private void _test(int yards, int feet, int inches, int expected) {
        final String input = Common.intInput(new int[] {
                yards, feet, inches
        });
        final String output = Common.stringOutput(new String[] {
                "Enter number of yards: ",
                "Enter number of feet: ",
                "Enter number of inches: ",
                "Total number of inches: %d%n",
        }, new Object[] {
                expected
        });

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outContent));

        PA1a.main(new String[] {
                "PA1a"
        });

        assertEquals(output, outContent.toString());

        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void testInches() {
        _test(0, 0, 0, 0);
        _test(0, 0, 1, 1);
        _test(0, 0, 2, 2);
        _test(0, 0, 10, 10);
    }

    @Test
    public void testFeet() {
        _test(0, 1, 0, 12);
        _test(0, 2, 0, 24);
        _test(0, 10, 0, 120);
    }

    @Test
    public void testYards() {
        _test(1, 0, 0, 36);
        _test(2, 0, 0, 72);
        _test(10, 0, 0, 360);
    }

    @Test
    public void testCombo() {
        _test(0, 1, 1, 13);
        _test(1, 0, 1, 37);
        _test(1, 1, 0, 48);
        _test(1, 1, 1, 49);
        _test(1, 2, 3, 63);
        _test(3, 2, 1, 133);
    }

}
