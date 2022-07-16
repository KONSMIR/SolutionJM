package task_2_2_8;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        int c = Integer.bitCount(Math.abs(value));
        return c == 1;
    }
}
