package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

		Laptop laptop = new Laptop();

//		Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18

		laptop.setBatteryCapacity(Double.parseDouble(value[0]));
		laptop.setOS(value[1]);
		laptop.setMemoryRom(Integer.parseInt(value[2]));
		laptop.setSystemMemory(Integer.parseInt(value[3]));
		laptop.setCPU(Double.parseDouble(value[4]));
		laptop.setDisplayInchs(Integer.parseInt(value[5]));
		return laptop;
	}
}
