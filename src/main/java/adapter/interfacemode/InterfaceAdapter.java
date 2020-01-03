package adapter.interfacemode;

/**
 * Author:Created by wx on 2020/1/3
 * Desc:
 */
public interface InterfaceAdapter {

    void plug();

    /**
     * type-c转usb
     */
    void typec2Usb();

    /**
     * usb转typec
     */
    void usb2Typec();

    /**
     * typec转插筒
     */
    void typec2Plug();

    /**
     * 插筒转typec
     */
    void plug2Typec();
}
