package Sept07Check;

public class Chk {
    public static void main(String[] args) {
        final int GAMES = 1000000;
        int i = (int)(Math.random() * 2);
        int first = 0;
        int second = 0;
        for(int j = 0; j < GAMES;j++){
            while (true){
                //i = (i * 16) + (int)(Math.random() * 16)
                i = (i * 2) + myRandom();
                if((i & 10) == 10){
                    first = first + 1;
                    //i = (i * 2)  + (int)(Math.random() * 2);;
                    if((i & 5) == 5){
                        second = second + 1;
                    }
                i = 0;
                break;
            }
        }
        }
        System.out.println( second + " / " + first);;
    }

    static int myRandom(){
        int i = (int)((Math.random() * 123678) * (Math.random() * 165475));
        i = i / 10000;
        i = i % 1000;
        return (i & 1);
    }
}
