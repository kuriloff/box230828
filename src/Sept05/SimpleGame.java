package Sept05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        final int MAX = 100;
        int j = 0;
        j = ((int) (Math.random() * (MAX + 1))) + 1;
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("Please, input integer between 1 and %d : \n", MAX);
        {
            while(true){
                try {
                    i = s.nextInt();
                    if(i < j){System.out.println("You're too modest, try to print some bigger number");}
                    else if (i > j){System.out.println("Oh, your number is too big, try again");}
                    else if(i == j){System.out.println("Yess, you were able to catch your lion in Sahara!"); break;}
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    System.out.println("Wrong input, try again");
                    s.next();
                }
            }
        }
    }
}





