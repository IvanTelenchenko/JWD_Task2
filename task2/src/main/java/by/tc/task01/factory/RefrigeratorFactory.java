package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

//		Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70

		Refrigerator refrigerator = new Refrigerator();

		refrigerator.setPowerConsumption(Integer.parseInt(value[0]));
		refrigerator.setWeight(Integer.parseInt(value[1]));
		refrigerator.setFreezerCapacity(Integer.parseInt(value[2]));
		refrigerator.setOverallCapacity(Integer.parseInt(value[3]));
		refrigerator.setHeight(Integer.parseInt(value[4]));
		refrigerator.setWidth(Integer.parseInt(value[5]));

		return refrigerator;
	}

}