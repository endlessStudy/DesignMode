package com.tearsmart.design.observer;

import lombok.Data;

import java.util.Observable;


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
@Data
public class MsgAdvice implements Observer{
    private String name;

    public MsgAdvice(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "接受到的消息为: " + msg);
    }

}
