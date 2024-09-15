
package edu.wit.cs.comp1000.tests;

public class Common {

    static String intInput(int[] values) {
        final StringBuilder s = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            s.append(String.format("%d%n", values[i]));
        }

        return s.toString();
    }

    static String stringOutput(String[] lines, Object[] values) {
        return String.format(String.join("", lines), values);
    }

}
