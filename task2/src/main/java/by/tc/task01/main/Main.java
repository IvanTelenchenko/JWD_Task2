package by.tc.task01.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		appliances = service.find(criteriaOven);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(Laptop.OS.toString(), "Linux");

		appliances = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop2 = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop2.add(Laptop.OS.toString(), "Mac");

		appliances = service.find(criteriaLaptop2);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
		criteriaRefrigerator.add(Refrigerator.WEIGHT.toString(), 20);
		criteriaLaptop2.add(Refrigerator.HEIGHT.toString(), 200);

		appliances = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION.toString(), 15);

		appliances = service.find(criteriaSpeakers);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaPc = new Criteria(TabletPC.class.getSimpleName());
		criteriaPc.add(TabletPC.DISPLAY_INCHES.toString(), 15);
		criteriaPc.add(TabletPC.COLOR.toString(), "red");

		appliances = service.find(criteriaPc);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaCleaner.add(VacuumCleaner.POWER_CONSUMPTION.toString(), 100);

		appliances = service.find(criteriaCleaner);
		PrintApplianceInfo.print(appliances);
	}
}