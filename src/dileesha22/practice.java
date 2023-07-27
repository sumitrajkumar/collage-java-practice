package dileesha22;
import java.util.Scanner;
import java.lang.Math;

class practice {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int trash = number, sum =  0;
		while (trash != 0) {
			sum += Math.pow(trash%10, 3);
			trash /= 10;
		}
		if (sum == number) {
			System.out.println("This number is an armstrong number");
		} else {
			System.out.println("This number was never an armstrong number");
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
}