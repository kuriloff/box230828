package Sept05;

public class LimitException extends Exception{
    private int num;

    public int getNum() { // на хрена нам это счастье?
        return num;
    }

    public LimitException(String msg) {
        super(msg);
    }
}
