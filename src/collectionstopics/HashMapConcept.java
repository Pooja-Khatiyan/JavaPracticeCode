package collectionstopics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap userMap = new HashMap();it is raw type
		HashMap<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(1, "Pooja");
		userMap.put(2, "Diya");
		userMap.put(3, "Siya");
		userMap.put(4, "Riya");
		userMap.put(5, "Ishqi");
		userMap.put(5, null);// update 5th key
		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("Pooja", "QA");
		empMap.put("Naveen", "SDET");
		empMap.put("Tom", "SDET2");
		empMap.put("Nisha", null);
		empMap.put("Richa", null);
		empMap.put(null, "Manager");// single null is allowed at key :else it update it
		empMap.put(null, "Manager2");
		System.out.println(empMap.get("Pooja"));
		System.out.println(userMap.get(1));
		System.out.println(userMap.get(4));
		System.out.println(userMap.get(6));
		System.out.println(empMap.get("Tom"));
		System.out.println(empMap);
		System.out.println(userMap);
	}

}
