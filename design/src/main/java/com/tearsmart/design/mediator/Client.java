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
  * 客户端
  * </p>
  * @author tear-smart
  * @date 2019/3/28
  */
public class Client {
   public static void main(String[] args) {
       //一个房主、一个租房者、一个中介机构
       MediatorStructure mediator = new MediatorStructure();

       //房主和租房者只需要知道中介机构即可
       HouseOwner houseOwner = new HouseOwner("张三", mediator);
       Tenant tenant = new Tenant("李四", mediator);

       //中介结构要知道房主和租房者
       mediator.setHouseOwner(houseOwner);
       mediator.setTenant(tenant);

       tenant.constact("听说你那里有三室的房主出租.....");
       houseOwner.contact("是的!请问你需要租吗?");
   }
}