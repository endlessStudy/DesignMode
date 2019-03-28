package com.tearsmart.design.observer;

/**
 * <p>
 * |****************************** *_* ******************************|
 * |   __                                                      __    |
 * | _/  |_  ____ _____ _______    ______ _____ _____ ________/  |_  |
 * | \   __\/ __ \\__  \\_  __ \  /  ___//     \\__  \\_  __ \   __\ |
 * |  |  | \  ___/ / __ \|  | \/  \___ \|  Y Y  \/ __ \|  | \/|  |   |
 * |  |__|  \___  >____  /__|    /____  >__|_|  (____  /__|   |__|   |
 * |            \/     \/             \/      \/     \/              |
 * |                                                                 |
 * |****************************** *_* ******************************|
 * </p>
 * @author tear-smart
 * @date 2019-03-27
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new MsgAdvice("liu");
        Observer observer2 = new MsgAdvice("wang");
        Observer observer3 = new MsgAdvice("wu");
        Wechat wechat = new Wechat();
        wechat.registerObserver(observer1);
        wechat.registerObserver(observer2);
        wechat.registerObserver(observer3);
        wechat.sendMsg("hello world");
    }
}
