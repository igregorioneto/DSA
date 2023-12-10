package easy;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                step++;
            } else {
                num -= 1;
                step++;
            }
        }
        return step;
    }
}
