package August;

/*
Задачка про двух математиков в тюряге и недоброго уха с монетой
*/

import java.util.Random;
import java.util.Date;

public class EvilAndCoins {
    public static void main(String[] args) {
        int loopCount = 1000000; //2140000000;
        int victories = 0;
        Date date = new Date();
        //int bet = 1; // or 0, to do later
        //System.out.println(date.toString());
        for(int i = 1; i <= loopCount; i++) {
            victories += GameOne();
        }
        System.out.println("Percent of my victories: " + (float)victories/loopCount);
        victories = 0;
        //System.out.println(date.toString());
        for(int i = 1; i <= loopCount; i++) {
            victories += GameTwo();
        }
        System.out.println("Percent of savvateev's victories: " + (float)victories/loopCount);
        // now I want to check my method

        int bingo = 0;
        //System.out.println(date.toString());
        for(int i = 1; i <= loopCount; i++) {
            bingo += catchBingo();
        }
        System.out.println("Percent of bingos: " + (float)bingo/loopCount);
        //System.out.println(date.toString());



    }
    static int GameOne(){
        int n;
        int stack = 0;
        int firstIndex = 0;
        int firstValue = 0;
        int secondIndex = 0;
        int secondValue = 0;

        Random rand = new Random();
        stack = 0; //rand.nextInt(2); // first coin toss
        //System.out.println(Integer.toBinaryString(stack));
        //stack = rand.nextInt(2) << 1; //second coin toss
        //stack = (stack << 1) + rand.nextInt(2);
        //System.out.println(Integer.toBinaryString(stack));
        stack = (int)(Math.round(Math.random()));
        stack = (stack * 2) + (int)(Math.round(Math.random()));
        n = 2;
        while(true){
            n++; //odd iteration
            //stack = (stack * 2) + rand.nextInt(2); //odd coin toss
            stack = (stack * 2) + (int)(Math.round(Math.random()));
            //System.out.println(stack);
            //System.out.println(Integer.toBinaryString(stack));
            if (((stack & 5) == 5) && (firstIndex == 0) ){
                firstIndex = n - 1;
                //System.out.println(stack);
                firstValue = stack & 2;
                //System.out.println(Integer.toBinaryString(stack));
            }
            n++; // honest iteration
            //stack = (stack * 2) + rand.nextInt(2); //honest coin toss
            stack = (stack * 2) + (int)(Math.round(Math.random()));
            //System.out.println(Integer.toBinaryString(stack));
            //System.out.println(stack);
            if (((stack & 5) == 5) && (secondIndex == 0) ){
                secondIndex = n - 1;
                secondValue = stack & 2;
                //System.out.println(Integer.toBinaryString(stack));
            }
            if (firstIndex * secondIndex > 0){
                /*if(firstIndex+secondIndex>200){
                    System.out.println(firstIndex + " / " + secondIndex + " (" + (firstIndex + secondIndex) + ")");
                }*/
                break;
            }
        }
        //System.out.println(Integer.toBinaryString(stack));
        /*if(firstValue == secondValue){
            System.out.println("Yess!   " + firstIndex + " / " + secondIndex);
        }else{
            System.out.println("Bolt..   " + firstIndex + " / " + secondIndex);
        }*/
        return firstValue == secondValue ? 1 : 0;
    }

    static int GameTwo(){
        int stack = 0;
        Random rand = new Random();
        stack = rand.nextInt(16); // first coin toss
        int first = stack < 8 ? (stack & 4) >> 2 : stack & 1;
        int second = ((~stack & 4) == 4) && ((stack & 1) ==1) ? (stack & 8) >> 3 : (stack & 2) >> 1;
        return first == second ? 1 : 0;
    }


    static int catchBingo(){
        int n;
        int stack = 0;
        int firstIndex = 0;
        int firstValue = 0;
        int secondIndex = 0;
        int secondValue = 0;

        Random rand = new Random();
        stack = rand.nextInt(2); // first coin toss

        //System.out.println(stack);
        //stack = rand.nextInt(2) << 1; //second coin toss
        stack = (stack << 1) + rand.nextInt(2);
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
                //if(firstIndex+secondIndex>200){
                //    System.out.println(firstIndex + " / " + secondIndex + " (" + (firstIndex + secondIndex) + ")");
                //}
                break;
            }
        }
        return Math.abs(firstIndex - secondIndex) == 1 ? 1 : 0;
    }


}