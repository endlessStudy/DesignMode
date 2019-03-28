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
public class Tenant extends Person{

   Tenant(String name, AbstractMediator mediator) {
       super(name, mediator);
   }

   /**
    * @desc 与中介者联系
    * @param message
    * @return void
    */
   public void constact(String message){
       mediator.contact(message, this);
   }

   /**
    * @desc 获取信息
    * @param message
    * @return void
    */
   public void getMessage(String message){
       System.out.println("租房者:" + name +",获得信息：" + message);
   }
}