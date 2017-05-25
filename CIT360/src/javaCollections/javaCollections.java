package javaCollections;
import java.util.*;

public class javaCollections {
 
	public static void main(String[] args) {
		
		
		Map();
		List();
		Set();
		Tree();
		
	}

	

	public static void Map() {
		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("BMW", "1");
		myMap.put("Mercedes", "2");
		myMap.put("Honda", "3");
		myMap.put("Toyota", "4");
		myMap.put("Kia", "5");
		myMap.put("Hyundai", "6");
		System.out.println("Car Names (using a HashMap)");
		System.out.println("\t" + myMap);
		
	
		myMap.remove("Kia");
		System.out.println("\t" + myMap);
		
	
		myMap.put("Lemons", "20");
		System.out.println("\t" + myMap);
		


	}
	
	public static void List() {
		List<Object> myList = new ArrayList<>();
		myList.add("Hannah");
		myList.add("Bob");
		myList.add("Kaylee");
		myList.add("Bill");
		myList.add("Beth");
		myList.add("Joe");
		System.out.println();
		System.out.println("These are some names! (Using an ArrayList)");
		System.out.println("\t" + myList);
		
		myList.add("Carissa");
		System.out.println("Added the name Carissa");
		System.out.println("\t" + myList);
		
		myList.remove("Bob");
		System.out.println("Subtracted the name Bob");
		System.out.println("\t" + myList);
		
		Iterator<Object> iterator = myList.iterator();
		while(iterator.hasNext()) {
			String myString = (String) iterator.next();
			System.out.println(myString);
		}
	}
	
	
	public static void Set() {
		Set<String> mySet = new LinkedHashSet<String>();
		mySet.add("Goblet of Fire");
		mySet.add("Prisoner of Azkaban");
		mySet.add("Sorcerer's Stone");
		mySet.add("Half Blood Prince");
		mySet.add("Chamber of Secrets");
		mySet.add("Order of the Phoenix");
		System.out.println();
		System.out.println("Harry Potter Books (using a SET)");
		System.out.println("\t" + mySet);
		
		System.out.println("Removed Goblet of Fire");
		mySet.remove("Goblet of Fire");
		System.out.println("\t" + mySet);
		
		System.out.println("Added Half Blood Prince 2");
		mySet.add("Half Blood Prince 2");
		System.out.println("\t" + mySet);
		
		Iterator<String> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			String myString = (String) iterator.next();
			System.out.println(myString);
		}
	}
	public static void Tree() {
		TreeSet<String> myTree = new TreeSet<String>();
		myTree.add("Snickers");
		myTree.add("Milky-Way");
		myTree.add("Kit-Kat");
		myTree.add("Mars");
		myTree.add("Crunch");
		System.out.println();
		System.out.println("Some candy bars!");
		System.out.println("\t" + myTree);
	}
}
