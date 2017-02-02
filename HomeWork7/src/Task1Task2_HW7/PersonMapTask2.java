package Task1Task2_HW7;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class PersonMapTask2 {
	
	private static void sameFirstName(Map<String, String> personMap) {
		int count = 0;
		for(Map.Entry<String, String> entry: personMap.entrySet()){
			String name = entry.getValue();
			for (Map.Entry<String, String> entry1: personMap.entrySet()) {
				if((name.equals(entry1.getValue()))&&(entry != entry1)){
					count++;
				}
			}
		}
		if(count > 0) {
			System.out.println("There are at less two persons with the same firstName among these 10 people");
		}else {
			System.out.println("There is no any persons with the same firstName among these 10 people");
		}
		
	}
	private static void removeSomeFirstName(Map<String, String> personMap, String name) {
		for(Iterator<?> i=personMap.entrySet().iterator(); i.hasNext();){
			//Map.Entry entry =  (Map.Entry) i.next();
			Entry<?, ?> entry =  (Entry<?, ?>) i.next();
			if(name.equals(entry.getValue())){
				i.remove();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("Bila", "Oksana");
		personMap.put("Kogut", "Lesja");
		personMap.put("Grycaj", "Oksana");
		personMap.put("Bojko", "Taras");
		personMap.put("Pylypec", "Viktor");
		personMap.put("Girka", "Orest");
		personMap.put("Pereval", "Bogdan");
		personMap.put("Xlibeckuj", "Severyn");
		personMap.put("Rak", "Oleksij");
		personMap.put("Stovp", "Galyna");
		
		//Output the entities of the map on the screen
		System.out.println(personMap+"\n");
		
		//There are at less two persons with the same firstName among these 10 people?
		sameFirstName(personMap);
		
		//Remove from the map person whose firstName is ”Orest” (or other)
		removeSomeFirstName(personMap, "Orest");
		System.out.println("\n" + personMap);
	}

}
