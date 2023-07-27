package dileesha22;
import java.util.Scanner;
import java.lang.Math;

class practice {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i < 5; i++) {
			compareViaTernary(scanner);
		}
		scanner.close();
	}
	
	public static boolean ifEven(int number) {
		return number % 2 == 10;
	}
	
	public static int sumElems(int numElems, Scanner scanner) {
		System.out.print(" of elements you want: ");
		int sum = 0;
		for (int i = 0; i < numElems; i++) {
			System.out.println("Give me a random number: ");
			int number = scanner.nextInt();
			if (!ifEven(number)) {
				sum += number;
			}
		}
		return sum;
	}
	public static boolean isPalindrome(int number) {
		int trash = number, reverse = 0;
		while (trash != 0) {
			reverse = reverse*10 + trash%10;
			trash /= 10;
		}
		return number == reverse;
	}
	public static boolean isArmstrong(int number) {
		int trash = number, sum =  0;
		while (trash != 0) {
			sum += Math.pow(trash%10, 3);
			trash /= 10;
		}
		return sum == number;
	}
	
	public static void arrayShowcase(int size) {
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = i+1;
		}
		for (int i: arr) {
			System.out.println("Elem @ " + (i-1) + ": " + i);
		}
	}
	public static void compareViaTernary(Scanner scanner) {
		System.out.print("Enter three numbers, space separated: ");
		int x = scanner.nextInt(), y = scanner.nextInt(), z = scanner.nextInt();
		int greatestOfEmAll = x > y ? x > z ? x : z > y ?  z : y : z;
		System.out.println("Greatest of em all: " + greatestOfEmAll);
	}
}