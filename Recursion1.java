package recursion;

public class Recursion1 {
	
	public static void main(String[] args) {
		
		//printNum(6);
		//System.out.println(getEyes(155));
		//System.out.println(pow(2, 2));
		//System.out.println(factorial(5));
		//System.out.println(from1toN(10));
		//System.out.println(fromAtoB(12, 5));
		//isPow(456);
		//System.out.println("Sum of 341: " + sumOfNums(341));
		System.out.println(remindersInReversOrder(7654321));
		
	}
	
	public static void printNum(int n) {
		if(n == 0) return;
		System.out.println(n);
		printNum(n - 1);
	}
	
	public static int getEyes(int cats) {
		if(cats == 0) return 0;
		return 2 + getEyes(cats - 1);
	}
	
	public static int pow(int base, int value) {
		if(value == 0) return base;
		return base * pow(base, value-1);		
	}
	
	public static long factorial(int num) {
		if(num == 1) return 1;
		long result = num * (factorial(num-1));
		return result;
	}
	
	//Дано натуральное число n. Выведите все числа от 1 до n.
	public static String from1toN(int n) {
		if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return from1toN(n - 1) + " " + n;
	}
	
	//Даны два целых числа A и В (каждое в отдельной строке). 
	//Выведите все числа от A до B включительно, в порядке возрастания, 
	//если A < B, или в порядке убывания в противном случае.
	public static int fromAtoB(int a, int b) {
		
		if(a == b) return b;
		System.out.println(a);
		if(a < b) {	
			return fromAtoB(a+1, b);
		}
		return fromAtoB(a-1, b);
	}
	
	
	//Дано натуральное число N. 
	//Выведите слово YES, если число N является точной степенью двойки, 
	//или слово NO в противном случае.
	public static void isPow(double num) {
		if(num == 2) {
			System.out.println("Yes");
			return;
		} else if(num < 2) {
			System.out.println("No");
			return;
		}
		isPow(num/2);
	}
	
	//Дано натуральное число N. Вычислите сумму его цифр.
	public static int sumOfNums(int n) {
		if(n < 10) return n;
		return n%10 + sumOfNums(n/10);
	}
	
	//Дано натуральное число N. Выведите все его цифры по одной, 
	//в обратном порядке, разделяя их пробелами или новыми строками.
	//При решении этой задачи нельзя использовать строки, списки, 
	//массивы (ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика. 
	public static String remindersInReversOrder(int num) {
		if(num < 10) return "" + num;
		return num%10 + " " + (remindersInReversOrder(num/10));
	}

}
