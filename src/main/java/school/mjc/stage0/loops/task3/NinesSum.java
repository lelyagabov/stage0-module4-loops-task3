package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int toMultiply = 1;

        for (int i = lengthOfLastNumber; i > 0; i--) {
            sum += 9 * i * toMultiply;
            toMultiply *= 10;
        }

        System.out.println(sum);
    }
}
