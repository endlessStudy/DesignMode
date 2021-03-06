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
 * 目标抽象类/被观察者
 * </p>
 * @author tear-smart
 * @date 2019-03-27
 */
public interface Subject{
   /**
      * 注册观察者
      * @param observer
      */
     public void registerObserver(Observer observer);

     /**
      * 删除观察者
      * @param observer
      */
     public void removeObserver(Observer observer);

     /**
      * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
      */
     public void notifyObserver();
}
