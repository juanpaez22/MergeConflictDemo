
public class MathStuff {
    // TODO: test and add javadocs

    /**
     * Adds two integers.
     * @param x first number to add.
     * @param y second number to add.
     * @return The sum of the numbers.
     */
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int subtract(int x, int y) {
        return x - y;
    }


    public static int subtract(int x, int y) {
        int temp = x - y;
        return temp;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int divide(int x, int y) {
        return x / y;
    }

    /**
     *
     * @param base
     * @param pow
     * @return
     */
    public static int pow(int base, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i ++) {
            result *= base;
        }
        return result;
    }
}
