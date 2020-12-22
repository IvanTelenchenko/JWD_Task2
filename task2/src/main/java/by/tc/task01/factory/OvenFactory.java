package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

//		Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;

		Oven oven = new Oven();
		oven.setPowerConsumption(Integer.parseInt(value[0]));
		oven.setWeight(Integer.parseInt(value[1]));
		oven.setCapacity(Integer.parseInt(value[2]));
		oven.setDepth(Integer.parseInt(value[3]));
		oven.setHeight(Double.parseDouble(value[4]));
		oven.setWidth(Double.parseDouble(value[5]));
		return oven;
	}
}
