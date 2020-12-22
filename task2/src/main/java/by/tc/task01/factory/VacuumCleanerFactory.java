package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

		VacuumCleaner cleaner = new VacuumCleaner();

//		VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20

		cleaner.setPowerConsumption(Integer.parseInt(value[0]));
		cleaner.setFilterType(value[1]);
		cleaner.setBagType(value[2]);
		cleaner.setWandType(value[3]);
		cleaner.setMotorSpeedRegulation(Integer.parseInt(value[4]));
		cleaner.setCleaningWidth(Integer.parseInt(value[5]));

		return cleaner;
	}

}
