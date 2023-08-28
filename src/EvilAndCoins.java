/*
Задачка про двух математиков в тюряге и недоброго уха с монетой
*/

import java.util.Random;
public class EvilAndCoins {
    public static void main(String[] args) {
        int loopCount = 100000000;
        int victories = 0;
        //int bet = 1; // or 0, to do later
        for(int i = 1; i <= loopCount; i++) {
            victories += Game();
        }
        System.out.println("Percent of victories: " + (float)victories/loopCount);
    }
    static int Game(){
        int n;
        int stack = 0;
        int firstIndex = 0;
        int firstValue = 0;
        int secondIndex = 0;
        int secondValue = 0;

        Random rand = new Random();
        stack = rand.nextInt(2); // first coin toss
        //System.out.println(stack);
        stack = rand.nextInt(2) << 1; //second coin toss
        //System.out.println(stack);
        n = 2;
        while(true){
            n++; //odd iteration
            stack = (stack << 1) + rand.nextInt(2); //odd coin toss
            //System.out.println(stack);
            if (((stack & 5) == 5) && (firstIndex == 0) ){
                firstIndex = n - 1;
                //System.out.println(stack);
                firstValue = stack & 2;
            }
            n++; // honest iteration
            stack = (stack << 1) + rand.nextInt(2); //honest coin toss
            //System.out.println(stack);
            if (((stack & 5) == 5) && (secondIndex == 0) ){
                secondIndex = n - 1;
                secondValue = stack & 2;
            }
            if (firstIndex * secondIndex > 0){
                if(firstIndex+secondIndex>200){
                    System.out.println(firstIndex + " / " + secondIndex + " (" + (firstIndex + secondIndex) + ")");
                }
                break;
            }
        }
        return firstValue == secondValue ? 1 : 0;
    }
}