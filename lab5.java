import java.util.Scanner;
public class lab5 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 3 digit intiger --> ");
		int number = scanner.nextInt();
		
		int one = number / 100;
		int two = number % 10;
		
		if (one == two) {
			System.out.println(number + " is a palindrome");
		}else {
				System.out.println(number + " is not a palindrome");
			}
		}
		
	}


