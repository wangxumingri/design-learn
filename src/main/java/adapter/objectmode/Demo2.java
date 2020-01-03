package adapter.objectmode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:对象适配器demo
 */
public class Demo2 {
    public static void main(String[] args) {
        TypecPhone typecPhone = new Plug2TypecAdapter(new EarphoneWithPlug());
        typecPhone.play();
    }
}
