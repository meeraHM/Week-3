import java.util.Scanner;

public class NumberToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] values = {
	                1000, 900, 500, 400,
	                100, 90, 50, 40,
	                10, 9, 5, 4,
	                1
	        };
	        String[] symbols = {
	                "M", "CM", "D", "CD",
	                "C", "XC", "L", "XL",
	                "X", "IX", "V", "IV",
	                "I"
	        };

	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < values.length; i++) {
	            while (num >= values[i]) {
	                num -= values[i];
	                result.append(symbols[i]);
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number (1 to 3999): ");
	        int number = scanner.nextInt();

	        if (number >= 1 && number <= 3999) {
	            String romanNumeral = intToRoman(number);
	            System.out.println("Roman numeral: " + romanNumeral);
	        } else {
	            System.out.println("Number out of range. Please enter a number between 1 and 3999.");
	        }

	        scanner.close();
	    }

	}

}
