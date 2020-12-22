package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;

public interface ApplianceFactory {

	Appliance createElectronic(String[] value);
}
