package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {

		if (appliance.size() == 0) {
			System.out.println("Not found");
		} else {
			System.out.println("Found " + appliance.size() + " appliance(s)");
			for (Appliance app : appliance) {
				System.out.println(app.toString());
			}
		}
	}

	// you may add your own code here

}
