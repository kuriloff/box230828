package Sept05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        final int MAX = 100;
        int j = ((int) (Math.random() * (MAX + 1))) + 1;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please, input integer number between 1 and %d or Zero to quit the game \n>>", MAX);
        {
            while(true){
                try {
                    i = scanner.nextInt();
                    if (i == 0){System.out.println("It's pity, but hope to see you again..\n"); break;}
                    else if(i < j){System.out.print("You're too modest, try to print some bigger number\n>>");}
                    else if (i > j){System.out.print("Oh, your number is too big, try again\n>>");}
                    else if(i == j){System.out.println("Yess, you were able to catch your lion in Sahara!"); break;}
                } catch (InputMismatchException e) {
                    //e.printStackTrace();
                    System.out.print("Wrong input, try again\n>>");
                    scanner.next();
                }
            }
        }
    }
}





