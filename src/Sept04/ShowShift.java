package Sept04;

public class ShowShift {
    public static void main(String[] args) {
        long i = 0;
        long buff = 1;
        for(i = 0;i < 1000; i++){
            //buff = (buff << 1) + (long) (Math.random() * 2);
            buff = (buff * 2) + (long) (Math.random() * 2);
            System.out.println(Long.toBinaryString(buff) + " / " + buff);
        }
    }
}
