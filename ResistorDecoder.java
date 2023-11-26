import java.util.Scanner;

public class ResistorDecoder {
	
	public static int decodeResistance(String[] colors) {
        int value = 0;

        // Loop through the first two colors (bands)
        for (int i = 0; i < Math.min(colors.length, 2); i++) {
            switch (colors[i].toLowerCase()) {
                case "black":
                    value = value * 10 + 0;
                    break;
                case "brown":
                    value = value * 10 + 1;
                    break;
                case "red":
                    value = value * 10 + 2;
                    break;
                case "orange":
                    value = value * 10 + 3;
                    break;
                case "yellow":
                    value = value * 10 + 4;
                    break;
                case "green":
                    value = value * 10 + 5;
                    break;
                case "blue":
                    value = value * 10 + 6;
                    break;
                case "violet":
                    value = value * 10 + 7;
                    break;
                case "grey":
                    value = value * 10 + 8;
                    break;
                case "white":
                    value = value * 10 + 9;
                    break;
                default:
                    System.out.println("Invalid color: " + colors[i]);
                    return -1; // Invalid color
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter resistor colors (space-separated): ");
        String input = scanner.nextLine();

        // Split input into an array of color names
        String[] colors = input.split("\\s+");

        int resistanceValue = decodeResistance(colors);

        if (resistanceValue != -1) {
            System.out.println("Resistance value: " + resistanceValue);
        }

        scanner.close();
    }

}
