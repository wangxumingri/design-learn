package adapter.classmode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:
 */
public class Plug2TypecAdapter extends EarphoneWithPlug implements TypecPhone{
    @Override
    public void play() {
        connectPhone();
        System.out.println("使用适配器连接耳机与Type-C口手机");
        System.out.println("连接成功，浪起来...");
    }
}
