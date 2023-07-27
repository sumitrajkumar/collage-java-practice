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
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static int sumElems(Scanner scanner) {
		int sum = 0;
		System.out.print("Enter the number of elements you want: ");
		int numElems = scanner.nextInt();
		for (int i = 0; i < numElems; i++) {
			System.out.println("Give me a random number: ");
			int number = scanner.nextInt();
			if (!ifEven(number)) {
				sum += number;
			}
		}
		return sum;
	}
	public static void isPalindrome(Scanner scanner) {
		System.out.print("Enter a number to check if it's palindrome: ");
		int number = scanner.nextInt(), reverse = 0;
		int trash = number;
		while (trash != 0) {
			reverse = reverse*10 + trash%10;
			trash /= 10;
		}
		if (number == reverse) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number was never a palindrome");
		}
	}
}