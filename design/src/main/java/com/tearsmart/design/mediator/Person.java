package com.tearsmart.design.mediator;

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
 * 具体同事类
 * </p>
 * @author tear-smart
 * @date 2019-03-28
 */
public abstract class Person {
    protected String name;
    protected AbstractMediator mediator;

    Person(String name, AbstractMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
