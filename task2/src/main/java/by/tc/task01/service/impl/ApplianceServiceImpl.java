package by.tc.task01.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws FileNotFoundException, IOException {

		if (!Validator.criteriaValidator(criteria)) {
			System.out.println("Not found");
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = applianceDAO.find(criteria);

		return appliances;
	}

}

//you may add your own new classes
