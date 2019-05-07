package raio;

/**
 * Created by benxiang on 2019/5/7.
 */

public class Raio {
    static {
        System.loadLibrary("raio");
    }
    public native static int get_sum(int a, int b);
}
