package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class PCFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

//		TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue
		TabletPC pc = new TabletPC();

		pc.setBatteryCapacity(Double.parseDouble(value[0]));
		pc.setDisplayInches(Integer.parseInt(value[1]));
		pc.setMemoryRom(Integer.parseInt(value[2]));
		pc.setFlashMemoryCapacity(Integer.parseInt(value[3]));
		pc.setColor(value[4]);

		return pc;
	}

}
