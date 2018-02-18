package greatestcommondivisor;

public class GCDEuclidian {
	public static void main(String[] args) {
		int a = 60;
		int b = 24;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		while(min != 0) {
			int holdMin = min;
			min = max%min;
			max = holdMin;
			
			if(min == 0) System.out.println(max);
		}	
	}
}
