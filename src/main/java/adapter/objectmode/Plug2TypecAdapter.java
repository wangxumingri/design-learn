package adapter.objectmode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:使用组合代替继承
 */
public class Plug2TypecAdapter  implements TypecPhone {
    private EarphoneWithPlug earphoneWithPlug = null;

    public Plug2TypecAdapter(EarphoneWithPlug earphoneWithPlug) {
        this.earphoneWithPlug = earphoneWithPlug;
    }

    @Override
    public void play() {
        if (null != earphoneWithPlug){
            earphoneWithPlug.connectPhone();
            System.out.println("使用适配器连接耳机与Type-C口手机");
            System.out.println("连接成功，浪起来...");
        }
    }
}
