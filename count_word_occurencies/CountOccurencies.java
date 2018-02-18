/*Count the number of occurrencies of each word in a string*/

package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountOccurencies {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		createMap(map);
		displayMap(map);
	}
	
	private static void createMap(Map<String, Integer> map) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		
		//tokenize the input
		String[] tokens = input.split(" ");
		
		for(String token : tokens) {
			
			String word = token.toLowerCase();
			if(map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count+1);
			} else {
				map.put(word, 1);
			}
		}
	}
	
	private static void displayMap(Map<String, Integer> map) {
		
		Set<String> set = map.keySet();
		
		//sort keys
		TreeSet<String> sortedSet = new TreeSet<>(set);
		
		System.out.println("\nMap contains:\nKeys\t\tValue");
		for(String s : sortedSet) {
			System.out.printf("%-12s%12s%n", s, map.get(s));
		}
	}	

}
