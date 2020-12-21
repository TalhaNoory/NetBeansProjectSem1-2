package exceptions;

public class ab {

    public int exceptions (int b, int a) {
        if (b == 0 || b % a == 0) throw new IllegalArgumentException();
        return b / a;
    }

}
