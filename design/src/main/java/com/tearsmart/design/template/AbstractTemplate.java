package com.tearsmart.design.template;

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
 * 模版模式抽象类
 *
 * </p>
 * @author tear-smart
 * @date 2019-03-27
 */
public abstract class AbstractTemplate {
    public void byTrain() {
        buyTicket();
        checkedTicket();
        getOnTheTrain();
    }

    public void buyTicket() {
        System.out.println("买票:\n" +
                "    1.告诉工作人员目的地\n" +
                "    2.身份证+钱");
    }

    /**
     * 根据不同类型的车票选择不同的检票方式
     */
    public abstract void checkedTicket();

    public void getOnTheTrain() {
        //找座位
        System.out.println("上车:");
        System.out.println("    找座位坐下");
    }

}
