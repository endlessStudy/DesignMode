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
  具体中介者实现类
 * </p>
 * @author tear-smart
 * @date 2019/3/28
 */
public class MediatorStructure implements AbstractMediator {
    /**
     * 首先中介结构必须知道所有房主和租房者的信息
     */
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        //如果是房主，则租房者获得信息
        if (person == houseOwner) {
            houseOwner.getMessage(message);
        } else {       //反正则是房主获得信息
            tenant.getMessage(message);
        }
    }
}