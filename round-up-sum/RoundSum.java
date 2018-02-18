/*For this problem, we'll round an int value up to the next multiple of 10 
 * if its rightmost digit is 5 or more, so 15 rounds up to 20. 
 * Alternately, round down to the previous multiple of 10 
 * if its rightmost digit is less than 5, so 12 rounds down to 10. 
 * Given 3 ints, a b c, return the sum of their rounded values. */

package problemroundsum;

public class RoundSum {
	public static void main(String[] args) {
		int a = 16;
		int b = 4;
		int c = 12;
		
		System.out.println(round10(a) + round10(b) + round10(c));
		
	}
	
	public static int round10(int num) {
		int result = 0;
		if(num < 10) {
			if(10 - num <= 5) {
				result = 10;
			}
		} else {
			if(num % 10 >= 5) result = (int) (10 * Math.ceil(num/10.0));
			else result = (int) (10 * Math.floor(num/10.0));
		}
		return result;
	} 

}
