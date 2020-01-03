package adapter.interfacemode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:
 */
public class Demo3 {
    public static void main(String[] args) {
        InterfaceAdapter adapter = new Plug2TypecAdapter(new EarphoneWithPlug());
        adapter.plug2Typec();
    }
}
