package adapter.interfacemode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:
 */
public class Plug2TypecAdapter  extends AbstractAdapter{

    private EarphoneWithPlug earphoneWithPlug = null;

    public Plug2TypecAdapter(EarphoneWithPlug earphoneWithPlug) {
        this.earphoneWithPlug = earphoneWithPlug;
    }

    @Override
    public void plug2Typec() {
        if (earphoneWithPlug != null){
            earphoneWithPlug.connectPhone();
            System.out.println("使用适配器连接耳机与Type-C口手机");
            System.out.println("连接成功，浪起来...");
        }
    }


}
