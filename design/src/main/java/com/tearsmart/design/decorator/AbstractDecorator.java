package com.tearsmart.design.decorator;

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
 *  定义装饰者 /'dekəreɪtə/
 * </p>
 * @author tear-smart
 * @date 2019-03-26
 */
public abstract class AbstractDecorator implements Human{
    private Human human;

	AbstractDecorator(Human human) {
		System.out.println("AbstractDecorator");
		this.human = human;
	}

	protected AbstractDecorator() {
		System.out.println("AbstractDecorator no-args");
	}

	@Override
	public void wearClothes() {
		human.wearClothes();
	}

	@Override
	public void walkToWhere() {
		human.walkToWhere();
	}
}
