package com.hspedu.interface_;

public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.printf("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.printf("手机停止工作");
    }
}
