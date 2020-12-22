package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object getValue(String key) {
		return criteria.get(key);
	}

	public String[] getCriterion() {
		String[] criterions = new String[criteria.size() + 1];

		criterions[0] = groupSearchName;

		int i = 1;
		for (Map.Entry<String, Object> map : criteria.entrySet()) {
			criterions[i] = map.getKey().toString() + "=" + map.getValue().toString();
			i++;
		}
		return criterions;
	}

	public boolean containsKey(String key) {
		if (criteria.containsKey(key)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean containsValue(String value) {
		if (criteria.containsKey(value)) {
			return true;
		} else {
			return false;
		}
	}
}