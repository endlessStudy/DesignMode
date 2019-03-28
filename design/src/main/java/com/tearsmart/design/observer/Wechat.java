package com.tearsmart.design.observer;

import java.util.ArrayList;
import java.util.List;

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
 * java8 已经实现了一套观察者模式
 * 其中change 属性,可以通过setChange()方法,手动控制当前变化是否通知观察者
 * </p>
 * @author tear-smart
 * @date 2019-03-27
 */
public class Wechat implements Subject{
    private List<Observer> obs;
    private String msg;
    public Wechat(){
        obs = new ArrayList<>();
    }

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        obs.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        obs.remove(observer);
    }

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    @Override
    public void notifyObserver() {
        obs.forEach(e -> e.update(msg));
    }

    public void sendMsg(String msg){
        this.msg = msg;
        notifyObserver();
    }
}
