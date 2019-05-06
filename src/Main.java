import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What number shall i count to today?");
		int userNumber = input.nextInt();
		for (int i = 0; i <= userNumber; i++) {
			System.out.print(i + " ");
		}

		char tempVar = 'b';
		int countA = 0;
		System.out.println();
		System.out.println("Give me a string and I will count the a's \n");
		input.nextLine();
		String userInput = input.nextLine();
		for (int i = 0; i <= userInput.length() - 1; i++) {
			tempVar = userInput.toLowerCase().charAt(i);
			if (tempVar == 'a') {
				countA++;

			}

		}
		System.out.println(countA);

		// input.nextLine();
		System.out.println("Enter a sting and I will make it backwards");
		// input.nextLine();
		String userString = input.nextLine();
		for (int i = userString.length() - 1; i >= 0; i--) {
			System.out.print(userString.charAt(i));

		}

		int userMax = 0;
		int userMin = 2147483647;

		for (int i = 0; i < 4; i++) {

			System.out.println("PLease enter an Integer");
			int userInt = input.nextInt();
			if (userMax < userInt) {
				userMax = userInt;
			}
			if (userMin > userInt) {
				userMin = userInt;
			}
		}
		System.out.println(userMax + " is the Max Value entered");
		System.out.println(userMin + " is the Min Value Entered");
		
		input.close();

	}

}
