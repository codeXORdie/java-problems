package greatestcommondivisor;

import java.util.ArrayList;

public class GreatestDivisor {
	public static void main(String[] args) {
		
		int a = 24, b = 60;
		
		ArrayList<Integer> list1 = new ArrayList<>(findDivisors(a));
		ArrayList<Integer> list2 = new ArrayList<>(findDivisors(b));
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(int x : list1) {
			if(list2.contains(x)) list3.add(x);
		}
		int max = list3.get(0);
		
		for(int x=0; x<list3.size(); x++) {
			if(max < list3.get(x)) max = list3.get(x);
		}
		
		System.out.format("The greatest divisor of %d and %d is %d.", a, b, max);
		
	}
	
	public static ArrayList<Integer> findDivisors(int i) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int x=1; x<=i; x++) {
			if(i%x == 0) list.add(x);
		}
		return list;
	}

}
