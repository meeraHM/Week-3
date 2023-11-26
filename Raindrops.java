import java.util.Scanner;

public class Raindrops {
	
	public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }

        // If the result is empty, append the digits of the number
        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = convert(number);
        System.out.println(result);

        scanner.close();
    }

}
