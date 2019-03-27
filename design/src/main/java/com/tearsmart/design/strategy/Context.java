package com.tearsmart.design.strategy;

import lombok.Data;

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
 * 策略模式环境类
 * </p>
 * @author tear-smart
 * @date 2019-03-26
 */
@Data
class Context {
    private IStrategy strategy;

    Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    void getOperator() {
        this.strategy.operator();
    }
}
