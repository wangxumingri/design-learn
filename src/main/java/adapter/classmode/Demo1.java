package adapter.classmode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:
 */
public class Demo1 {
    public static void main(String[] args) {
        TypecPhone typecPhone = new Plug2TypecAdapter();
        typecPhone.play();
    }
}
