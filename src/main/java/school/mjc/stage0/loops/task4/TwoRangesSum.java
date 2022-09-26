package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int count = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            for (int i = 0; i <= numberToSkip; i++) {
                sum = sum + i;
            }
            for (int i = numberToSkip+1; i <= lastInRow; i++){
                count = count+i;
            }
                System.out.println("skipped sum is " + sum);
            System.out.println("counted sum is " + count);
        }
    }
}
