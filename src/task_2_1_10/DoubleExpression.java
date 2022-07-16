package task_2_1_10;

public class DoubleExpression {
    public static boolean doubleExpression(double a, double b, double c) {
        double ab = a + b;
        return Math.abs(ab - c) < 0.0001;
    }
}
