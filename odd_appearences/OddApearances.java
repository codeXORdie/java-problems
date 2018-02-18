package plusOut;
import java.util.ArrayList;

public class OddApearances {
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		
		for(int x=0; x<arr.length; x++) {
			int check = arr[x];
			for(int i : arr) {
				if(list.contains(check)) break;
				if(arr[x] == i) count++;
			}
			if(count%2 != 0) list.add(check);
			count = 0;
		}
		System.out.println(list.toString());
	}

}
