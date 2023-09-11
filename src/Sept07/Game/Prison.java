package Sept07.Game;

import java.util.Random;

public class Prison {
    public static void main(String[] args) {
        final int GAMES = 10000000;
        int wins = 0;
        for(int j = 0; j < GAMES;j++){
            if (playMe()){wins += 1;}
        }
        System.out.println(((float)wins) / GAMES);
    }
    static boolean playMe(){
        Random rand1 = new Random();
        Random rand2 = new Random();
        int i = 0;
        i = rand1.nextInt(2);//(int)(Math.random() * 2);
        i = (i << 1) + rand2.nextInt(2);
        int indexOne = 0;
        int indexTwo = 0;
        int coinOne = 0;
        int coinTwo = 0;
        int index = 2;
        for(;;){
            index++;
            i = (i << 1) + rand1.nextInt(2);
            if(((i & 5) == 5) && (indexOne == 0)){
                indexOne = index;
                coinOne = (i>>1) & 1;
            }
            index++;
            i = (i << 1) + rand2.nextInt(2);
            if(((i & 5) == 5) && (indexTwo == 0)){
                indexTwo = index;
                coinTwo = (i>>1) & 1;
            }

            if(indexOne * indexTwo > 0 ){break;}
        }
        return (coinOne == coinTwo);
    }
//    static int myRandom(){
//        int i = (int)((Math.random() * 123754) * (int)(Math.random() * 31098));
//        i = i / 1000;
//        return (i & 1);
//    }

}
