package homework6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class PersonMap {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Zinchenko", "Eugene");
		personMap.put("Shevchenko", "Andriy");
		personMap.put("Kovalenko", "Viktor");
		personMap.put("Zozulya", "Roman");
		personMap.put("Stepanenko", "Taras");
		personMap.put("Iarmolenko", "Andriy");
		personMap.put("Konoplyanka", "Eugene");
		personMap.put("Pyatov", "Andriy");
		personMap.put("Rakitskiy", "Yaroslav");
		personMap.put("Rotan", "Ruslan");
	System.out.println(personMap);
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " "	+ entry.getValue());
			}
		
		int count = 0;
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
				if ((entry.getValue() == entry2.getValue())&&(entry.getKey()!=entry2.getKey())) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("There are at less two persons with the same firstName");
		}
		else{
			System.out.println("No two persons with the same firstName");
		}
		
		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();){
			   Map.Entry entry = (Map.Entry) i.next();
					if (entry.getValue() == "Eugene") {
						i.remove();
				}
			}
		System.out.println(personMap);


	}

}
