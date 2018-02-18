/* Find the element of an array that appears odd time */

package plusOut;
import java.util.ArrayList;

public class PlusOut {
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int x=0; x<arr.length; x++) {
			int check = arr[x];
			for(int i : arr) if(i == check) count++;
			if(count%2 != 0) {
				if(!list.contains(check)) list.add(check);
			}
			count = 0;
		}
		System.out.println(list.toString());
	}

}
