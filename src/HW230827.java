import java.util.Random;

public class HW230827 {
    public static void main(String[] args) {
        count(); // loop for
        countEach(); // the same loop with for each
    }

    static void count(){
        Random rand = new Random();
        int[] myArr;
        myArr = new int[50];
        int positiveAmount = 0;
        int negativeAmount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int positiveMax = 0;
        int negativeMin = 0;

        System.out.print("formed array: ");
        for (int i=0; i<myArr.length; i++){
            myArr[i] = rand.nextInt(101) - 50;
            System.out.print(myArr[i] + " ");
            positiveAmount += myArr[i]>0 ? 1 : 0;
            negativeAmount += myArr[i]<0 ? 1 : 0;
            positiveSum += myArr[i]>0 ? myArr[i] : 0;
            negativeSum += myArr[i]<0 ? myArr[i] : 0;
            positiveMax = myArr[i]>positiveMax ? myArr[i] : positiveMax;
            negativeMin = myArr[i]<negativeMin ? myArr[i] : negativeMin;
        }
        System.out.println("\nPositive numbers " + positiveAmount);
        System.out.println("Negative numbers: " + negativeAmount);
        System.out.println("Zeros: " + (50 - negativeAmount - positiveAmount));
        System.out.println("Sum of positives: " + positiveSum);
        System.out.println("Sum of negatives: " + negativeSum);
        System.out.println("Average: " + ((float)(negativeSum + positiveSum)/50));
        System.out.println("Max positive num: " + positiveMax);
        System.out.println("Min negative num: " + negativeMin);
    }
    static void countEach(){
        Random rand = new Random();
        int[] myArr;
        myArr = new int[50];
        int positiveAmount = 0;
        int negativeAmount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int positiveMax = 0;
        int negativeMin = 0;

        System.out.print("formed array: ");
        for (int i: myArr){
            i = rand.nextInt(101) - 50;
            System.out.print(i + " ");
            positiveAmount += i>0 ? 1 : 0;
            negativeAmount += i<0 ? 1 : 0;
            positiveSum += i>0 ? i : 0;
            negativeSum += i<0 ? i : 0;
            positiveMax = i>positiveMax ? i : positiveMax;
            negativeMin = i<negativeMin ? i : negativeMin;
        }
        System.out.println("\nPositive numbers " + positiveAmount);
        System.out.println("Negative numbers: " + negativeAmount);
        System.out.println("Zeros: " + (50 - negativeAmount - positiveAmount));
        System.out.println("Sum of positives: " + positiveSum);
        System.out.println("Sum of negatives: " + negativeSum);
        System.out.println("Average: " + ((float)(negativeSum + positiveSum)/50));
        System.out.println("Max positive num: " + positiveMax);
        System.out.println("Min negative num: " + negativeMin);
    }


}