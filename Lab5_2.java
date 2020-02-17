import java.util.Scanner;
public class Lab5_2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an intiger --> ");
		int number = scanner.nextInt();
		
		//Question 1
		System.out.println("Is " + number + " divisible by 5 & 6?");
		if (number % 5 == 0 && number % 6 == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//Question 2
		System.out.println("Is " + number + " divisible by 5 or 6?");
		if (number % 5 == 0 || number % 6 == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
				}
		
		//Question 3
		System.out.println("Is " + number + " divisible by 5 or 6, but not both?");
		if (number % 5 == 0 ^ number % 6 == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
				}
		
	}

}
