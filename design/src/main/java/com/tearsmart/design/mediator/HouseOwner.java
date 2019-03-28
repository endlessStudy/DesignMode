package com.tearsmart.design.mediator;

/**
  * <p>
  *|****************************** *_* ******************************|
  *|   __                                                      __    |
  *| _/  |_  ____ _____ _______    ______ _____ _____ ________/  |_  |
  *| \   __\/ __ \\__  \\_  __ \  /  ___//     \\__  \\_  __ \   __\ |
  *|  |  | \  ___/ / __ \|  | \/  \___ \|  Y Y  \/ __ \|  | \/|  |   |
  *|  |__|  \___  >____  /__|    /____  >__|_|  (____  /__|   |__|   |
  *|            \/     \/             \/      \/     \/              |
  *|                                                                 |
  *|****************************** *_* ******************************|
 * 具体同事类
  * </p>
  * @author tear-smart
  * @date 2019/3/28
  */
public class HouseOwner extends Person {

    HouseOwner(String name, AbstractMediator mediator) {
        super(name, mediator);
    }

    /**
     * @param message
     * @return void
     * @desc 与中介者联系
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    /**
     * @param message
     * @return void
     * @desc 获取信息
     */
    public void getMessage(String message) {
        System.out.println("房主:" + name + ",获得信息：" + message);
    }
}