package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.factory.ApplianceFactory;
import by.tc.task01.factory.LaptopFactory;
import by.tc.task01.factory.OvenFactory;
import by.tc.task01.factory.PCFactory;
import by.tc.task01.factory.RefrigeratorFactory;
import by.tc.task01.factory.SpeakersFactory;
import by.tc.task01.factory.VacuumCleanerFactory;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws FileNotFoundException, IOException {
		List<Appliance> appliances = new ArrayList<Appliance>();

		String[] criterions = criteria.getCriterion();

		File file = new File("resources\\appliances_db.txt");

		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = in.readLine()) != null) {
				if (line.contains(criterions[0] + " ")) {

					boolean isTrue = false;
					for (int i = 1; i < criterions.length; i++) {

						if (line.contains(criterions[i] + ",") || line.contains(criterions[i] + ";")) {
							isTrue = true;
						} else {
							isTrue = false;
							break;
						}
					}
					if (isTrue) {
						ApplianceFactory factory;

						factory = getAppliance(criterions[0]);
						appliances.add(factory.createElectronic(stringToArrayOfValues(line)));
					}
				}
			}
		}

		return appliances;
	}

	public String[] stringToArrayOfValues(String s) {

		String newS = s.replaceAll(",|:|;", "");
		String[] arr = newS.split("\\s+");

		String[] val = new String[arr.length - 1];
		for (int i = 0; i < val.length; i++) {
			String[] temp = arr[i + 1].split("=");
			val[i] = temp[1];
		}
		return val;
	}

	public ApplianceFactory getAppliance(String type) {

		switch (type) {
		case "Oven":
			return new OvenFactory();
		case "Laptop":
			return new LaptopFactory();
		case "Refrigerator":
			return new RefrigeratorFactory();
		case "TabletPC":
			return new PCFactory();
		case "Speakers":
			return new SpeakersFactory();
		case "VacuumCleaner":
			return new VacuumCleanerFactory();
		default:
			return null;
		}
	}
}