package tp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import logic.Person;



public class Collections {

	public Collections() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		Set<Person> personHashSet = new HashSet<Person>();
		Map<String,Person> personHashMap = new HashMap<String, Person>();
		Random rand = new Random();
		
		for (int i=0; i<101; i++) {
			int  n = rand.nextInt(50);
			myList.add(n);
			System.out.println("Element " + i + " is " + myList.get(i));
		}
		
		Person p1 = new Person("Paulo","Pimenta",36);
		Person p2 = new Person("Blue","Demon",34);
		Person p3 = new Person("El","Santo",30);
		Person p4 = new Person("Mil","Mascaras",44);
		Person p5 = new Person("Roberto","Bolanos",44);
		
		personHashSet.add(p1);	
		personHashSet.add(p2);
		personHashSet.add(p3);
		personHashSet.add(p4);
		personHashSet.add(p5);
		// Ignore repeated
		personHashSet.add(p5);
		
		personHashMap.put("Good",p1);
		personHashMap.put("Excelent",p2);
		personHashMap.put("Poor",p3);
		personHashMap.put("Fair",p4);
		personHashMap.put("Average",p5);


		
		//personHashSet.add(new Person("Paulo","Pimenta",36));
		//personHashSet.add(new Person("Blue","Demon",34));
		//personHashSet.add(new Person("El","Santo",30));
		//personHashSet.add(new Person("Mil","Mascaras",44));
		//personHashSet.add(new Person("Mil","Mascaras",44));
		
		for(Person person: personHashSet) {
			System.out.println(person);
		}
		
		for(String rate: personHashMap.keySet()) {
			System.out.println("Rate: " + rate + " -> person : " + personHashMap.get(rate));
		}
		
		
	}

}
