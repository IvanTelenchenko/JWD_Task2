package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		switch (criteria.getGroupSearchName()) {
		case "Oven":
			return checkOven(criteria);
		case "Laptop":
			return checkLaptop(criteria);
		case "Refrigerator":
			return checkRefrigerator(criteria);
		case "Speakers":
			return checkSpeakers(criteria);
		case "TabletPC":
			return checkTabletPC(criteria);
		case "VacuumCleaner":
			return checkVacuumCleaner(criteria);
		default:
			return false;
		}
	}

//	Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;
	public static boolean checkOven(Criteria criteria) {
		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 100000) {
				return false;
			}
		}

		if (criteria.containsKey("WEIGHT")) {
			if (Integer.parseInt(criteria.getValue("WEIGHT").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("WEIGHT").toString()) >= 200) {
				return false;
			}
		}

		if (criteria.containsKey("CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("CAPACITY").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("DEPTH")) {
			if (Integer.parseInt(criteria.getValue("DEPTH").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("DEPTH").toString()) >= 200) {
				return false;
			}
		}

		if (criteria.containsKey("HEIGHT")) {
			if (Double.parseDouble(criteria.getValue("HEIGHT").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("HEIGHT").toString()) >= 300) {
				return false;
			}
		}

		if (criteria.containsKey("WIDTH")) {
			if (Double.parseDouble(criteria.getValue("WIDTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("WIDTH").toString()) >= 200) {
				return false;
			}
		}

		return true;
	}

//	Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18
	public static boolean checkLaptop(Criteria criteria) {
		if (criteria.containsKey("MEMORY_ROM")) {
			if (Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) >= 50000) {
				return false;
			}
		}

		if (criteria.containsKey("SYSTEM_MEMORY")) {
			if (Integer.parseInt(criteria.getValue("SYSTEM_MEMORY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("SYSTEM_MEMORY").toString()) >= 10000) {
				return false;
			}
		}

		if (criteria.containsKey("DISPLAY_INCHS")) {
			if (Integer.parseInt(criteria.getValue("DISPLAY_INCHS").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("DISPLAY_INCHS").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("CPU")) {
			if (Double.parseDouble(criteria.getValue("CPU").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("CPU").toString()) >= 10) {
				return false;
			}
		}

		if (criteria.containsKey("BATTERY_CAPACITY")) {
			if (Double.parseDouble(criteria.getValue("BATTERY_CAPACITY").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("BATTERY_CAPACITY").toString()) >= 20000) {
				return false;
			}
		}

		return true;
	}

//	Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70
	public static boolean checkRefrigerator(Criteria criteria) {

		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 50000) {
				return false;
			}
		}

		if (criteria.containsKey("WEIGHT")) {
			if (Integer.parseInt(criteria.getValue("WEIGHT").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("WEIGHT").toString()) >= 10000) {
				return false;
			}
		}

		if (criteria.containsKey("FREEZER_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("FREEZER_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("FREEZER_CAPACITY").toString()) >= 10000) {
				return false;
			}
		}

		if (criteria.containsKey("OVERALL_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("OVERALL_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("OVERALL_CAPACITY").toString()) >= 10000) {
				return false;
			}
		}

		if (criteria.containsKey("HEIGHT")) {
			if (Double.parseDouble(criteria.getValue("HEIGHT").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("HEIGHT").toString()) >= 300) {
				return false;
			}
		}

		if (criteria.containsKey("WIDTH")) {
			if (Double.parseDouble(criteria.getValue("WIDTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("WIDTH").toString()) >= 200) {
				return false;
			}
		}

		return true;
	}

//	Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
	public static boolean checkSpeakers(Criteria criteria) {

		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 50000) {
				return false;
			}
		}

		if (criteria.containsKey("NUMBER_OF_SPEAKERS")) {
			if (Integer.parseInt(criteria.getValue("NUMBER_OF_SPEAKERS").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("NUMBER_OF_SPEAKERS").toString()) >= 10000) {
				return false;
			}
		}

		if (criteria.containsKey("CORD_LENGTH")) {
			if (Double.parseDouble(criteria.getValue("CORD_LENGTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("CORD_LENGTH").toString()) >= 10) {
				return false;
			}
		}

		return true;
	}

//	TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue	
	public static boolean checkTabletPC(Criteria criteria) {

		if (criteria.containsKey("DISPLAY_INCHES")) {
			if (Integer.parseInt(criteria.getValue("DISPLAY_INCHES").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("DISPLAY_INCHES").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("MEMORY_ROM")) {
			if (Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("FLASH_MEMORY_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("FLASH_MEMORY_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("FLASH_MEMORY_CAPACITY").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("BATTERY_CAPACITY")) {
			if (Double.parseDouble(criteria.getValue("BATTERY_CAPACITY").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("BATTERY_CAPACITY").toString()) >= 10000) {
				return false;
			}
		}

		return true;
	}

//	VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20
	public static boolean checkVacuumCleaner(Criteria criteria) {

		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 1000) {
				return false;
			}
		}

		if (criteria.containsKey("CLEANING_WIDTH")) {
			if (Integer.parseInt(criteria.getValue("CLEANING_WIDTH").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("CLEANING_WIDTH").toString()) >= 100) {
				return false;
			}
		}

		if (criteria.containsKey("MOTOR_SPEED_REGULATION")) {
			if (Integer.parseInt(criteria.getValue("MOTOR_SPEED_REGULATION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MOTOR_SPEED_REGULATION").toString()) >= 100) {
				return false;
			}
		}

		return true;
	}
}